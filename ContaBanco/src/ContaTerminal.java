import java.util.Scanner;
import java.util.Random;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        String agency = "067-8";
        float balance = 0;
        boolean accountCreated = false;
        String name = "";
        int id = 0;
        String street = "";
        int house_number = 0;
        String neighborhood = "";
        String state = "";
        String state_abbreviation = "";
        //boolean proceed = true;

        Random random = new Random();

            int account_number = 1000000 + random.nextInt(9000000);
        
        while (true){
        System.out.println("\nTo continue, please type one of the options bellow: \n 1 - Create account \n 2 - Show my account information \n 3 - Show my information\n");
        System.out.println("Option: ");
        int option = input.nextInt();
        input.nextLine();


        if (option == 1) {
            System.out.println("\nHello, to create your bank account, please enter the following details:");

            System.out.println("Your name: ");
            name = input.nextLine();
            
            System.out.println("ID: ");
            id = input.nextInt();
            input.nextLine();

            System.out.println("\nNow you have to tell us your address");

            System.out.println("Street: ");
            street = input.nextLine();

            System.out.println("House number: ");
            house_number = input.nextInt();
            input.nextLine();

            System.out.println("Neighborhood: ");
            neighborhood = input.nextLine();

            System.out.println("State: ");
            state = input.nextLine();

            System.out.println("State abbreviation: ");
            state_abbreviation = input.nextLine();       
            
            System.out.println("Account created sucessfully!\n");
            accountCreated = true;

            System.out.println("Do you want to proceed? \n Type 1 to YES or any number to NO");
            int proceed_option = input.nextInt();
            input.nextLine();

            if (proceed_option == 1){
                continue;
            }else{
                break;
            }
            
        }else if (option == 2) {
            if (accountCreated == false){
                System.out.println("You do not have an account! Plase, create the account and try again");
            } else {
                System.out.println("\nHello, " + name + "! thank your for creating an account with our bank! " + "\nYour agency is: " + agency + "\nYour account number is " + account_number + "\nYour balence is: " + balance );

                System.out.println("\nDo you want to proceed? \n Type 1 to YES or any number to NO");
                int proceed_option = input.nextInt();
                input.nextLine();
     
                if (proceed_option == 1){
                    continue;
                }else{
                    break;
                }
            }

        }else if (option == 3){
            if (accountCreated == true){
                System.out.println("Your information: \n");
                System.out.println("Name: " + name + "\nID: " + id + "\n" + "\nAdress: " + "\n" + street + ", " + house_number + " - " + neighborhood + " - " + state + "/" + state_abbreviation);
                System.out.println("\nDo you want to proceed? \n Type 1 to YES or any number to NO");
                int proceed_option = input.nextInt();
                input.nextLine();

                if (proceed_option == 1){
                    continue;
                }else{
                    break;
                }
                

            }else{
                System.out.println("You do not have an account! Plase, create the account and try again");
                
                System.out.println("\nDo you want to proceed? \n Type 1 to YES or any number to NO");
                int proceed_option = input.nextInt();
                input.nextLine();

                if (proceed_option == 1){
                    continue;
                }else{
                    break;
                }
            
            }

        } else {
            System.out.println("Invalid option! Please try again with a valid option! ");
            continue;
        }

        input.close();
        }
    }
}
