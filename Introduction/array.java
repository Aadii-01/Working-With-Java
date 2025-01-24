import java.util.Arrays;

public class array {
    public static void main(String[] args){
        int[] numbers ;
        numbers = new int[5];

        int[] number2 = {10,2,3,24,5};

        int firstNum = number2[1]; //Value at index number 1
        number2[2] = 20;
        //Using for loop
        for(int i=0; i< number2.length ; i++) {
            System.out.printf("%d ", number2[i]);
        }
        System.out.println();
        //Using for-each loop
        for(int i : number2){
            System.out.println(i);
        }
        System.out.println();

        System.out.println(Arrays.toString(number2));
        Arrays.sort(number2);
        System.out.println(Arrays.toString(number2));

        int index = Arrays.binarySearch(number2, 24);
        System.out.println("Index of 8 is at " + index);

        int[] number1 = new int[5];
        Arrays.fill(number1 , 0, 3, 10);
        System.out.println(Arrays.toString(number1));
        int[] myNums = {10,10,10,0,0};
        System.out.println(Arrays.equals(number1, myNums));
    }
}
