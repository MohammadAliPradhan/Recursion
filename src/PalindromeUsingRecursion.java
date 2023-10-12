
public class PalindromeUsingRecursion {
    //saas

    public static boolean CheckString(String strA)
    {
        if(strA.length()<=1){
            return true;
        }
        if (strA.charAt(0) == strA.charAt(strA.length()-1))
        {
            return CheckString(strA.substring(1, strA.length()-1));
        }else {
            return false;
        }

 }



    public static void main(String[] args) {
        String strA = "MaaS";
        boolean isPalindrome = CheckString(strA);
        if (isPalindrome) {
            System.out.println(strA + " is a palindrome.");
        } else {
            System.out.println(strA + " is not a palindrome.");
        }
    }
}
