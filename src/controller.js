const axios = require("axios");
const cheerio = require("cheerio");

const baseUrl = "https://otakudesu.cloud";

async function getOngoingAnime(req, res) {
  const page = req.params.page;
  let url =
    page === 1
      ? `${baseUrl}/ongoing-anime`
      : `${baseUrl}/ongoing-anime/page/${page}`;
  try {
    const response = await axios(url);
    if (response.status === 200) {
      const $ = cheerio.load(response.data);
      const element = $(".rapi");
      let ongoing = [];
      let title, thumb, episode, updated_on, updated_day, endpoint;
      element.find("ul > li").each((_, el) => {
        title = $(el).find("h2").text().trim();
        thumb = $(el).find("img").attr("src");
        episode = $(el).find(".epz").text().trim();
        updated_on = $(el).find(".newnime").text().trim();
        updated_day = $(el).find(".epztipe").text().trim();
        endpoint = $(el)
          .find(".thumb > a")
          .attr("href")
          .replace(`${baseUrl}/anime/`, "")
          .replace("/", "");
        ongoing.push({
          title,
          thumb,
          episode: parseInt(episode.replace("Episode ", ""), 10) || 0,
          updated_on,
          updated_day,
          endpoint,
        });
      });
      return res.send({
        success: true,
        message: "success",
        currentPage: page,
        ongoing,
      });
    }
    return res.send({
      success: false,
      message: response.status,
      ongoing: [],
    });
  } catch (error) {
    console.log(error);
    res.send({
      success: false,
      message: error,
      ongoing: [],
    });
  }
}

module.exports = { getOngoingAnime };
