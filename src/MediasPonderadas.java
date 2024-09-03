import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args){
        int N;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        for (int i=0; i<N; i++){
            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double valor3 = scanner.nextDouble();

            double mediaPonderada = (valor1 * 2 + valor2 * 3 + valor3 * 5) / (2 + 3 + 5);
            System.out.printf("%.1f%n", mediaPonderada);
        }

        scanner.close();

    }
}
