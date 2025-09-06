import java.util.*;
class swap
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to swapping station");
        System.out.println("Enter the value of A");
        int a=sc.nextInt();
        System.out.println("Enter the value of B");
        int b=sc.nextInt();
        int c=0;
        c=a;
        a=b;
        b=c;
        System.out.println("New value of a is"+"\t"+a);
        System.out.println("New value of b is"+"\t"+b);
    }
}