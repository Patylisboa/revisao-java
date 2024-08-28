import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura, pesoIdeal;
        String sexo;
        System.out.println("Digite a altura");
        altura = scanner.nextDouble();
        System.out.println("Digite o sexo");
        sexo = scanner.next();

        if (sexo.equalsIgnoreCase("homens")) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("o Peso ideal é: %.2f%n" +  pesoIdeal);
        } else if(sexo.equalsIgnoreCase("feminino")){
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal é: %.2f%n" + pesoIdeal);
        } else{
            System.out.println("Informe um valor válido para sexo");
        }
    }
}

