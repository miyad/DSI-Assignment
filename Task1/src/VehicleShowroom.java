import java.util.ArrayList;
import java.util.List;

public class VehicleShowroom {
    double  expectedNumberOfCustomer;
    List<NormalVehicle> vehicleList;

    VehicleShowroom(){

        this.expectedNumberOfCustomer = 30;
        vehicleList = new ArrayList<NormalVehicle>();

    }
    void addVehicle(NormalVehicle normalVehicle){
        this.vehicleList.add(normalVehicle);
        if(normalVehicle.getClass().getName()=="SportsVehicle"){
            this.expectedNumberOfCustomer+=20;
        }
    }

    NormalVehicle removeVehicle(String vehicleClass){
        int index = -1;
        for(int i =0 ;i< this.vehicleList.size();i++){
            if(this.vehicleList.get(i).getClass().getName()==vehicleClass){
                index = i;
                break;
            }
        }
        if(index==-1){
            System.err.println("Currently there is no "+vehicleClass+" in the showroom!");
            return  null;
        }
        else {
            if(this.vehicleList.get(index).getClass().getName()=="SportsVehicle"){
                this.expectedNumberOfCustomer-=20;
                //if this does not happen then expected number of customer can be arbitrarily large over the time
            }
            return this.vehicleList.remove(index);
        }
    }

    void showVehicleListDetails(){
        if(this.vehicleList.size()==0) System.out.println("The Vehicle Showroom is empty!\n");
        else System.out.println("The list of vehicles with details are shown below: ");
        for(int i = 0;i < this.vehicleList.size();i++){
            System.out.println((i+1)+" "+vehicleList.get(i));
        }
        System.out.println();
    }
    void showListWithExpectedCustomerNo(){
        if(this.vehicleList.size()==0) System.out.println("The Vehicle Showroom is empty!");
        else System.out.println("The list of vehicles are shown below: ");
        for(int i = 0;i < this.vehicleList.size();i++){
            NormalVehicle tmp = vehicleList.get(i);
            System.out.println((i+1)+" "+tmp.getClass().getName());
        }
        System.out.println();
        System.out.println("Current expected customer count = "+this.expectedNumberOfCustomer);
        System.out.println();
    }
}
