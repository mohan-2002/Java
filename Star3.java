import java.util.*;
class Star3
{
public static void main(String[]args)
{
long n,i,j;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number");
n=in.nextLong();

for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}

for(i=1;i<=n;i++)
{
for(j=n-1;j>=i;j--)
{
System.out.print("*");
}
System.out.println();
}
}
}