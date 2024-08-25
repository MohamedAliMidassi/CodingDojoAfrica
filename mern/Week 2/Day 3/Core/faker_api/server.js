const express = require('express')
const app = express()

app.listen(3000)

const { faker } = require('@faker-js/faker');

const createProduct = () => {
    const newFake = {
        name: faker.commerce.productName(),
        price: "$" + faker.commerce.price(),
        department: faker.commerce.department()
    };
    return newFake;
};

const createUser = () => {
    const newUser = {
        fullName: faker.person.fullName(),
    };
    return newUser;
}

const createCompany = () => {
    const newCompany = {
        name: faker.company.name(),
        catchPhrase: faker.company.catchPhrase()
    }
    return newCompany;
}



const newFakeProduct = createProduct();
const newFakeUser = createUser();
const newFakeCompany = createCompany();


app.get("/api/user/new", (req, res) => {
    res.json(newFakeUser)
})
app.get("/api/company", (req, res) => {
    res.json(newFakeCompany)
})

app.get("/api/user/company", (req, res) => {
    const fullData = {
        user: newFakeUser,
        company: newFakeCompany
    }
    res.json(fullData)
})

console.log(newFakeProduct);
console.log(newFakeUser);
console.log(newFakeCompany);



//! The output of the above console log will look like this
/*
 * {
 *   name: 'Anime Figure',
 *   price: '$568.00
 *   department: 'Tools' 
 * }
 */
