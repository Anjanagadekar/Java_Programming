class Logic
{
    void calculateSum(int n)
    {
         int iCnt=0, iSum=0;

        for(iCnt=1; iCnt<=n; iCnt++)
        {
            iSum = iSum+iCnt;
           
        }

         System.out.println("Sum of First N numbers is:"+iSum);
    }
}

class program16_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}