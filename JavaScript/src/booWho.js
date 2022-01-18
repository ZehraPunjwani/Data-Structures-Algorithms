/*
	Written By: Zehra Punjwani
	Date: June 2017
	Details:Check if a value is classified as a boolean primitive. Return true or false. Boolean primitives are true and false.
*/

function booWho(bool) {
  // What is the new fad diet for ghost developers? The Boolean.
  return bool === true || bool === false; // OR ==> typeof bool === 'boolean'
}

booWho(null);