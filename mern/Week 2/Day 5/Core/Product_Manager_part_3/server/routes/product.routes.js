const ProductController = require('../controllers/product.controller');

module.exports = app => {
    app.get('/api', ProductController.findAll);
    app.get('/api/product/:id', ProductController.getOneProduct);
    app.post('/api/product', ProductController.createProduct);
    app.patch('/api/:id/edit', ProductController.updateProduct);
    app.delete('/api/products/:id', ProductController.deleteProduct)

}

