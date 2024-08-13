import javax.swing.JOptionPane;
public class Exemplo2 {
    public static void main(String[] args) {
        int c025, c010, c005;
        double total;

        // Solicita a quantidade de moedas ao usuário
        c025 = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas moedas tem de R$ 0,25:"));
        c010 = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas moedas tem de R$ 0,10:"));
        c005 = Integer.parseInt(JOptionPane.showInputDialog("Quantas moedas tem de R$ 0,05:"));

        // Calcula o valor total das moedas
        total = c025 * 0.25 + c010 * 0.10 + c005 * 0.05;

        // Exibe o valor total
        JOptionPane.showMessageDialog(null, "O total de moedas ao todo é R$ " + total);
    }
}

/* Escreva um algoritmo que leia quantidade de moedas de R$ 0,25 ,  R$ 0,10 R$ e R$0,05 
 * armazenados em um cofre . Calcule e mostre o valor em reais (R$)
 */
