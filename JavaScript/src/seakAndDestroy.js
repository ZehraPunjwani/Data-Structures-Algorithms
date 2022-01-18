/*
	Written By: Zehra Punjwani
	Date: May 2017
	Details: You will be provided with an initial array (the first argument in the destroyer function), followed by one or more arguments. Remove all elements from the initial array that are of the same value as these arguments.
*/

function destroyer(arr) {
  // Remove all the values
  var args = Array.prototype.slice.call(arguments);
  args.splice(0, 1);
  return arr.filter(function(element) {
    return args.indexOf(element) === -1;
  });
}

destroyer([1, 2, 3, 1, 2, 3], 2, 3);

