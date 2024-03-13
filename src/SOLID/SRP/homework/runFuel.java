package SOLID.SRP.homework;

public class runFuel {
    public void run()
    {
        minicarFuel minicar = new minicarFuel();
        minicar.accelerate();
        minicar.accelerate();
        minicar.accelerate();
        if(minicar.endFuel())
        {
            minicar.reFuel();
        }
    }
}
