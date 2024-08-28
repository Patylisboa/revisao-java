import java.util.Scanner;

public class precoProduto2 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        double preco;
        double valorPago;


        System.out.println("Digite o preço do produto ns etiqueta: ");
        preco = scanner.nextDouble();
        System.out.println("Digite a condição: ");
        System.out.println("1 - A vista em dinheiro ou pix: (15% de desconto)");
        System.out.println("2 - A vista no cartão de crédito: (10% de desconto)");
        System.out.println("3 - Em duas vezes (preço normal sem juros)");
        System.out.println("4 - Em três vezes (preço normal mais 10% de juros");
        int condicaoPagamento = scanner.nextInt();

        switch (condicaoPagamento){
            case 1:
                valorPago = preco * (1 - 0.15);
                System.out.println("Valor " + valorPago);
                break;
            case 2:
                valorPago = preco * (1 - 0.10);
                System.out.println("Valor " + valorPago);
                break;
            case 3:
                valorPago = preco;
                System.out.println("Valor " + valorPago);
                break;

            case 4:
                valorPago = preco * 1.10;
                System.out.println("Valor " + valorPago);
                break;
            default:
                System.out.println("Opção de pagamento inválido! ");
                scanner.close();
                return;
        }
    }
}
