
public class NaturalNumberUsingSum {
    public static void fun(int n, int k){
        if(n==1){
            System.out.println(k);
            return;
        }
        fun(n-1, k+n);

    }
    public static void main(String[] args) {
        fun(6, 1);
    }

}