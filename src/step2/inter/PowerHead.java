package step2.inter;

public class PowerHead implements robot{
    @Override
    public String work()
    {
        System.out.println("강력한 이동");
        return "Run";
    }
}
