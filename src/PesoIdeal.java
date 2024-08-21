import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double altura, pesoIdeal;
        String sexo;
        System.out.println("Digite a latura");
        altura = scanner.nextDouble();
        System.out.println("Digite o sexo");
        sexo = scanner.next();

        if(sexo.equals("homens")){
            pesoIdeal = (72.7 * altura) -58;
            System.out.println("o Peso ideal é" + pesoIdeal);
        }else {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal é" + pesoIdeal);
        }
    }
}
