import java.util.Scanner;

public class NumerosInpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X;
        double inpar;
        X = scanner.nextInt();
        for(int i=1; i<=X; i++){

            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
