public class SumOfDigitsUsingRecursionTail {
    public static int fun(int n)
    {
        if(n==1)
        {
            return n;
        }
        return n+fun(n-1);
    }
    public static void main(String[] args) {
    int answer =     fun(3);
        System.out.println(answer);
    }
}
