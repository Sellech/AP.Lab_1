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
     * Returns ordinal number of the Fibonacci number(N)
     * @return ordinal number of the Fibonacci number(N)
     */
    public int getN() {
        return N;
    }

    /**
     * Returns the value of the Fibonacci number at position N
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

    /**
     * Displays information about the result of fulfilling the condition of the task
     */
    public void labTaskInfo(){
        Fibonacci temp = new Fibonacci(N+2);
        if(temp.getFibNum() < Math.pow(2, N+2)){
            System.out.println("F(N+2) < 2^N: True");
            System.out.println(temp.getFibNum()+" < "+ Math.pow(2, N+2));
        }
        else{
            System.out.println("F(N+2) < 2^N: False");
            System.out.println(temp.getFibNum()+" > "+ Math.pow(2, N+2));
        }
    }
}
