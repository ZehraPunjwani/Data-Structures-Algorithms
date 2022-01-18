/*
	Written By: Zehra Punjwani
	Date: June 2017
	Details: Find the missing letter in the passed letter range and return it. If all letters are present in the range, return undefined.

*/

function fearNotLetter(str) {
  for(var i = 0; i < str.length; ++i) {
    var code = str.charCodeAt(i);
    if (code !== str.charCodeAt(0) + i) {
      return String.fromCharCode(code - 1);
    }  
  }
  return undefined;
}

fearNotLetter("abce");
