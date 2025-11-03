class Logic
{
    void countDigits(int num)
    {
        int icount = 0, iDigit =0;

        while(num != 0)
        {
            iDigit = num % 10;

        if(iDigit >0 || iDigit < 10)
        {
            icount++;
        }
            num = num / 10;
        }
        System.out.println("given number of digits are :"+icount);
    }
}

class program16_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}