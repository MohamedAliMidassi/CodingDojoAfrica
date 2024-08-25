class redBeltNinja {
    constructor(cost,power,resilience){
        this.cost=cost;
        this.power=power;
        this.resilience=resilience;
    }
}

const redBeltNinja1 = new redBeltNinja(3,3,4);

console.log(redBeltNinja1.cost);
console.log(redBeltNinja1.power);
console.log(redBeltNinja1.resilience);


class BlackBeltNinja {
    constructor (cost,power,resilience){
        this.cost=cost;
        this.power=power;
        this.resilience=resilience;
    }
}
    const BlackBeltNinja1 = new BlackBeltNinja(4,5,4);

console.log(BlackBeltNinja1.cost);
console.log(BlackBeltNinja1.power);
console.log(BlackBeltNinja1.resilience);



class HardAlgorithm {
    constructor (cost,text,stat,magnitude){
        this.cost=cost;
        this.text=text;
        this.stat=stat;
        this.magnitude=magnitude;
    }
}
    const HardAlgorithm1 = new HardAlgorithm(2,"increase target's resilence by 3 ","resilence","+3");
    

console.log(HardAlgorithm1.cost);
console.log(HardAlgorithm1.text);
console.log(HardAlgorithm1.stat);
console.log(HardAlgorithm1.magnitude);



class UnhandledPromiseRejection {
    constructor (cost,text,stat,magnitude){
        this.cost=cost;
        this.text=text;
        this.stat=stat;
        this.magnitude=magnitude;
    }
}
    const HardAlgorithm2 = new HardAlgorithm(4,5,4);

console.log(HardAlgorithm.cost);
console.log(HardAlgorithm.text);
console.log(HardAlgorithm.stat);
console.log(HardAlgorithm.magnitude);