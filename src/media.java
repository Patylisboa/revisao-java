import java.util.Scanner;

public class media {
    public static void main(String[] args){
        double nota1, nota2, media, frequencia;
        double MEDIA_PARA_PASSAR=7.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a nota 1:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2:");
        nota2 = scanner.nextDouble();
        System.out.println("Digite a nota 3:");
        media = (nota1 + nota2)/2;
        System.out.println("Sua nota é: " + media);

        if(media >= MEDIA_PARA_PASSAR){
            System.out.println("Resultado: Aprovado");
        }
        else {
            System.out.println("Resultado: Reprovado");
        }

        scanner.close();

    }
}
