const JokeController = require('../controllers/jokes.controller')

module.exports = app => {
    app.get('/api/joke', JokeController.findAllJokes)
    app.get('/api/joke/:id', JokeController.findOneJoke)
    app.patch('/api/joke/:id', JokeController.updateJoke)
    app.post('/api/joke', JokeController.createNewJoke)
    app.delete('/api/joke/:id', JokeController.deleteJoke)
}