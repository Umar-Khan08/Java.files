import java.util.*;
class Grade
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks of the student");
        int m=sc.nextInt();
        if(m>=90)
            System.out.println("Grade: A");
        else if(m>75 && m<90)
            System.out.println("Grade: B");
        else if(m>60&&m<=75)
            System.out.println("Grade: C");
        else if(m>30&&m<=60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }
}