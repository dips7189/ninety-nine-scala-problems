# Ninety-Nine Problems in Scala

This is an adaptation of the [Ninety-Nine Prolog Problems](https://sites.google.com/site/prologsite/prolog-problems) written by Werner Hett at the Berne University of Applied Sciences in Berne, Switzerland.

From the original source:

> The purpose of this problem collection is to give you the opportunity to practice your skills in logic programming. Your goal should be to find the most elegant solution of the given problems. Efficiency is important, but logical clarity is even more crucial. Some of the (easy) problems can be trivially solved using built-in predicates. However, in these cases, you learn more if you try to find your own solution.

> The problems have different levels of difficulty. Those marked with a single asterisk (\*) are easy. If you have successfully solved the preceding problems you should be able to solve them within a few (say 15) minutes. Problems marked with two asterisks (\*\*) are of intermediate difficulty. If you are a skilled Scala programmer it shouldn't take you more than 30-90 minutes to solve them. Problems marked with three asterisks (\*\*\*) are more difficult. You may need more time (i.e. a few hours or more) to find a good solution.

> Solutions are available by clicking on the link at the beginning of the problem description.

## Contents

* [Lists](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/README.md#lists)
* [Arithmetic](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/README.md#arithmetic)
* [Logic & Codes](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/README.md#logic-and-codes)

## Lists

### [P01](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P01.scala) **(\*) Find the last element of a list**

```console
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```

### [P02](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P02.scala) **(\*) Find the last but one element of a list**

```console
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
```

### [P03](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P03.scala) **(\*) Find the Kth element of a list**

> By convention, the first element in the list is element 0.

```console
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
```

### [P04](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P04.scala) **(\*) Find the number of elements of a list**

```console
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
```

### [P05](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P05.scala) **(\*) Reverse a list**

```console
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
```

### [P06](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P06.scala) **(\*) Find out whether a list is a palindrome**

```console
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
```

### [P07](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P07.scala) **(\*\*) Flatten a nested list structure**

```console
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
```

### [P08](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P08.scala) **(\*\*) Eliminate consecutive duplicates of list elements**

> If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.

```console
scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
```

### [P09](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P09.scala) **(\*\*) Pack consecutive duplicates of list elements into sublists**

> If a list contains repeated elements they should be placed in separate sublists.

```console
scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
```

### [P10](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P10.scala) **(\*) Run-length encoding of a list**

> Use the result of problem 09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as terms [N,E] where N is the number of duplicates of the element E.

```console
scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```

### [P11](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P11.scala) **(\*) Modified run-length encoding**

> Modify the result of problem 10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as [N,E] terms.

```console
scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
```

### [P12](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P12.scala) **(\*\*) Decode a run-length encoded list**

> Given a run-length code list generated as specified in problem 11. Construct its uncompressed version.

```console
scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
```

### [P13](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P13.scala) **(\*\*) Run-length encoding of a list (direct solution)**

> Implement the so-called run-length encoding data compression method directly. I.e. don't explicitly create the sublists containing the duplicates, as in problem 09, but only count them

```console
scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```

### [P14](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P14.scala) **(\*) Duplicate the elements of a list**

```console
scala> duplicate(List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
```

### [P15](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P15.scala) **(\*\*) Duplicate the elements of a list a given number of times**

```console
scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
```

### [P16](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P16.scala) **(\*\*) Drop every N'th element from a list**

```console
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
```

### [P17](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P17.scala) **(\*\*) Split a list into two parts**

> The length of the first part is given. Use a Tuple for your result.

```console
scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
```

### [P18](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P18.scala) **(\*\*) Extract a slice from a list**

```console
scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
```

### [P19](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P19.scala) **(\*\*) Rotate a list N places to the left**

```console
scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
```

### [P20](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P20.scala) **(\*) Remove the K'th element from a list**

> Return the list and the removed element in a Tuple. Elements are numbered from 0.

```console
scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
```

### [P21](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P21.scala) **(\*) Insert an element at a given position into a list**

```console
scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
```

### [P22](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P22.scala) **(\*) Create a list containing all integers within a given range**

```console
scala> range(4, 9)
res0: List[Int] = List(4, 5, 6, 7, 8, 9)
```

### [P23](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P23.scala) **(\*) Extract a given number of randomly selected elements from a list**

> Hint: Use the solution to problem [P20](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P20.scala)

```console
scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
res0: List[Symbol] = List('e, 'd, 'a)
```

### [P24](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P24.scala) **(\*) Lotto: Draw N different random numbers from the set 1..M**

```console
scala> lotto(6, 49)
res0: List[Int] = List(23, 1, 17, 33, 21, 37)
```

### [P25](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P25.scala) **(\*) Generate a random permutation of the elements of a list**

> Hint: Use the solution of problem [P23](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P23.scala)

> *Instead of using the solution to problem 23 I have instead used An in-place shuffle also known as the inside-out algorithm by Richard Durstenfeld.
  As this solution runs in O(n) time compared to the latter which runs in O(n<sup>2</sup>) time.*

```console
scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
```

### [P26](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P26.scala) **(\*\*) Generate the combinations of K distinct objects chosen from the N elements of a list**

> In how many ways can a committee of 3 be chosen from a group of 12 people? We all know that there are C(12,3) = 220 possibilities (C(N,K) denotes the well-known binomial coefficient). For pure mathematicians, this result may be great. But we want to really generate all the possibilities.

```console
scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
```

### [P27](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P27.scala) **(\*\*) Group the elements of a set into disjoint subsets**

> a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons? Write a function that generates all the possibilities.

Example:

```console
scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...
```

> b) Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return a list of groups.

Example:

```console
scala> group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David), List(Evi, Flip, Gary, Hugo, Ida)), ...
Note that we do not want permutations of the group members; i.e. ((Aldo, Beat), ...) is the same solution as ((Beat, Aldo), ...). However, we make a difference between ((Aldo, Beat), (Carla, David), ...) and ((Carla, David), (Aldo, Beat), ...).
```

> You may find more about this combinatorial problem in a good book on discrete mathematics under the term "multinomial coefficients".

### [P28](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P28.scala) **(\*\*) Sorting a list of lists according to length of sublists**

> a) We suppose that a list contains elements that are lists themselves. The objective is to sort the elements of the list according to their length. E.g. short lists first, longer lists later, or vice versa.

Example:

```console
scala> lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
res0: List[List[Symbol]] = List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l))
```

> b) Again, we suppose that a list contains elements that are lists themselves. But this time the objective is to sort the elements according to their length frequency; i.e. in the default, sorting is done ascendingly, lists with rare lengths are placed, others with a more frequent length come later.

Example:

```console
scala> lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
res1: List[List[Symbol]] = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
```

> Note that in the above example, the first two lists in the result have length 4 and 1 and both lengths appear just once. The third and fourth lists have length 3 and there are two list of this length. Finally, the last three lists have length 2. This is the most frequent length.

## Arithmetic

### [P31](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P31.scala) **(\*\*) Determine whether a given integer number is prime**

```console
scala> 7.isPrime
res0: Boolean = true
```
### [P32](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P32.scala) **(\*\*) Determine the greatest common divisor of two positive integer numbers**

Use Euclid's algorithm.

```console
scala> gcd(36, 63)
res0: Int = 9
```

### [P33](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P33.scala) **(\*) Determine whether two positive integer numbers are coprime**

Two numbers are coprime if their greatest common divisor equals 1.

```console
scala> 35.isCoprimeTo(64)
res0: Boolean = true
```

### [P34](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P34.scala) **(\*\*) Calculate Euler's totient function phi(m)**

Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.

```console
scala> 10.totient
res0: Int = 4
```

### [P35](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P35.scala) **(\*\*) Determine the prime factors of a given positive integer**

Construct a flat list containing the prime factors in ascending order.

```console
scala> 315.primeFactors
res0: List[Int] = List(3, 3, 5, 7)
```

### [P36](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P36.scala) **(\*\*) Determine the prime factors of a given positive integer (2)**

Construct a list containing the prime factors and their multiplicity.

```console
scala> 315.primeFactorMultiplicity
res0: List[(Int, Int)] = List((3,2), (5,1), (7,1))
```

Alternately, use a Map for the result.

```console
scala> 315.primeFactorMultiplicity
res0: Map[Int,Int] = Map(3 -> 2, 5 -> 1, 7 -> 1)
```

### [P37](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P37.scala) **(\*\*) Calculate Euler's totient function phi(m) (improved)**

See problem [P34](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P34.scala) for the definition of Euler's totient function. If the list of the prime factors of a 
number m is known in the form of problem [P36](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P36.scala) then the function phi(m>) can be efficiently calculated 
as follows: Let _[[p1, m1], [p2, m2], [p3, m3], ...]_ be the list of prime factors (and their 
multiplicities) of a given number m. Then phi(m) can be calculated with the following formula:

_phi(m) = (p1-1)*p1(m1-1) * (p2-1)*p2(m2-1) * (p3-1)*p3(m3-1) * ..._

Note that a<sup>b</sup> stands for the bth power of a

### [P38](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P38.scala) **(\*) Determine the prime factors of a given positive integer**

Use the solutions of problems [P34](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P34.scala) and [P37](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P37.scala) to compare the algorithms. Try to calculate phi(10090) as an example.

### [P39](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P39.scala) **(\*) A list of prime numbers**

Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.

```console
scala> listPrimesinRange(7 to 31)
res0: List[Int] = List(7, 11, 13, 17, 19, 23, 29, 31)
```

### [P40](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P40.scala) **(\*\*) Goldbach's conjecture**

Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers. 
E.g. 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct 
in the general case. It has been numerically confirmed up to very large numbers (much larger than Scala's Int 
can represent). Write a function to find the two prime numbers that sum up to a given even integer.

```console
scala> 28.goldbach
res0: (Int, Int) = (5,23)
```

### [P41](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P41.scala) **(\*\*) A list of Goldbach compositions**

Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.

```console
scala> printGoldbachList(9 to 20)
10 = 3 + 7
12 = 5 + 7
14 = 3 + 11
16 = 3 + 13
18 = 5 + 13
20 = 3 + 17
```

In most cases, if an even number is written as the sum of two prime numbers, one of them is very small. Very rarely, the primes are both bigger than, say, 50. 
Try to find out how many such cases there are in the range 2..3000.

Example (minimum value of 50 for the primes):

```console
scala> printGoldbachListLimited(1 to 2000, 50)
992 = 73 + 919
1382 = 61 + 1321
1856 = 67 + 1789
1928 = 61 + 1867
```

## Logic and Codes

### [P46](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/arithmetic/P46.scala) **(\*\*) Truth tables for logical expressions**

Define functions `and`, `or`, `nand`, `nor`, `xor`, `impl`, and `equ` (for logical equivalence) which return true or false according to the result of their respective operations; 
e.g. `and(A, B)` is true if and only if both _A_ and _B_ are true

```console
scala> and(true, true)
res0: Boolean = true

scala> xor(true. true)
res1: Boolean = false
```

A logical expression in two variables can then be written as an function of two variables, e.g: `(a: Boolean, b: Boolean) => and(or(a, b), nand(a, b))`
Now, write a function called table2 which prints the truth table of a given logical expression in two variables.

```console
scala> table2((a: Boolean, b: Boolean) => and(a, or(a, b)))
A     B     result
true  true  true
true  false true
false true  false
false false false
```