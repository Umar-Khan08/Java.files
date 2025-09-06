import java.util.*;
class Pnz
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n=sc.nextInt();
        if(n>0)
            System.out.println("The number is a positve number");
        else if(n<0)
            System.out.println("The number is a negative number");
        else
            System.out.println("The number is zero");
    }
}