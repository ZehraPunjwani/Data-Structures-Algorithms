/*
	Written By: Zehra Punjwani
	Date: June 2017
	Details: Perform a search and replace on the sentence using the arguments provided and return the new sentence.
	First argument is the sentence to perform the search and replace on.
	Second argument is the word that you will be replacing (before).
	Third argument is what you will be replacing the second argument with (after).
	NOTE: Preserve the case of the original word when you are replacing it. For example if you mean to replace the word "Book" with the word "dog", it should be replaced as "Dog"
*/


function myReplace(str, before, after) {
	var indexBefore = before.charAt(0);
	if(indexBefore === indexBefore.toUpperCase()){
		after = after[0].toUpperCase() + after.slice(1);
	}
	return str.replace(before, after);
}

// OR
function myReplace(str, before, after) {
  var re = new RegExp(before, "gi");
  if(/[A-Z]/.test(before[0])){
    after = after.charAt(0).toUpperCase() + after.slice(1);
  }
  return str.replace(re, after);
}

myReplace("A quick brown fox jumped over the lazy dog", "jumped", "leaped");
myReplace("He is Sleeping on the couch", "Sleeping", "sitting");
myReplace("This has a spellngi error", "spellngi", "spelling");
myReplace("His name is Tom", "Tom", "john");
myReplace("Let us get back to more Coding", "Coding", "algorithms");

