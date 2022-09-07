import java.util.Scanner;

/**
 * The Main class is used for executing the 1st laboratory work on AP
 * @author Chepiuk Yaroslav
 * @version 1.0 2022-09-06
 */
public class Main {

    /**
     * This is the main() method, which is the entry point for executing a Java program
     * @param args contains the supplied command-line arguments
     */
    public static void main(String[] args){
        int N = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Choose an input method:\n\t0 - console\n\t1 - command line");

        byte readMode = in.nextByte();
        if(readMode == 0){
            System.out.println("Enter the value of N: ");
            N = in.nextInt();
        }
        else if(readMode == 1){
            N = Integer.parseInt(args[0]);
        }
        else{
            System.out.println("You entered an incorrect value.\nEnd of the program.");
        }

        Fibonacci num = new Fibonacci(N);
        num.displayInfo();
        num.labTaskInfo();
    }
}
