
import javax.swing.JOptionPane;

public class Vetorial3{
    public static void main(String[] args) {
        float [] salario = new float [5];

        salario[4] = 15.52f;
        salario[3] = 1100.15f;
        salario[2] = 2200.25f;
        salario[1] = 2754.6f;
        salario[0] = 3300.7f;

        for (int i=0; i<5;i++){
            JOptionPane.showMessageDialog(null, " Funcionario: " +(i+1)+ " Salario: " + salario[i]);
        }
    }

}