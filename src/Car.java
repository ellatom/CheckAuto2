public class Car extends Vihicle {

    public Car(int numWheels,String engineType,int leftEnergy)
    {
        super(engineType, numWheels,leftEnergy);
    }

    public void print(){
        System.out.print(super.toString() + "");
    }
}
