const Joke = require('../models/jokes.model')

// SHOW ALL
module.exports.findAllJokes = (req, res) => {
    Joke.find()
        .then((allJokes) => {
            res.json({ jokes: allJokes })
        })
        .catch((err) => {
            res.json(err)
        })
}
// FIND ONE ELEMENT
module.exports.findOneJoke = (req, res) => {
    Joke.findOne({ _id: req.params.id })
        .then((oneJoke) => {
            res.json({ joke: oneJoke })
        })
        .catch((err) => {
            res.json(err)
        })
}
// CREATE NEW ELEMENT
module.exports.createNewJoke = (req, res) => {
    Joke.create(req.body)
        .then((newJoke) => {
            res.json({ joke: newJoke })
        })
        .catch((err) => {
            res.json(err)
        })
}
// UPDATE
module.exports.updateJoke = (req, res) => {
    Joke.findOneAndUpdate({ _id: req.params.id }, req.body, { new: true, runValidators: true })
        .then((updateJoke) => {
            res.json({ joke: updateJoke })
        })
        .catch((err) => {
            res.json(err)
        })
}
// DELETE
module.exports.deleteJoke = (req, res) => {
    Joke.deleteOne({ _id: req.params.id })
        .then((result) => {
            res.json({ result: result })
        })
        .catch((err) => {
            res.json(err)
        })
}