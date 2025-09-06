import java.util.*;
class Age
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int a=sc.nextInt();
        if(a<13)
            System.out.println("Age Group: Child" );
        else if(a>=13&&a<20)
            System.out.println("Age Group: Teen");
        else if(a>=20&&a<60)
            System.out.println("Age Group: Adult");
        else
            System.out.println("Age Group: Senior Citizen");
    }
}