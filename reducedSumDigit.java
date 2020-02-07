import java.util.*;
import java.io.*;
class Reduced
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in)
int n=sc.nextInt();
if(n==0)
{
System.out.println(0);
}
else
{
int d=n%9;
if(d==0)
{
System.out.println(9);
}
else 
{
System.out.println(d);
}
}
}
}
