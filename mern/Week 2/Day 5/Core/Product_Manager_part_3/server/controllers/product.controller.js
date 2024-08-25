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
            res.status(400).json(err)
        })
}

module.exports.getOneProduct = (req, res) => {
    Product.findOne({ _id: req.params.id })
        .then((product) => {
            res.json({ Product: product })
        }).catch((err) => {
            res.json(err)
        })
}

module.exports.updateProduct = (req, res) => {
    Product.findOneAndUpdate({ _id: req.params.id }, req.body, { new: true, runValidators: true })
        .then((updateProduct) => {
            res.json({ Product: updateProduct })
        })
        .catch((err) => {
            res.status(400).json(err)
        })
}

module.exports.deleteProduct = (req, res) => {
    Product.deleteOne({ _id: req.params.id })
        .then((result) => {
            res.json({ result: result })
        })
        .catch((err) => {
            res.json(err)
        })
}