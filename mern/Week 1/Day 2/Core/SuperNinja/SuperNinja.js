class Ninja {
    constructor(name, health, speed, strength) {
        this.name = name
        this.health = 90
        this.speed = 3
        this.strength = 3
    }

    sayName() {
        console.log(this.name, " is a NINJA")
    }
    showStats() {
        console.log(this.name, "has a health of: ", this.health)
        console.log(this.name, "has a speed of: ", this.speed)
        console.log(this.name, "has a strength of: ", this.strength)
    }
    drankSake() {
        this.health += 10
        console.log(this.name, "is drinking sake! Health is up by 10!")
        console.log("Health :", this.health)
    }
}
/*
const ninja = new Ninja("ZORO");
ninja.sayName();
ninja.showStats();
ninja.drankSake();

*/
class Sensei extends Ninja {
    constructor(name) {
        super(name, 200, 10, 10,)
        this.wisdom = 10;


    }
    speakWisdom() {
        console.log("Fear is the path to the dark side. Fear leads to anger. Anger leads to hate. Hate leads to suffering.");
    }
    showStats() {
        console.log(`I am Sensei ${this.name} and my stats are:\nHealth: ${this.health} \nSpeed: ${this.speed}\nStrength: ${this.strength}\nWisdom: ${this.wisdom}`)
    }

}


const superSensei = new Sensei("Yoda");
superSensei.speakWisdom();
superSensei.showStats();