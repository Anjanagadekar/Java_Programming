class Logic
{
    void countFactors(int num)
    {
        int iCnt=0, icount=0;

    if(num < 0)
    {
        num = -num;
    }
    
    for(iCnt=1; iCnt<=num; iCnt++)
    {

        if((num % iCnt) == 0)
        {
           icount++;
        }
        
    }
    
    System.out.println("Number of factors are : "+icount);
         
    }
}

class program21_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}