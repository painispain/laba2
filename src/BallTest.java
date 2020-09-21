import java.lang.*;

class Test_Ball
{
    public static void main(String[] args)
    {
        Ball m1=new Ball(200, 200);
        System.out.println("\n"+m1);
        m1.move(50,35);
        System.out.println(m1);
        m1.move(-30,-15);
        System.out.println(m1);
    }
}