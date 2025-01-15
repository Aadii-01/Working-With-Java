public class Loops {
    public static void main(String[] args){
        for(int i = 1; i<=5; i++){
            for(int j=0; j<5-i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        int var = 2;
        while (true){
            var++;
            if(var == 3){
                continue;
            }
            System.out.println("Hi");
            if(var == 4){
                break;
            }
        }

        do {
            System.out.println(var);
            var++;
        } while(var<=5);
    }
}
