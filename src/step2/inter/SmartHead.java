package step2.inter;

public class SmartHead implements robot{
    @Override
    public String work()
    {
        System.out.println("똑똑한 이동");
        return "Run";
    }
}
