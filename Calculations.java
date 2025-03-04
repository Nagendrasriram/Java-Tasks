// 1.Create a Java program that functions as a basic calculator. It should take two numbers and perform operations like addition, subtraction, multiplication, and division based on user input.
import java.util.Scanner;
class Calculations{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A,B;
        System.out.print("Enter Value of A:");
        A=sc.nextInt();
        System.out.print("Enter Value of B:");
        B=sc.nextInt();
        System.out.println();
        System.out.println("Select any one operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Add of A and B:"+(A+B));
                break;
            case 2:
                System.out.println("Sub of A and B:"+(A-B));
                break;
            case 3:
                System.out.println("Mul of A and B:"+(A*B));
                break;
            case 4:
                if(B!=0)
                    System.out.println("Div of A and B:"+(A/B));
                else
                    System.out.println("take B another number");
                break;
            default:
                System.out.println("Select from given option ");
        }
        sc.close();    
    }

        
    }
