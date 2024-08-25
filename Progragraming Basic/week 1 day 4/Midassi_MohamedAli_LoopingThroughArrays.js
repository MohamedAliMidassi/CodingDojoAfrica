// #1
var arr1 = [8, 6, 7, 5, 3, 0, 9];
// #2
var arr2 = [4, 7, 13, 13, 19, 37, -2];
// #3
var arr3 = [6, 2, 12, 14, -24, 5, 0];
for(var i=0;i<arr1.length;i++){
    console.log(arr1[i])
}
var sum=0
var index=0
for(var i=0;i<arr2.length;i++){
    sum=sum+arr2[i]
    index=i
    var arr4=[]
    arr4.push(sum)
    arr4.push(index)
    console.log("sum :"+sum+"/"+"index :"+index)
    console.log(arr4)
}

for(var i=0;i<arr3.length;i++){
    if(5<arr3[i]){
        arr3[i]="No Dice"
    }
    console.log(arr3)
}