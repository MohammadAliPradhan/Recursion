


public class FactorialNonrTailRecursive {
    public static void fun(int n, int k)
    {

        if(n==1 || n==0)
        {
            System.out.println("factorial is "+ k);
            return;
        }
        fun(n-1, k*n);

    }
    public static void main(String[] args) {
        fun(5, 1);
    }

}