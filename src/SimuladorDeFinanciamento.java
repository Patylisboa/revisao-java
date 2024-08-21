import java.util.Scanner;

public class SimuladorDeFinanciamento {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o valor total do empréstimo: ");
        double valorTotalEmprestimo = scanner.nextDouble();

        System.out.println("Insira a taxa de juros anual [em porcentagem]: ");
        double taxaDeJurosAnual = scanner.nextDouble();

        System.out.println("Insira o prazo de pagamento em anos: ");
        int prazoDePagamentoEmAnos = scanner.nextInt();

        double taxaJurosMensal = (taxaDeJurosAnual / 100) / 12;
        int numeroMeses = prazoDePagamentoEmAnos * 12;


        double parcelaMensal = (valorTotalEmprestimo * taxaJurosMensal) / (1 - Math.pow(1 + taxaJurosMensal, -numeroMeses));


        System.out.printf("Parcela Mensal: %.2f%n", parcelaMensal);

        scanner.close();
    }
}
