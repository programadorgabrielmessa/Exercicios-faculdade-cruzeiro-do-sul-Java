import javax.swing.JOptionPane;

public class Par{
    public static void main(String[] args){
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero : "));
        if (num%2 == 0){
            JOptionPane.showMessageDialog(null,"O numero:" + num + "é par");
        }
    }
}