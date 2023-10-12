public class SumOfDigitsUsingRecursionNonTail {
    public static int fun(int n, int k)
    {
        if(n==1)
        {
            return k;
        }

        return fun(n-1, k+n);
    }
    public static void main(String[] args) {
        int answer = fun(10, 1);
        System.out.println(answer);
    }
}

//This one is tailrecursive method lets solve it with the nontailrecursive method
