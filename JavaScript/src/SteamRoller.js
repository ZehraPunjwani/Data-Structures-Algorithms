/*
  Written By: Zehra Punjwani
  Date: June 2017
  Details: Flatten a nested array. You must account for varying levels of nesting.
*/

function steamrollArray(arr) {
  // I'm a steamroller, baby
  var flat = [].concat(...arr);
  return flat.some(Array.isArray) ? steamrollArray(flat) : flat;
}

steamrollArray([1, [2], [3, [[4]]]]);