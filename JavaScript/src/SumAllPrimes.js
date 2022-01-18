/*
  Written By: Zehra Punjwani
  Date: June 2017
  Details: Sum all the prime numbers up to and including the provided number.
  A prime number is defined as a number greater than one and having only two divisors, one and itself. For example, 2 is a prime number because it's only divisible by one and two.
  The provided number may not be a prime.
*/


function sumPrimes(num) {
  var sieve = [];
  var arrPrime = [];
  for(var i = 2; i <= num; ++i){
    if(!sieve[i]){
      // i has not been marked -- it is prime
      arrPrime.push(i);
      for (var j = i; j <= num; j += i) {
          sieve[j] = true;
      }
    }
  }
  return arrPrime.reduce(function(prev, curr) {
    return prev + curr;
  });
}

sumPrimes(10);
