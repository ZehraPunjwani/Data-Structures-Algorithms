#
# Written By: Zehra Punjwani
# Date: December 2014
# Deatils: This program calculates using EPSILON
#

import math
EPSILON = 0.00000000000001
r = math.sqrt(2.0)
if abs(r*r - 2.0)< EPSILON:
    print("sqrt(2.0) squared is approximately 2.0")
