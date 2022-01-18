/*
	Written By: Zehra Punjwani
	Date: June 2017
	Details: Convert a string to spinal case. Spinal case is all-lowercase-words-joined-by-dashes.
*/

function spinalCase(str) {
  // "It's such a fine line between stupid, and clever."
  // --David St. Hubbins
  
  // Replace low-upper case to low-space-uppercase
  // Split on whitespace and underscores and join with dash
  return str.replace(/([a-z])([A-Z])/g, '$1 $2').toLowerCase().split(/(?:_| )+/) .join('-');
}

spinalCase("This Is Spinal Tap");