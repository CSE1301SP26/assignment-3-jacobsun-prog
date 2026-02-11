import java.util.Scanner;
public class FrequencyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many dice?");
        int dice = scanner.nextInt();
        System.out.println("How many rolls?");
        int[] arr = new int[scanner.nextInt()];
        
        for (int i = 0; i<arr.length; i++){
            int total = 0;
            for (int j = 1; j<=dice; j++){
                double x = Math.random();
                if (x<(1.0/6)){
                    total += 1;
                }
                else if (x<(2.0/6)){
                    total += 2;
                } 
                else if (x<(3.0/6)){
                    total += 3;
                }
                else if (x<(4.0/6)){
                    total += 4;
                }
                else if (x<(5.0/6)){
                    total += 5;
                }
                else{
                    total += 6;
                }
            }
            arr[i] = total;

        }

        for (int i =dice;i<=dice*6;i++) {
            int rolls = 0;
            for (int j = 0; j<arr.length; j++){
                if (arr[j] == i){
                    rolls += 1;
                }
                }
            System.out.println("You rolled "+i+" "+rolls+" many times!");


        }
    }
}