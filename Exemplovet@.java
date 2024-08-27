/**
 * @(#)Exemplovet1.java
 *
 *
 * @author 
 * @version 1.00 2024/8/25
 */
impor javax.swing.JOptionPane;

public class Exemplovet@ {

    public Exemplovet@(){
    	float [] salario = new float[5];
    	for(int i=0; i<5; i++){
    		salario[i] = float.parseInt(JoptionPane.showInputDialog("Entre com o salário"));
    	}
    	for (int i=0; i<5;i++){
    		salario[i] = float.parseFloat(JoptionPane.showinputDialog(null,"Funcionario" + (i+1)+ "Salário" + salario[i]));
    	}
    }  
}