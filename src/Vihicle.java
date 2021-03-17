import java.util.ArrayList;
import java.util.Comparator;

public class Vihicle
{
    // Instance Variables
    private String engineType;//Fuel or Electric Engine
    private int numWheels;
    private int leftEnergy;
    // Constructor Declaration of Class
    public Vihicle(String engineType, int numWheels,int leftEnergy)
    {
        this.engineType = engineType;
        this.numWheels = numWheels;
        this.leftEnergy = leftEnergy;
    }
    public String getEngineType(){
        return this.engineType;
    }
    public int getNumberOfWheels(){
        return this.numWheels;
    }
    public int getAmountOfEnergy() {
        return this.leftEnergy;
    }

    public String toString()
    {
        String a ="";
        if(this.engineType =="fuel")
            a= "liters";
        else
            a="%";

        return ("Object type: "+this.getClass()+
                " ,engine type: "+this.engineType+
                " ,number of wheels: "+this.numWheels+
                " ,energy: "+this.leftEnergy +" "+ a);
    }

    public static void main(String[] args)
    {
        Car car_a = new Car(4,"fuel",20);
        Car car_b = new Car(4,"electrical",40);
        Motorcycle moto_a = new Motorcycle(2,"fuel",5);
        Motorcycle moto_b = new Motorcycle(2,"electrical",80);

        //I choose array list since i didnt know if there would be only 4 or more vihicles.
        ArrayList<Vihicle> vList= new ArrayList<Vihicle>();
        //adding cars and motorcycle to array list
        vList.add(car_a);
        vList.add(car_b);
        vList.add(moto_a);
        vList.add(moto_b);

        //sort by engine type, than by energy desc
        vList.sort(Comparator.comparing(Vihicle::getEngineType).thenComparing(Vihicle::getAmountOfEnergy).reversed());

        //print all sorted list
        for(Vihicle v:vList)
            System.out.println(v.toString());
    }
}
