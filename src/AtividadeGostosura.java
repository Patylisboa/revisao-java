import javax.swing.*;
import java.util.Scanner;

public class AtividadeGostosura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços e pesos
        final double PRECO_SANDUICHE = 35.60;
        final double PRECO_QUEIJO_KG = 34.00;
        final double PRECO_PRESUNTO_KG = 53.90;
        final double PRECO_HAMBURGUER_KG = 45.90;
        final double PRECO_PAO_UNITARIO = 12.90 / 6; // Custo por unidade de pão
        final double PESO_PAO_UNITARIO_GRAMS = 520.0 / 6; // Peso de uma unidade de pão em gramas

        // Entrada
        String input = JOptionPane.showInputDialog(null, "Informe a quantidade de sanduíches a serem feitos:");
        int quantidadeSanduiches = Integer.parseInt(input);

        // Quantidades de ingredientes necessárias
        double queijoKg = (100 * quantidadeSanduiches) / 1000.0;
        double presuntoKg = (50 * quantidadeSanduiches) / 1000.0;
        double hamburguerKg = (100 * quantidadeSanduiches) / 1000.0;

        // Faturamento
        double faturamento = PRECO_SANDUICHE * quantidadeSanduiches;

        // Custo dos ingredientes
        double custoQueijo = queijoKg * PRECO_QUEIJO_KG;
        double custoPresunto = presuntoKg * PRECO_PRESUNTO_KG;
        double custoHamburguer = hamburguerKg * PRECO_HAMBURGUER_KG;

        // Custo e peso do pão
        double quantidadePaoGramas = quantidadeSanduiches * PESO_PAO_UNITARIO_GRAMS;
        double custoPao = quantidadeSanduiches * PRECO_PAO_UNITARIO;

        // Despesas totais
        double despesasTotais = custoQueijo + custoPresunto + custoHamburguer + custoPao;

        // Lucro
        double lucro = faturamento - despesasTotais;

        String resultado = String.format("Para fazer %d sanduíches, você vai precisar de:\n", quantidadeSanduiches) +
        String.format("- %.2f kg de queijo\n", queijoKg) +
        String.format("- %.2f kg de presunto\n", presuntoKg)+
        String.format("- %.2f kg de hambúrguer\n", hamburguerKg)+
        String.format("- %.2f g de pão\n", quantidadePaoGramas)+
        String.format("- %.2f faturamento\n", faturamento) +
        String.format("Despesas totais: R$ %.2f%n", despesasTotais)+
        String.format("Lucro: R$ %.2f%n", lucro);

        JOptionPane.showMessageDialog(null, resultado);

        scanner.close();
    }
}
