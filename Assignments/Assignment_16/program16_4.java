class Logic
{
    void reverseNumber(int num)
    {
        int ireverseno = 0, iDigit =0;

        while(num != 0)
        {
            iDigit = num % 10;
            ireverseno= ireverseno * 10 + iDigit;
            num = num / 10;
        }
        System.out.println("reverse numbers is:"+ireverseno);
    }
}

class program16_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}