class Logic
{
    void checkPerfect(int num)
    {
         int isum=0, iCnt=0;

        for(iCnt=1; iCnt <= num / 2; iCnt++)
        {
           if(num % iCnt == 0)
           {
            isum = isum + iCnt;
           }
        }

        if(isum == num)
        {
            System.out.println(num+" is a perfect number");
        }
        else
        {
            System.out.println(num+" is not a perfect number");
        }
        

         
    }
}

class program20_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}