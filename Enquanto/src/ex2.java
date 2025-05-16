import javax.swing.JOptionPane;

public class ex2 {
   //Peça números ao usuário até que ele digite 0. Some todos os números digitados

   public static void main(String[] args) {
    double numero;
    int soma = 0;

    do { 
    String input = JOptionPane.showInputDialog("Digite um numero (0 para sair): ");
    numero = Double.parseDouble(input);

        soma+=numero;
    } while (numero != 0);
    JOptionPane.showMessageDialog(null,"Soma total: " + soma);

   } 
}
 