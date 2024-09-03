import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();


        if (N > 2 && N < 1000) {

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", i, N, i * N);
            }
        }

        scanner.close();
    }
}