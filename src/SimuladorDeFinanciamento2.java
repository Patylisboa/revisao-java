import java.util.Scanner;

public class SimuladorDeFinanciamento2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o valor total do empréstimo: ");
        double valorTotalEmprestimo = scanner.nextDouble();

        System.out.println("Insira a taxa de juros anual [em porcentagem]: ");
        double taxaDeJurosAnual = scanner.nextDouble();

        System.out.println("Insira o prazo de pagamento em anos: ");
        int prazoDePagamentoEmAnos = scanner.nextInt();

        double taxaJurosMensal = (taxaDeJurosAnual / 100) / 12;
        int numeroMeses = prazoDePagamentoEmAnos * 12;

        double fator = elevarPotencia(1 + taxaJurosMensal, numeroMeses);
        double parcelaMensal = (valorTotalEmprestimo * taxaJurosMensal) / (1 - (1 / fator));


        System.out.printf("Parcela Mensal: %.2f%n", parcelaMensal);

        scanner.close();
    }

    public static double elevarPotencia(double base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else if (expoente == 1) {
            return base;
        } else {
            double metade = elevarPotencia(base, expoente / 2);
            if (expoente % 2 == 0) {
                return metade * metade;
            }else {
                return base*metade*metade;
            }
        }
    }
}
