import javax.swing.JOptionPane;

public class Parcelas {
    public static void main(String[] args) {
        double valorCompra, valorFinal, valorParcelado;
        int qtdeParcelas, juros = 0;

        valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da compra:"));
        qtdeParcelas = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de parcelas:"));

        switch (qtdeParcelas) {
            case 2:
                juros = 3;
                break;
            case 4:
                juros = 7;
                break;
            case 6:
                juros = 9;
                break;
            case 12:
                juros = 12;
                break;
            default:
                juros = -1;
        }

        if (juros == -1) {
            JOptionPane.showMessageDialog(null, "Número de parcelas incorreto");
        } else {
            valorFinal = valorCompra + (valorCompra * juros / 100);
            valorParcelado = valorFinal / qtdeParcelas;
            JOptionPane.showMessageDialog(null, "O valor de cada parcela é: " + valorParcelado);
        }
    }
}
