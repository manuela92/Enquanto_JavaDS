import javax.swing.JOptionPane;

public class ex7 {
    //Peça 10 números e calcule a soma total usando while.

    public static void main(String[] args) {
        int i = 0;
        int soma = 0;

        while (i<10){
            String input = JOptionPane.showInputDialog("Digite um número: ");
            i = Integer.parseInt(input);

            soma+=i;
            i++;
        }

        JOptionPane.showMessageDialog(null, "Soma: "+soma);
    }
} 