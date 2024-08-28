import java.util.Scanner;

public class precoProduto {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        double preco;
        double valorPago;
        enum condicao{
                  DINHEIRO,
                  CHEQUE,
                  CARTAO_CREDITO,
                  DUAS_VEZES,
                  TRES_VEZES;
        }

        System.out.println("Digite o preço do produto ns etiqueta: ");
        preco = scanner.nextDouble();
        System.out.println("Digite a condição: ");


    }
}
