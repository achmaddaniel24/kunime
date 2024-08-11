const mongoose = require("mongoose");

const userSchema = new mongoose.Schema({
  username: {
    type: String,
    required: true,
    unique: true,
  },
  email: {
    type: String,
    required: true,
    unique: true,
  },
  password: {
    type: String,
    required: true,
  },
  // TODO:
  // Add more fields as needed:
  // favoriteAnime: [{ type: mongoose.Schema.Types.ObjectId, ref: 'Anime' }], // Reference to Anime model
  // watchlist: [{ type: mongoose.Schema.Types.ObjectId, ref: 'Anime' }],
  // profilePicture: String,
  // birthDate: Date,
  // etc.
});

const User = mongoose.model("User", userSchema);

module.exports = {
  User,
};
