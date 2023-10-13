import static java.lang.Math.max;

public class RopeCuttinProblem {
    public static int fun(int n, int a, int b, int c)
    {
     if (n==0)
     {
         return 0;
     }
     if(n<=-1)
     {
         return -1;
     }

     int res = Math.max(fun(n-a, a, b, c),
               Math.max(fun(n-b, a, b, c),
                       fun(n-c, a, b, c)));
        if(res == -1)
        {
            return -1;
        }
        return res+1;



    }
    public static void main(String[] args) {
        System.out.println(fun(23, 11, 9, 12));
    }
}
