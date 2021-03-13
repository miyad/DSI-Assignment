public class HeavyVehicle extends NormalVehicle{

    double weight;

    HeavyVehicle(String modelNumber,double enginePower,double tireSize,double weight){

        super(modelNumber,"diesel",enginePower,tireSize);
        this.weight = weight;

    }

    public String toString() {
        return super.toString()+", weight: "+this.weight;
    }
}
