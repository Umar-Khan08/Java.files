import java.util.*;
class grade
{
     public static void main(String[]args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade to be encrypted");
        char ch=sc.next().charAt(0);
        System.out.println("Now please enter the value to be encrypted in the entered grade");
        int a=sc.nextInt();
        char ch2=(char)(ch+a);
        System.out.println("The encrypted grade is "+ch2);
        System.out.println("The original grade is "+ch);
     }
}