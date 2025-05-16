
import javax.swing.JOptionPane;

public class ex6 {
    //Peça uma idade entre 0 e 120. Repita enquanto a entrada for inválida

    public static void main(String[] args) {
        
        int idade;

        do { 
            String input = JOptionPane.showInputDialog("Digite a idade: ");
            idade = Integer.parseInt(input);

        } while (idade <=0 || idade >= 120);
        JOptionPane.showMessageDialog(null, "Idade inválida!");
    }
}
 