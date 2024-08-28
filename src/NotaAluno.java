import javax.swing.JOptionPane;

public class NotaAluno {
    public static void main(String[] args) {
        // Solicita a quantidade de alunos na turma
        int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Informe a quantidade de alunos na turma:",
                        "Quantidade de Alunos", JOptionPane.QUESTION_MESSAGE));



        StringBuilder resultado = new StringBuilder();


        for (int i = 1; i <= qtdAlunos; i++) {
            String nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno " + i + ":",
                    "Nome do Aluno", JOptionPane.QUESTION_MESSAGE);
            String nota1Str = JOptionPane.showInputDialog(null, "Informe a primeira nota de " + nome +
                    ":", "Nota 1", JOptionPane.QUESTION_MESSAGE);
            double nota1 = Double.parseDouble(nota1Str);
            String nota2Str = JOptionPane.showInputDialog(null, "Informe a segunda nota de " + nome +
                    ":", "Nota 2", JOptionPane.QUESTION_MESSAGE);
            double nota2 = Double.parseDouble(nota2Str);

            // Calcula a média do aluno
            double media = (nota1 + nota2) / 2;

            // Adiciona o nome e a média do aluno ao resultado
            resultado.append("Aluno: ").append(nome).append(" - Média: ").append(String.format("%.2f", media))
                    .append("\n");
        }

        // Exibe o resultado final em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, resultado.toString(), "Médias dos Alunos", JOptionPane.INFORMATION_MESSAGE);
    }
}
