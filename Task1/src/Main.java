import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        VehicleShowroom vehicleShowroom = new VehicleShowroom();
        while (true){
            Scanner sc = new Scanner(System.in);
            int option, subOption;
            System.out.println("Choose an action below: ");
            System.out.println("1. Add New Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Show vehicle list with details");
            System.out.println("4. Show vehicle list with current expected number of visitors");
            System.out.println("5. Exit");
            System.out.println("Enter an option(1 or 2 or 3 or 4 or 5): ");
            try {
                option = sc.nextInt();
            }catch (Exception e){
                //if user enters non integer type data, this message will be displayed
                System.err.println("Option must be an integer between 1 to 5!, Please give valid options ");
                continue;
            }
            if(option <=0 || option>=6){
                System.out.println("This option is not available. Give an available option next time");
                System.out.println();
            }
            if(option==1){
                NormalVehicle normalVehicle = null;

                System.out.println("__________Add New Vehicle__________");
                System.out.println("Select the vehicle type to add: ");
                System.out.println("1. Normal Vehicle");
                System.out.println("2. Sports Vehicle");
                System.out.println("3. Heavy Vehicle");

                System.out.println("Enter vehicle type(1/2/3): ");
                subOption = sc.nextInt();

                System.out.println("Now, provide descriptions about the vehicle: ");
                System.out.println("Enter the modelNumber");
                String model = sc.next();

                System.out.println("Enter the engine power: ");
                double power = sc.nextDouble();

                System.out.println("Enter the tire size: ");
                double tireSize = sc.nextDouble();

                if(subOption==1){
                    System.out.println("Select the engine type: ");
                    String engine = sc.next();
                    normalVehicle = new NormalVehicle(model,engine,power,tireSize);

                }
                if(subOption==2){
                    System.out.println("Enter turbo name: ");
                    String turbo = sc.next();
                    normalVehicle = new SportsVehicle(model,power,tireSize,turbo);
                }
                if(subOption==3){
                    System.out.println("Enter the weight: ");
                    double weight = sc.nextDouble();
                    normalVehicle = new HeavyVehicle(model,power,tireSize,weight);
                }

                if(normalVehicle!=null) {
                    vehicleShowroom.addVehicle(normalVehicle);
                }
                //System.out.println("total vehicle = "+vehicleShowroom.vehicleList.size());
            }

            if(option==2){
                if(vehicleShowroom.vehicleList.size()==0){
                    System.err.println("The vechile showroom is empty now. No vehicle can be removed currently!");
                    continue;
                }
                System.out.println("Select Vehicle type to remove: ");
                System.out.println("1. Normal Vehicle");
                System.out.println("2. Sports Vehicle");
                System.out.println("3. Heavy Vehicle");
                System.out.println("Enter Vehicle type(1/2/3):");
                subOption  = sc.nextInt();
                if(subOption==1) vehicleShowroom.removeVehicle("NormalVehicle");
                if(subOption==2)vehicleShowroom.removeVehicle("SportsVehicle");
                if(subOption==3)vehicleShowroom.removeVehicle("HeavyVehicle");
            }

            if(option==3){
                vehicleShowroom.showVehicleListDetails();
            }
            if(option==4){
                vehicleShowroom.showListWithExpectedCustomerNo();
            }
            if(option==5){
                break;
            }

        }
    }
}
