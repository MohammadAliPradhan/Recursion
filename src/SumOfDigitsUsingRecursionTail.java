public class SumOfDigitsUsingRecursionTail {
    public static int fun(int n)
    {
        if(n==0)
        {
            return n;
        }
        int k = n%10;
        return k+fun(n/10);

    }
    public static void main(String[] args) {
    int answer =     fun(873);
        System.out.println(answer);
    }
}
