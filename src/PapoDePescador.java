import javax.swing.*;

public class PapoDePescador {
    public static void main(String[] args) {
        double P, E, M;
        double REGULAMENTO = 50;
        double MULTA=4;

        P = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso de peixes:", JOptionPane.QUESTION_MESSAGE));
        if(P > REGULAMENTO){
            E = P - REGULAMENTO;
            M = E * MULTA;
            JOptionPane.showMessageDialog(null, "O excedente foi de: " + E + "\nA multa será de: " + M);
        }else {
            E = 0;
            M = 0;
            JOptionPane.showMessageDialog(null, "O excedente: " + E + "\n Não tem multa: " + M);

        }
    }
}
