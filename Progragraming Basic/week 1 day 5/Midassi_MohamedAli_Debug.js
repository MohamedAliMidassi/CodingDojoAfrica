// Debug the following code that removes negative values from an array

function removeNegatives(arr) {//first of all we dont put var in the parameter
    for(var i=0; i<=arr.length; i++) {
        if(arr[i] <= 0) {//secondly lower than is <=
            arr[i] = arr.pop();//thirdly i not j
            i--;
        }
    }
    return array;
}

export function main() {
  var result = removeNegatives([3, 7, -23, 0, 2.5, -4]);
  console.log(result);
}//last but not least we forgot to put }
