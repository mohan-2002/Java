import java.util.*;
class Star1
{
public static void main(String[]args)
{
long n,i,j;
Scanner in=new Scanner(System.in);
System.out.println("Enter upto which number series to be printed");
n=in.nextInt();

for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}



}
}