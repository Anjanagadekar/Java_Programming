class Logic
{
    void checkPalindrome(int num)
    {
        int iDigit=0, ireverseno = 0, ioriginal = num;

        while(num > 0)
        {
            iDigit = num % 10;
            ireverseno= ireverseno * 10 + iDigit;
            num = num / 10;
        }
        if(ioriginal == ireverseno)
        {
            System.out.println(ioriginal+" is a palindrome number.");
        }
        else
        {
            System.out.println(ioriginal+"is not a palindrome number.");
        }
    }
}

class program17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}