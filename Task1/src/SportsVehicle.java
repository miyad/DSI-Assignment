public class SportsVehicle extends NormalVehicle{
    String turbo;
    SportsVehicle(String modelNumber, double enginePower,double tireSize, String turbo){
        super(modelNumber,"oil",enginePower,tireSize);
        this.turbo = turbo;
    }
    public String toString(){
        //print details
        return super.toString()+", turbo: "+this.turbo;
    }
}
