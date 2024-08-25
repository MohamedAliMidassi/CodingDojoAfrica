//! the iterative fibonacci is faster then the recursive one
//? Calculating prime numbers
function isprime(number) {
    for (let i = 2; i < number; i++) {
        if (number % i === 0) {
            return number+"=>"+"Is Not A Prime Number !!";
        }
    }
    return number+"=>"+"Is A Prime Number";
}
console.log(isprime(100000));
console.log(isprime(1000000));

//! the efficent way to reverse a string
function reverse(words) {
    let reverseword = ""
    for (let i = words.length - 1; i >= 0; i--) {
        reverseword = reverseword + words[i]
    }
    return reverseword
}
console.log(reverse("baha jlassi"))
