package SOLID.OCP.test;

public class Bsocket implements socket{
    @Override
    public void socketPush()
    {
        System.out.println("B눌렸다.");
    }

    public void push()
    {
        System.out.println("B눌렸다.");
    }
}
