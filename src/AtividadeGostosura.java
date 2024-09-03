import javax.swing.JOptionPane;

public class AtividadeGostosura {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Informe a quantidade de sanduíches a serem feitos:");
        int quantidadeSanduiches = Integer.parseInt(input);

        double faturamento = 0;
        int fatiasQueijoPorSanduiche = 2;
        int fatiasPresuntoPorSanduiche = 1;
        int rodelaHamburguerPorSanduiche = 1;

        int pesoQueijoPorFatia = 50;
        int pesoPresuntoPorFatia = 50;
        int pesoHamburguerPorRodela = 100;

        int pesoTotalQueijo = quantidadeSanduiches * fatiasQueijoPorSanduiche * pesoQueijoPorFatia;
        int pesoTotalPresunto = quantidadeSanduiches * fatiasPresuntoPorSanduiche * pesoPresuntoPorFatia;
        int pesoTotalHamburguer = quantidadeSanduiches * rodelaHamburguerPorSanduiche * pesoHamburguerPorRodela;


        double pesoTotalQueijoKg = pesoTotalQueijo / 1000.0;
        double pesoTotalPresuntoKg = pesoTotalPresunto / 1000.0;
        double pesoTotalHamburguerKg = pesoTotalHamburguer / 1000.0;

        faturamento = quantidadeSanduiches * 35.60;
        String resultado = String.format("Para fazer %d sanduíches, você vai precisar de:\n", quantidadeSanduiches) +
                String.format("- %.2f kg de queijo\n", pesoTotalQueijoKg) +
                String.format("- %.2f kg de presunto\n", pesoTotalPresuntoKg) +
                String.format("- %.2f kg de hambúrguer\n", pesoTotalHamburguerKg);

        JOptionPane.showMessageDialog(null, resultado);
        JOptionPane.showMessageDialog(null,  faturamento);
    }
}
