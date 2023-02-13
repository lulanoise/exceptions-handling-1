# Exercise: Exceptions Handling 1
* define a method `checkScore` that takes a double `score` as input parameter
  * if `0 < score <= 50.00` then print `Average score`
  * if `50.00 < score <= 100.00` the print `Very good score`
  * in all other cases throw an `ArithmeticException` with the message `Score is out of scale!`
* test the method with the following values:
  * `2.15`
  * `50`
  * `95.02`
  * `100.01`
