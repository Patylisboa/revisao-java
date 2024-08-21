import javax.swing.*;
import java.util.Scanner;

public class salario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double salarioMensal, indiceReajuste, novoSalario ;


        salarioMensal =  Double.parseDouble(JOptionPane.showInputDialog(null," Enter Salary: "));
        indiceReajuste = Double.parseDouble(JOptionPane.showInputDialog(null," Enter Reajuste: "));

        novoSalario = salarioMensal + (salarioMensal * indiceReajuste / 100);


        System.out.println(novoSalario);

    }
}
