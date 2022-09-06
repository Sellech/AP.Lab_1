/**
 * The Fibonacci class is used to store the N-th Fibonacci number
 * @author Chepiuk Yaroslav CS-207
 * @version 1.0 2022-09-06
 */
public class Fibonacci {
    private final int N;
    private long FibNum;

    /**
     * Constructs a new Fibonacci object with the value of the Fibonacci number at N position
     * @param N ordinal number of the Fibonacci number
     */
    Fibonacci(int N){
        this.N = N;
        long actNum, fstNum = 0, scndNum = 1;
        while(N>0){
            actNum = fstNum + scndNum;
            fstNum = scndNum;
            scndNum = actNum;
            N--;
        }
        FibNum = fstNum;
    }

    /**
     * @return ordinal number of the Fibonacci number(N)
     */
    public int getN() {
        return N;
    }

    /**
     * @return the value of the Fibonacci number at position N
     */
    public long getFibNum() {
        return FibNum;
    }

    /**
     * Displays information about the Fibonacci number
     */
    public void displayInfo(){
        System.out.println("Value of N: "+ N +", Fibonacci number: " + FibNum);
    }
}
