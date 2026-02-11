import java.util.Scanner;
public class BubbleSort {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("How many numbers?");
    int total = scanner.nextInt();
    int[] array = new int[total];

    for (int i = 1; i<=total; i++){
        System.out.println("What is number "+i+"?");
        array[i-1] = scanner.nextInt();
    }
    for (int i = 0; i<total-1; i++){
        for (int j = 1; j<= total-i-1; j++){
            if (array[j-1] > array[j]){
                int x = array[j-1];
                int y = array[j];
                array[j-1] = y;
                array[j] = x;
            }
        }
    }
    
    for (int p : array){
        System.out.println(p);}
}}