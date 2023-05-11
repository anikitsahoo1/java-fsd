public class ThrowDemo
    {
        public static void main(String[] args)
        {

            int a=45,b=0,rs;

            try
            {
                if(b==0)        
                    throw(new ArithmeticException("Can't divide by zero."));
                else
                {
                    rs = a / b;
                    System.out.print("\n\tThe result is : " + rs);
                }
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }

            System.out.print("\n\tEnd of program.");
        }
    }





public class ThrowsDemo
    {
        void Division() throws ArithmeticException
        {
            int a=45,b=0,rs;
rs = a / b;
            System.out.print("\n\tThe result is : " + rs);
        }
         public static void main(String[] args)
        {
ThrowsDemo T = new ThrowsDemo();
             try
            {
                T.Division();
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }
            System.out.print("\n\tEnd of program.");
        }
    }



public class FinallyBlockDemo
    {
        public static void main(String[] args)
        {
            int a=45,b=0,rs=0;
            try
            {
                rs = a / b;
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }
            finally
            {
                System.out.print("\n\tThe result is : " + rs);
            }
        }
    }



class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 


public class Main 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("temp"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
