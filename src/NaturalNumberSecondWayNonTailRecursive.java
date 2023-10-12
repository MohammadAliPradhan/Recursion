public class NaturalNumberSecondWayNonTailRecursive {
    public static int fun(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+fun(n-1);
    }
    public static void main(String[] args) {
       int answer =  fun(5);
        System.out.println(answer);
    }
}

