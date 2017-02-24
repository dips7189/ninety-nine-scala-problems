# Ninety-Nine Problems in Scala

This is an adaptation of the [Ninety-Nine Prolog Problems](https://sites.google.com/site/prologsite/prolog-problems) written by Werner Hett at the Berne University of Applied Sciences in Berne, Switzerland.

From the original source:

> The purpose of this problem collection is to give you the opportunity to practice your skills in logic programming. Your goal should be to find the most elegant solution of the given problems. Efficiency is important, but logical clarity is even more crucial. Some of the (easy) problems can be trivially solved using built-in predicates. However, in these cases, you learn more if you try to find your own solution.

> The problems have different levels of difficulty. Those marked with a single asterisk (\*) are easy. If you have successfully solved the preceding problems you should be able to solve them within a few (say 15) minutes. Problems marked with two asterisks (\*\*) are of intermediate difficulty. If you are a skilled Scala programmer it shouldn't take you more than 30-90 minutes to solve them. Problems marked with three asterisks (\*\*\*) are more difficult. You may need more time (i.e. a few hours or more) to find a good solution.

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

By convention, the first element in the list is element 0.

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

If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.

```console
scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
```

### [P09](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P09.scala) **(\*\*) Pack consecutive duplicates of list elements into sublists**

If a list contains repeated elements they should be placed in separate sublists.

```console
scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
```

### [P10](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P10.scala) **(\*) Run-length encoding of a list**

Use the result of problem 09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as terms [N,E] where N is the number of duplicates of the element E.

```console
scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```

### [P11](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P11.scala) **(\*) Modified run-length encoding**

Modify the result of problem 10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as [N,E] terms.

```console
scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
```

### [P12](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P12.scala) **(\*\*) Decode a run-length encoded list**

Given a run-length code list generated as specified in problem 11. Construct its uncompressed version.

```console
scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
```

### [P13](https://github.com/dips7189/ninety-nine-scala-problems/blob/master/src/main/scala/challenges/lists/P13.scala) **(\*\*) Run-length encoding of a list (direct solution)**

Implement the so-called run-length encoding data compression method directly. I.e. don't explicitly create the sublists containing the duplicates, as in problem 09, but only count them

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

The length of the first part is given. Use a Tuple for your result.

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