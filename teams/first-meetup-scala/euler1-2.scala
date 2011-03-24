/**
 * Problem 1 in scala
 */
(for(i <- 1 until 999) yield i).filter(n => (n % 3 == 0 || n % 5 == 0)).sum


/**
 * Problem 2 in scala
 */
lazy val fib: Stream[Int] = Stream.cons(0, Stream.cons(1, fib.zip(fib.tail).map(p => p._1 + p._2)))

implicit def iterableWithSum(it: Iterable[Int]) = 
  new { def sum = it.foldLeft(0)(_ + _) }
  
fib.filter(_ % 2 == 0).takeWhile(_ <= 4000000).sum
