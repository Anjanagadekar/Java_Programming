class Logic
{
    void sumEvenNumbers(int n)
    {
         int iCnt=0, iEvensum=0;

        for(iCnt=1; iCnt<=n; iCnt++)
        {
           if(iCnt % 2 == 0)
           {
                iEvensum= iEvensum+iCnt;
           }
           
        }
        System.out.println("sum of all even numbers "+ iEvensum);

         
    }
}

class program20_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}