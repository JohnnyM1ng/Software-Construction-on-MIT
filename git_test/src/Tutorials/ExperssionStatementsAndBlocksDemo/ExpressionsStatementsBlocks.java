package Tutorials.ExperssionStatementsAndBlocksDemo;

public class ExpressionsStatementsBlocks {
    public static void main(String[] args ){
        // expressions
        // assignment expression
        int a = 5;

        // arithmetic expression
        int b = a + 3;

        //comparison expression
        boolean result = (b > 10);

        // statements
        // declaration statement
        int a_ = 5;

        // method invocation statement
        System.out.println("Hello world");

        // conditional statement
        if (a_ > 0){
            System.out.println("a is positive");
        }
        else{
            System.out.println("a is not positive");
        }

        //blocks
        boolean condition = true;
        if (condition) { // begin block 1
            System.out.println("Condition is true.");
        } // end block one
        else { // begin block 2
            System.out.println("Condition is false.");
        } // end block 2
    }
}
