import javax.swing.JOptionPane;

public class ex1 {
    
    //Peça um número e faça a contagem regressiva até 0

    public static void main(String[] args) {
    
        String input = JOptionPane.showInputDialog("Digite um numero para iniciar a contagem: ");
        int numero = Integer.parseInt(input);

        while (numero >= 0){
            JOptionPane.showMessageDialog(null, numero);
            numero--;
        }
    }
}
 