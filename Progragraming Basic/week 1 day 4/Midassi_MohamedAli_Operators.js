//first try
var numberOfPieces=12
var numberOfPeople=5
function  howMuchLeftOverCake(numberOfPieces,numberOfPeople){
    for(numberOfPieces;numberOfPieces<=0;numberOfPiecesi--){
        if(numberOfPieces===0){
            console.log("no leftovers for you")
        }
        else if(numberOfPieces===2){
            console.log("you have some leftovers")
        }
        else if(3<=numberOfPieces && numberOfPieces<=5){
            console.log("you have some leftovers to share")
        }
        else{
            console.log("hold another")
        }
    }
}
//second try
var result=howMuchLeftOverCake()
console.log(result)

var numberOfPieces=12
var numberOfPeople=5
function  howMuchLeftOverCake(numberOfPieces,numberOfPeople){
    for(numberOfPieces;numberOfPieces<=0;numberOfPiecesi--){
        if(numberOfPieces%numberOfPeople==0){
            console.log("no leftovers for you")
        }
        else if(numberOfPieces%numberOfPeople===2){
            console.log("you have some leftovers")
        }
        else if(3<=numberOfPieces%numberOfPeople && numberOfPieces%numberOfPeople<=5){
            console.log("you have some leftovers to share")
        }
        else{
            console.log("hold another")
        }
    }
}
var result=howMuchLeftOverCake()
console.log(result)
