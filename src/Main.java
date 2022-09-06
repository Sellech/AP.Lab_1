import java.util.Scanner;
public class Main {
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
    }
}
