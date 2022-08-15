public class MinOperationNTo0 {


    // making a number n from zero, condition is i can only double from 0 or add 1 in it
    // but its not making sense to me, as I just need the number of operations form 0 -n
    // Now what I can do is half the n and decrement 1 to reach 0
    //condition will be, half only when n is even and -1 otherwise
    static int minOperationNTo0(int n){
        int operation =0;

        //apply the operations until it becomes 0
        // and then return the number of operations
        while(n>0){
            if(n%2 ==0){
                n=n/2;
                operation++;
            }
            else{
                n-=1;
                operation++;
            }
        }return operation;

    }

    public static void main(String[] args) {

    }
}
