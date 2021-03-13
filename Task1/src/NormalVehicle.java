public class NormalVehicle {
    String modelNumber;
    String engineType;
    double enginePower;
    double tireSize;
    NormalVehicle(String modelNumber,String engineType,double enginePower, double tireSize){
        this.modelNumber = modelNumber;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.tireSize = tireSize;
    }

    public String toString(){
        // print the details
        return this.getClass().getName()+", model: "+this.modelNumber+", Engine type: "+this.engineType+", power: "+this.enginePower+", tireSize: "+this.tireSize;
    }

}
