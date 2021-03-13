import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       NormalVehicle normalVehicle = new NormalVehicle("x1","oil",234,23);
        System.out.println(normalVehicle);
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
                System.out.println("option 1 selected");
            }
            if(option==2){
                System.out.println("option 2 selected");
            }
            if(option==3){
                System.out.println("option 3 selected");
            }
            if(option==4){
                System.out.println("option 4 selected");
            }
            if(option==5){
                break;
            }

        }
    }
}
