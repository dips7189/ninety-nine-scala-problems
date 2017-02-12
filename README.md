# Ninety Nine Scala Problems
An attempt to solve 99 problems using Scala

[The original link to the problems can be found here. Many thanks to Phil Gold for them.](http://aperiodic.net/phil/scala/s-99/)

The problems have different levels of difficulty. Those marked with a single asterisk (*) are easy. If you have successfully solved the preceeding problems you should be able to solve them within a few (say 15) minutes. Problems marked with two asterisks (`**`) are of intermediate difficulty. If you are a skilled Scala programmer it shouldn't take you more than 30-90 minutes to solve them. Problems marked with three asterisks (`***`) are more difficult. You may need more time (i.e. a few hours or more) to find a good solution. The difficulties were all assigned for the Prolog problems, but the Scala versions seem to be of roughly similar difficulty.

Your goal should be to find the most elegant solution of the given problems. Efficiency is important, but clarity is even more crucial. Some of the (easy) problems can be trivially solved using built-in functions. However, in these cases, you learn more if you try to find your own solution.

### Working with lists

**P01 (`*`) Find the last element of a list.**
Example:
```scala> last(List(1, 1, 2, 3, 5, 8))```
```res0: Int = 8```

**P02 (`*`) Find the last but one element of a list.**
Example:
```scala> penultimate(List(1, 1, 2, 3, 5, 8))```
```res0: Int = 5```

**P03 (`*`) Find the Kth element of a list.**
Example:
```scala> nth(2, List(1, 1, 2, 3, 5, 8))```
```res0: Int = 2```

**P04 (`*`) Find the number of elements of a list.**
Example:
```scala> length(List(1, 1, 2, 3, 5, 8))```
```res0: Int = 6```

**P05 (`*`) Reverse a list.**
Example:
```scala> nth(2, List(1, 1, 2, 3, 5, 8))```
```res0: Int = 2```

**P06 (`*`) Find out whether a list is a palindrome.**
Example:
```scala> isPalindrome(List(1, 2, 3, 2, 1))```
```res0: Boolean = true```