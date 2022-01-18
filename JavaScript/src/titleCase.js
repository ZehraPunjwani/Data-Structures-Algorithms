/*
	Written By: Zehra Punjwani
	Date: May 2017
	Details: Return the provided string with the first letter of each word capitalized. Make sure the rest of the word is in lower case.
	For the purpose of this exercise, you should also capitalize connecting words like "the" and "of".
*/

function titleCase(str) {
  var updatedStr = str.toLowerCase().split(' ');
  for(var i = 0; i < updatedStr.length; i++) {
    var letters = updatedStr[i].split('');
    letters[0] = letters[0].toUpperCase();
    updatedStr[i] = letters.join('');
  }
  return updatedStr.join(' ');
}

titleCase("I'm a little tea pot");

