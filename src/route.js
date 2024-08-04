const route = require("express").Router();
const { getOngoingAnime, searchAnime } = require("./controller");

route.get("/", (_, res) => {
  res.send({
    endpoint: {
      getOngoingAnime: "/api/v1/ongoing/:page",
      getAnimeSearch: "/api/v1/search/:query",
    },
  });
});

route.get("/api/v1/ongoing/:page", getOngoingAnime);
route.get("/api/v1/search/:query", searchAnime);

module.exports = route;
