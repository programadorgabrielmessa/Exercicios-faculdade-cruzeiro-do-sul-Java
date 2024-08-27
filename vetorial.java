import javax.swing.JOptionPane;

public class vetorial {

   public vetorial(){
       float[] salario = new float[5];
       for(int i = 0; i < 5; i++){
           salario[i] = Float.parseFloat(JOptionPane.showInputDialog("Entre com o salário"));
       }
       for (int i = 0; i < 5; i++){
           JOptionPane.showMessageDialog(null, "Funcionário " + (i + 1) + ": Salário " + salario[i]);
       }
   }

   public static void main(String[] args) {
       new vetorial();
   }
}
