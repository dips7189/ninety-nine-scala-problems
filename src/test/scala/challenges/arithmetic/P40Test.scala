package challenges.arithmetic

import org.scalatest.{FlatSpec, Matchers}


class P40Test extends FlatSpec with Matchers {

  val expected = List((19,2029), (31,2017), (37,2011), (61,1987), (97,1951), (181,1867), (271,1777),
    (307,1741), (349,1699), (379,1669), (421,1627), (439,1609), (499,1549), (577,1471), (601,1447),
    (619,1429), (727,1321), (751,1297), (757,1291), (769,1279), (811,1237), (877,1171), (919,1129),
    (997,1051), (1009,1039))

  "goldbach" should "find all of the primes that summate to it" in {
    P40.goldbach(2048) should contain theSameElementsInOrderAs expected
    P40._goldbach_(2048).equals(expected(1))
  }

}
