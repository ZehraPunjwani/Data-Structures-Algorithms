/*
  Written By: Zehra Punjwani
  Date: June 2017
  Details: We'll pass you an array of two numbers. Return the sum of those two numbers and all numbers between them.The lowest number will not always come first.
*/

function sumAll(arr) {
  var acc = 0;
  for (var i = Math.min(...arr); i <= Math.max(...arr); ++i){
      acc += i;
  }
  return acc;
}

sumAll([1, 4]);

