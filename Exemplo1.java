import javax.print.attribute.standard.DialogOwner;
import javax.swing.JOptionPane;
public class Exemplo1{
    public static void main(String[] args) {
        int num1 , num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite o primeiron numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(
          "Digite o segundo numero"
        ));
        JOptionPane.showMessageDialog(null,"Soma : " + (num1 + num2));
        JOptionPane.showMessageDialog(null,"Subtração : " + (num1 - num2));
        JOptionPane.showMessageDialog(null, "Divisão : " + (num1 / num2));
        JOptionPane.showMessageDialog(null, "multiplicação : " + (num1 * num2));
        JOptionPane.showMessageDialog(null, "Resto : " + (num1 % num2));


        }
        

}