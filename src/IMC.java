import java.util.Scanner;

public class IMC {
    public static void main(String[] args){

        double IMC1= 18.5;
        double IMC2 = 25;
        double IMC3 = 30;
        Scanner scanner = new Scanner(System.in);
        double peso, altura, resultado;
        System.out.println("Digite o peso");
        peso = scanner.nextDouble();
        System.out.println("Digite a altura");
        altura = scanner.nextDouble();

        resultado = peso/(altura * altura);

        if(resultado < IMC1){
            System.out.println("Abaixo do peso");
        } else if(resultado >= IMC1 && resultado <= IMC2){
            System.out.println("Peso normal");
        }else if(resultado > IMC2 && resultado < IMC3) {
            System.out.println("Acima do peso");
        }else if(resultado > IMC3){
            System.out.println("Acima do peso");
        }
        scanner.close();
    }
}
