import javax.swing.*;

public class horasTrabalhadas {
    public static void main(String[] args){
        int codigo;
        double numeroDeHoras,salario, ex;

       codigo =  Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: ", JOptionPane.QUESTION_MESSAGE));
       numeroDeHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de horas de um operário:", JOptionPane.QUESTION_MESSAGE));

       salario = 10 * numeroDeHoras;
       if(numeroDeHoras > 50){
           ex = numeroDeHoras - 50;

       }

    }
}
