/*
	Written By: Zehra Punjwani
	Date: May 2017
	Details: Return the length of the longest word in the provided sentence. Your response should be a number.
*/

function findLongestWord(str) {
  var newStr = str.split(" ");
  var counter = newStr[0].length;
  for(var i = 0; i < newStr.length; ++i){
    if(newStr[i].length > counter){
      counter = newStr[i].length;
    }
  }
  return counter;
}

findLongestWord("The quick brown fox jumped over the lazy dog");

