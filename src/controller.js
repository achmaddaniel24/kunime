const axios = require("axios");
const cheerio = require("cheerio");

const baseUrl = "https://otakudesu.cloud";

async function getOngoingAnime(req, res) {
  const page = req.params.page;
  const url =
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
      return res.status(200).json({
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

async function searchAnime(req, res) {
  const query = req.params.query;
  const url = `${baseUrl}/?s=${query}&post_type=anime`;
  try {
    const response = await axios(url);
    if (response.status === 200) {
      const $ = cheerio.load(response.data);
      const element = $(".page");
      let search = [];
      let title, thumb, genres, status, rating, endpoint;
      element.find("li").each((_, el) => {
        title = $(el).find("h2 > a").text();
        thumb = $(el).find("img").attr("src");
        genres = $(el)
          .find(".set > a")
          .text()
          .match(/[A-Z][a-z]+/g);
        status =
          $(el).find(".set").text().match("Ongoing") ||
          $(el).find(".set").text().match("Completed");
        rating = $(el).find(".set").text().replace(/^\D+/g, "") || null;
        endpoint = $(el)
          .find("h2 > a")
          .attr("href")
          .replace(`${baseUrl}/anime/`, "")
          .replace("/", "");
        search.push({
          title,
          thumb,
          genres,
          status,
          rating,
          endpoint,
        });
      });
      return res.status(200).json({
        success: true,
        message: "success",
        query,
        search,
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

module.exports = { getOngoingAnime, searchAnime };
