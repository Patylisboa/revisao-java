import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class IMCJOptionPane {
    public static void main(String[] args) {
        double IMC1 = 18.5;
        double IMC2 = 25.0;
        double IMC3 = 30.0;

        double peso, altura, resultado;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));

        resultado = peso / (altura * altura);
        BigDecimal bd = new BigDecimal(resultado).setScale(2, RoundingMode.HALF_EVEN);

        if (resultado < IMC1) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso - IMC= " + bd);
        } else if (resultado >= IMC1 && resultado <= IMC2) {
            JOptionPane.showMessageDialog(null, "Peso normal - IMC = " + bd);
        } else if (resultado > IMC2 && resultado <= IMC3) {
            JOptionPane.showMessageDialog(null, "Acima do peso - IMC = " + bd);
        } else {
            JOptionPane.showMessageDialog(null, "Obesidade - IMC = " + bd);
        }
    }
}