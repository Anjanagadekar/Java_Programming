class Logic
{
    void sumEvenOddDigits(int num)
    {
        int  iDigit=0,iEvensum=0, iOddsum=0;

    if(num < 0)
    {
        num = -num;
    }
    
    while(num > 0)
    {
        iDigit = num % 10;
        if((iDigit % 2) == 0)
        {
           iEvensum=iEvensum+iDigit;
        }
        else
        {
            iOddsum=iOddsum+iDigit;
        }
        num = num / 10;
    }
    System.out.println("sum of even digits "+iEvensum);
    System.out.println("sum of odd digits "+iOddsum);
         
    }
}

class program18_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}