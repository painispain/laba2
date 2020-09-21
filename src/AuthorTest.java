import java.lang.*;

class Test_Author
{
    public static void main(String[] args)
    {
        Author a1=new Author("Pukinator Stanislav", 'M', "pukpukstas@gmail.com");
        Author a2=new Author("vitalina vitalinovna", 'W', "vitvit@gmail.com");
        System.out.println("\n"+a1.toString());
        System.out.println(a2.toString());
    }
}