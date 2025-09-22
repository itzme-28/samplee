import java.util.Scanner;
class Rectangle
{
    double length,width;
    public Rectangle()
    {
        read_Attributes();
    }
    public void read_Attributes()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter length:");
        length=sc.nextDouble();
        System.out.print("enter width:");
        width=sc.nextDouble();
    }
    public double perimeter()
    {
        return 2*(length+width);
    }
    public double area()
    {
        return (length*width);
    }
public static void main(String[] args)
{
    Rectangle rect = new Rectangle();
    System.out.println("perimeter:"+ rect.perimeter());
    System.out.println("Area;"+ rect.area());

}
}