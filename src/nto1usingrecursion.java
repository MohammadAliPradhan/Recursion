public class nto1usingrecursion {
    public static void fun(int n)
    {
        if (n==0)
        {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args) {

        fun(5);
    }
}
//theta n
//theta n