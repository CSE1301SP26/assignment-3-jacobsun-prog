import java.util.Scanner;
public class SymmetricalImage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A matrix of n rows and m columns will be generated. What is your n?");
        int n = scanner.nextInt();
        System.out.println("And your m?");
        int m = scanner.nextInt();
        String[][] arr = new String[n][m];
        int StarCount = n*m/4;
        //star position generator
        for (int i = 1; i<= StarCount; i++){
            int xPos = 0;
            double xPosR = Math.random();
                for (int j = 1; j<=n;j++){
                    if (xPosR < (double)j/n){
                        xPos = j;
                        break;
                    }
                }
            int yPos = 0;
            double yPosR = Math.random();
                for (int j = 1; (double)j<=m;j++){
                    if (yPosR < (double)j/m){
                        yPos = j;
                        break;
                    }
                }
            arr[xPos-1][yPos-1] = "*";
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (arr[i][j] != "*"){
                    arr[i][j] = " ";
                }
            }
        }
        //print
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            for (int j=m-1;j>=0;j--){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }

    }
    
}