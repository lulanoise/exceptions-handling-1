package it.develhope.exceptionshandling;

public class Start {
    public static void checkScore(double score) throws Exception{
        if ( score > 0 && score <= 50.00){
            System.out.println("Average score");
        }else if (score > 50.00 && score <= 100.00){
            System.out.println("Very good score");
        }else{
            throw new ArithmeticException("Score is out of scale!");
        }
    }

    public static void main(String[] args) throws Exception {
        checkScore(2.15);
        checkScore(50);
        checkScore(95.92);
        checkScore(100.01);
    }
}

