const Product = require('../models/product.models')

module.exports.findAll = (req, res) => {
    Product.find()
        .then((allProduct) => {
            res.json({ Product: allProduct })
        })
        .catch((err) => {
            res.json(err)
        })
}


module.exports.createProduct = (req, res) => {
    Product.create(req.body)
        .then((newProduct) => {
            res.json({ Product: newProduct })
        })
        .catch((err) => {
            res.json(err)
        })
}