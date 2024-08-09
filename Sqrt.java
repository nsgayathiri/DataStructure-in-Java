public class Sqrt 
{
    public static void main(String args[])
    {
        int num = 87;
        // boolean isSqrt = false;
        // for(int i = 1 ; i < 50 ;i++)
        // {
        //     int sqrt = i*i;
        //     if(sqrt == num)
        //     {   isSqrt =true;
        //         System.out.println("Square root of the given number is:" +i);
        //     }

        // }
        // if(isSqrt)
        // {
        //     System.out.println("Perfect Square root");
        // }
        // else
        // {
        //     System.out.println("Not a Perfect Square root");
        // }
        int i = 1;
        int sub = num -i;
        int count = 1;
        
        while(sub != 0 && sub < 0)
        {   
            i = i + 2;
            sub = sub - i;
            count++;
        }
        

        if(sub >= 1)
        {
            System.out.println("Not a Perfect Number");
        }
        else
        {
            System.out.println(count);
            System.out.println("A");
        }

        
        
    }
    
}
