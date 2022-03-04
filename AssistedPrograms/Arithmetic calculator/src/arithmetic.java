
import java.util.Scanner;
public class arithmetic
{
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	int choice =sc.nextInt();
	int  a,b,result;
	switch(choice)
	{
	case 1: System.out.println("Enter any two number to addition");
	        a =sc.nextInt();
	        b =sc.nextInt();
	        result=a+b;
	        System.out.println("Addition of "+a+" and "+b+" is: "+result);
            break;
	case 2: System.out.println("Enter any two number to subtraction");
            a =sc.nextInt();
            b =sc.nextInt();
            result=a-b;
            System.out.println("Subtraction of "+a+" and "+b+" is: "+result);
            break;        
	case 3: System.out.println("Enter any two number to multiplication");
            a =sc.nextInt();
            b =sc.nextInt();
            result=a*b;
            System.out.println("Multiplication of "+a+" and "+b+" is: "+result);
            break;
	case 4: System.out.println("Enter any two number to Division");
            a =sc.nextInt();
            b =sc.nextInt();
            result=a/b;
            System.out.println("Addition of "+a+" and "+b+" is: "+result);
            break;
   default: System.out.println("you have entered wrong choice");
              break;
	}
  }
}