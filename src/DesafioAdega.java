import javax.swing.*;

public class DesafioAdega {
    public static void main(String[] args){

        StringBuilder stringBuilder = new StringBuilder();

        double procentagemVinho, totalGeral;
        int qtdVinhoTinto, qtdVinhoBranco, qtdVinhoRose;

        String input = JOptionPane.showInputDialog(null, "Digite o tipo de vinho ('T' para tinto, 'B' para branco, 'R' para rose) ou 'F' para finalizar:");

        for(int i=0; i < 3; i++){
            switch (input){
                case "T":
                    qtdVinhoTinto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a qtd vinho A: "));
                break;
                case "B":
                    qtdVinhoBranco = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a qtd vinho B: "));
                    break;
                case "R":
                    qtdVinhoRose = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd de vinho C: "));
                    break;
            }
        }
    }
}
