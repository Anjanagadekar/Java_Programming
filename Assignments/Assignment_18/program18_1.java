class Logic
{
    void checkPrime(int num)
    {
        int iCnt=0 ;
        boolean bFlag = true;

    if(num < 0)
    {
        num = -num;
    }

    for(iCnt=2; iCnt<=(num / 2); iCnt++)
    {
        if((num % iCnt) == 0)
        {
            bFlag = false;
            break;          
        }
    }

    if(bFlag == true)
    {
        System.out.println("it is prime number");
    }
    else
    {
         System.out.println("it is not prime number");
    }

         
    }
}

class program18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(5);
    }
}