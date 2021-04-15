import java.util.*;
class demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        int middle=len/2;
        for(int i=0;i>=middle;i++)
        {
            System.out.println("\n"+str[i]);
        }
        for(int j=0;j<middle;j++)
        {
            System.out.println("\n"+str[i]);
        }


    }
}