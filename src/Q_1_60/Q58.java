package Q_1_60;


public class Q58 {
}

    class MainTest{
        public static void main(String[] args) {
            String [] abc = new String[1];
            abc[0] = "1 2 3";
            System.out.println("String main "+ abc[0]);

        }


       /*
        and commands:
        javac MainTest.java
        java MainTest "1 2 3"

        What is the result?
    A. String main 1
    B. An exception is thrown at runtime
    C. String main 1 2 3
    D. String main 123
    Answer: A
        Gives ArrayIndexOutOfBoundsException
        */


    }

