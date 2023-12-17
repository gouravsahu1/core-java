class demo
{
public static void main(String []arg)
{
int x=10;
int y=20;
int z=30;
String a=(x>y && x>z)?"x":(y>x && y>z)?"y":"z";
String b=(x%2==0)?"x is even":"x is odd";
System.out.println(a+"is greatest");
System.out.println(b);
}
}