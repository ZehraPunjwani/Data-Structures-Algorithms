/*
  Written By: Zehra Punjwani
  Date: June 2017
  Details: Convert the characters &, <, >, " (double quote), and ' (apostrophe), in a string to their corresponding HTML entities.
*/

function convertHTML(str) {
  // Use Object Lookup to declare as many HTML entities as needed.
  htmlEntities = {
    '&':'&amp;',
    '<':'&lt;',
    '>':'&gt;',
    '\"':'&quot;',
    '\'':"&apos;"
  };
  //Use map function to return a filtered str with all entities changed automatically.
  return str.split('').map(function(entity){
    return htmlEntities[entity] || entity;
  }).join('');
}

// OR
function convertHTML(str) {
  return str.replace(/&/g,'&amp;').replace(/</g,'&lt;').replace(/>/g,'&gt;').replace(/"/g,'&quot;').replace(/'/g,"&apos;");
}

convertHTML("Dolce & Gabbana");