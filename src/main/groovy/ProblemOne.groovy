/**
 * If we list all the natural numbers below 10
 that are multiples of 3 or 5, we get 3,5,6 and 9.
 The sum of these multiples is 23.
 Find the sum of all the multiples of 3 or 5 below 1000
 */

public class ProblemOne {
    static void run() {
        int sumOfNumbers = 0

        for (int i = 0; i < 1000; i++) {
            if (i.mod(3) == 0) {
                sumOfNumbers = sumOfNumbers + i
                continue
            }

            if (i.mod(5) == 0) {
                sumOfNumbers = sumOfNumbers + i
            }
        }

        println "The sum of the multiples is: " + sumOfNumbers


        int sumOfNumbers2 = 0
        int queryNum = 999

        for (int i = 0; i <= Math.floor(queryNum/3); i++) {
            sumOfNumbers2 = sumOfNumbers2 + (i * 3)
        }

        for (int i = 0; i <= Math.floor(queryNum/5); i++) {
            if (i.mod(3) == 0) {
                continue
            }
            sumOfNumbers2 = sumOfNumbers2 + (i * 5)
        }

        println "The sum of the multiples is: " + sumOfNumbers2
    }
}