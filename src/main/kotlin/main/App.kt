package main

import hackerrank.interviewprep.warmupchallenges.JumpingOnClouds
import hackerrank.interviewprep.warmupchallenges.SockMerchant
import udemy.datastructuresandalgorithms.basics.recursion.RecursionExampleOne
import udemy.datastructuresandalgorithms.basics.recursion.RecursionFactorial

/**
 * @author Lenny Ramos
 *
 * Main to execute all of the Different Algorithms and problems
 *
 * Uncomment the set of code for now to run
 *
 * @todo clean this
 */
class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    println(App().greeting)

    // val searchAlgorithms = SearchAlgorithms()
    // searchAlgorithms.search(strategy = "BinarySearch", numToSearch = 130)

    // val simpleArraySum = SimpleArraySum();
    // simpleArraySum.run(args);

    // val aVeryLargeArraySum = AVeryBigSum();
    // aVeryLargeArraySum.run(args);

    // val diagonalDifference = DiagonalDifference();
    // diagonalDifference.run(args);

    // val formingAMagicSquare = TransformMatrixIntoMagicSquare();
    // formingAMagicSquare.run(args);

    //val magicSquareOddOrder = funalgorithms.MagicSquareOddOrder()
    // magicSquareOddOrder.run()

    // val sockMerchant: SockMerchant = SockMerchant()
    // sockMerchant.run()

    //val jumpingOnClouds = JumpingOnClouds()
    //jumpingOnClouds.run()

    //RecursionExampleOne.foo(3)

    val factorial = 5
    println("This is the factorial of $factorial " + RecursionFactorial.factorial(factorial))

}