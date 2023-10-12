public class NonTailRecursivSolution {
    public static void fun(int n, int k) {

        if (n == 0)
        {
            return;
        }
        System.out.println(k);
        fun(n-1, k+1);
    }
    public static void main(String[] args) {
        fun(7, 0);
    }
}
