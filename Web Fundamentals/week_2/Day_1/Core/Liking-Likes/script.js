var button1 = document.querySelector('#button1');
var button2 = document.querySelector("#button2")
var button3 = document.querySelector("#button3")
var numberElement = document.querySelector('#number');
var numberElement2 = document.querySelector('#number2');
var numberElement3 = document.querySelector('#number3');
var counter = 0;

function incr() {
    counter++;
    numberElement.textContent = counter;
}
function incr1() {
    counter++;
    numberElement2.textContent = counter;
}
function incr2() {
    counter++;
    numberElement3.textContent = counter;
}

incrementButton.addEventListener('click', button1);
incrementButton2.addEventListener('click', button2);
incrementButton3.addEventListener('click', button3);