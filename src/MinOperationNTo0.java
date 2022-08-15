public class MinOperationNTo0 {

    static int minOperationNTo0(int n){
        int operation =0;

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
