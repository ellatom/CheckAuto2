public class Motorcycle extends Vihicle {

    public Motorcycle(int numWheels,String engineType,int leftEnergy)
    {
        super(engineType, numWheels,leftEnergy);
    }
    public void print(){
        System.out.print(super.toString() + "");
    }

}
