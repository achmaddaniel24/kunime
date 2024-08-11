const bcrypt = require("bcrypt");
const { User } = require("./model");

async function register(req, res) {
	const { username, email, password } = req.body;

	if (!username || !email || !password) {
		return res.status(400).json({ message: "All fields are required" });
	}

	try {
		// Check if user already exists
		const existingUser = await User.findOne({ email });
		if (existingUser) {
			return res.status(409).json({ message: "User already exists" });
		}

		// Hash password
		const hashedPassword = await bcrypt.hash(password, 10);

		// Create new user
		const newUser = new User({
			username,
			email,
			password: hashedPassword,
		});

		// Save user to database
		const savedUser = await newUser.save();

		// Successful registration
		res.status(201).json({ message: "User registered successfully" });
	} catch (error) {
		console.error(error);
		res.status(500).json({ message: "Server error" });
	}
}

module.exports = { register };
