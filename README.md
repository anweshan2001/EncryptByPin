Problem: Given four n-digit positive integers, generate an n-digit pin.
Then encrypt a message using the generated pin.
Description: Given four n-digit integers, i

th digit of pin generated by

finding minimum of i

th digit of all 4 integers.

For example: Given four 6-digit integers are as follows:

1st number: 556283
2nd number: 698123
3rd number: 757957
4th number: 839685
--------------------------------------
pin: 536123

In the second part of problem, you need to encrypt a given message using the
above generated pin. The message divided into different blocks of size n. In
each block the characters (ith) are shifted forward by pin(i) positions. Steps for
encryption explained with the following example:
Message: “Very difficult to break” (Encrypt it by using pin: 536123)
