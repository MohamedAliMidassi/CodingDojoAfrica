var current_date=new Date()
var hour=current_date.getHours()
var FirstName="Mohamed"
var time=hour
// //level 1
console.log("good day"+" "+FirstName)
//level 2
console.log("good"+" "+time+" "+FirstName)
//level 3
function greetings(FirstName,time){
    if(FirstName=="Dooku"){
        console.log("I'm coming for you, Dooku!")
    }
    else{
        if(time<=12 && 4<= time){
            console.log("good morning"+" "+FirstName)
        }
        else if(time<=17 && 12<=time){
            console.log("good afternoon" + " "+FirstName)
        }
        else if(time<=21 && 17<=time){
            console.log("good evening"+" "+FirstName)
        }
        else{
            console.log("good night"+" "+FirstName)
        }
    }
}
var res=greetings(FirstName,time)