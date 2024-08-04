const route = require("express").Router();
const { getOngoingAnime } = require("./controller");

route.get("/", (_, res) => {
  res.send({
    endpoint: {
      getOngoingAnime: "/api/v1/ongoing/:page",
    },
  });
});

route.get("/api/v1/ongoing/:page", getOngoingAnime);

module.exports = route;
