import javax.swing.JOptionPane;
public class outroexmeplowhile{
    public static void main(String[] args) {
        int num,soma = 0;
    do {
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero : "));
        if (num%2!=0){
            soma =soma + num;
        }

    }while(num!=0);

    JOptionPane.showMessageDialog(null, "A soma dos numeros impares" + soma);
        
    }
    

}