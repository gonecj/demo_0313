package SOLID.SRP.homework;

public class minicarFuel implements functionFuel{
    Vehicle fuelStatus;
    final int _maxFuel = 10;
    final int _zeroLimit = 1;
    public minicarFuel()
    {
        fuelStatus = new Vehicle(_maxFuel);
    }
    // this is not a car's responsibility.
    @Override
    public void reFuel(){
        fuelStatus.setRemainingFuel(fuelStatus.getMaxFuel());
    }

    @Override
    public void accelerate() {
        int getRemainingFuel = fuelStatus.getRemainingFuel();
        fuelStatus.setRemainingFuel(getRemainingFuel--);
    }

    @Override
    public boolean endFuel()
    {
        return fuelStatus.getRemainingFuel() == _zeroLimit;
    }
}
