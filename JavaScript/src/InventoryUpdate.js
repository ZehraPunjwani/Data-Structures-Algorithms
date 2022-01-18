/*
  Written By: Zehra Punjwani
  Date: June 2017
  Details: Compare and update the inventory stored in a 2D array against a second 2D array of a fresh delivery. Update the current 
  existing inventory item quantities (in arr1). If an item cannot be found, add the new item and quantity into the inventory array. 
  The returned inventory array should be in alphabetical order by item.
*/

function updateInventory(arr1, arr2) {
  // All inventory must be accounted for or you're fired!
  var index;
  var arrCurInvName = []; // Names of arr1's items
  var arrNeInvName = []; // Names of arr2's items

  // Same as using two for loops, this takes care of increasing the number of stock quantity.
  arr1.map(function(item1) {
    return arr2.map(function(item2) {
      if (item1[1] === item2[1]) {
        item1[0] = item1[0] + item2[0]; //Increase number of stock
      }
    });
  });

  // Get item's name for new Inventory
  arr2.map(function(item) {
    arrNeInvName.push(item[1]);
  });

  // Get item's name for Current Inventory
  arr1.map(function(item) {
    arrCurInvName.push(item[1]);
  });

  // Add new inventory items to current inventory.
  arrNeInvName.map(function(item) {
    if (arrCurInvName.indexOf(item) === -1) {
      index = arrNeInvName.indexOf(item);
      arr1.push(arr2[index]);
    }
  });

  // Sort the array alphabetically using the second element of the array as base.
  return arr1.sort(function(currItem, nextItem) {
    //Ternary function to avoid using if else
    return currItem[1] > nextItem[1] ? 1 : -1;
  });
}

// test here
// Example inventory lists
var curInv = [
    [21, "Bowling Ball"],
    [2, "Dirty Sock"],
    [1, "Hair Pin"],
    [5, "Microphone"]
];

var newInv = [
    [2, "Hair Pin"],
    [3, "Half-Eaten Apple"],
    [67, "Bowling Ball"],
    [7, "Toothpaste"]
];

updateInventory(curInv, newInv);
