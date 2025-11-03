class Logic
{
    void countEvenOddRange(int num)
    {
        int i=0, iEvenFrequency=0, iOddFrequency=0;

    if(num < 0)
    {
        num = -num;
    }
    
    for(i=1; i<=num; i++)
    {
       
        if((i % 2) == 0)
        {
           iEvenFrequency++;
        }
        else
        {
            iOddFrequency++;
        }
        
    }
    System.out.println("even numbers "+iEvenFrequency);
    System.out.println("odd numbers "+iOddFrequency);
         
    }
}

class program21_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}