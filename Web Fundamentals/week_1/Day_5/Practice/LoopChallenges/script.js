function odds() {
    for (var i = 1; i <= 20; i++) {
        if (i % 2 != 0) {
            console.log(i)
        }
    }
}
odds()


function DecreasingMultiples() {
    for (i=100;i>=0; i--) {
        if (i % 3 == 0 && i != 0) {
            console.log(i)
        }
    }
}
DecreasingMultiples()


function sequence(){
    var array=[4,2.5,1,-0.5,-2,-3.5]
    for(i=0;i<array.length;i++){
        console.log(array[i])
    }
}
sequence()


function sigma(){
    var sum=0
    for(i=1;i<=100;i++){
        sum=sum+i
    }
    console.log(sum)
}
sigma()


function factorial(){
    var fact=1
    for(i=2;i<=12;i++){
        fact=fact*i
    }
    console.log(fact)
}
factorial()