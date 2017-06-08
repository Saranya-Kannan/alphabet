import java.io.*;
import java.util.*;
public class alpha
{
public static void main(String agrs[])
{
char ch;
Scanner s=new Scanner(System.in);
System.out.println("entera character");
ch=s.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println("alphabet");
}
else
{
System.out.println("not a alphabet");
}
}
}
