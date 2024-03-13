package SOLID.OCP.homework;

public class Greeter {
    public void run()
    {
        controlFormality formality = new controlFormality();
        formality.setFormality("mz");
        formality.say();
    }
}