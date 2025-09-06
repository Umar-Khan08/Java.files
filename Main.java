import java.util.*;
class program4
{  boolean leap(int n)
{
    if(n%4==0&&n%100!=0||n%400==0)
        return true;
    else
        return false;
}
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        program4 obj= new program4();
        int month[]={31,31,28,31,30,31,30,31,31,30,31,30,31};String mn[]={"","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        String[] week = {"Saturday","Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
        System.out.println("enter day number and number of days");
        int dn=sc.nextInt();
        int nd=sc.nextInt();
        System.out.println("Enter year");
        int t=0;int mm=0;
        int y=sc.nextInt();
        String s="";
        s=s+y;
        if(s.length()==4)
        {  for(int i=1;i<12;i++)
        {    if(obj.leap(y)==true)
            month[2]=29;
            mm=i;
            if(dn<=month[i])
                break;
            dn=dn-month[i];
        }
            if(mm>12)
            { mm=1;
                y=y+1;
            }

            if(dn==0)
            { if(obj.leap(y)==true)
                month[2]=29;
                mm=mm-1;
                dn=month[mm];
                if(mm==0)
                {
                    mm=12;
                    y=y-1;
                }
            }
            System.out.println("Entered date:"+mn[mm]+" "+dn+","+y);
            int n=dn;
            dn=dn+nd+1;
            while(dn>month[mm])
            {  if(obj.leap(y)==true)
                month[2]=29;
                dn=dn-month[mm];
                mm=mm+1;
                if(mm>12)
                { mm=1;
                    y=y+1;
                }
            }
            dn=dn-1;
            if(dn==0)
            { if(obj.leap(y)==true)
                month[2]=29;
                mm=mm-1;
                dn=month[mm];
                if(mm==0)
                {
                    mm=12;
                    y=y-1;
                }
            }System.out.println(nd+" "+"DAYS LATER:"+mn[mm]+" "+dn+","+y);
        }else
            System.out.println("Invalid input");
    }
}