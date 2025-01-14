import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean is_Sunny = true;
        int a = -5;

        System.out.println("Enter name : ");
        String name = scanner.nextLine();

        System.out.println("Enter prn : ");
        String prn = scanner.nextLine();

        if(name.equals("Aadi")){
            if(prn.equals("1") || (prn.equals("2"))) {
                System.out.println("Hi " + name);
            }
        }

        System.out.println("Outside of the condition");
        scanner.close();



    }
}
