package SOLID.OCP.test;

public class Asocket implements socket{
    @Override
    public void socketPush()
    {
        System.out.println("A눌렸다.");
    }

    public void push()
    {
        System.out.println("A눌렸다.");
    }
}
