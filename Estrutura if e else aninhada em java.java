import javax.swing.JOptionPane;

public class Medias{
    public static void main(String args []){
        double nota1,nota2,media;
        nota1 = double.parseDouble(
            JOptionPane.showInputDialog(null,"Digite a primeira nota :"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog('Digite a primeira nota : '));
            nota3 = Double.parseDouble(JOptionPane.showInputDialog('Dogote a segunda nota : '));
        media = (nota1 + nota2)/2;
        if (media >= 6.0){
            JOptionPane.showMessageDialog(null,"Aprovado");
        }
        else
        if (media >= 3.0){
            JOptionPane.showMessageDialog(null,"A nota esta abaixo da média")
        }
    }
}
