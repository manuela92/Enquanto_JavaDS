import javax.swing.JOptionPane;

public class ex3 {
    //Peça ao usuário uma senha. Continue pedindo até ele digitar a senha correta: "1234".

    public static void main(String[] args) {
    String senha = "";

    while (!senha.equals("1234")){
        senha = JOptionPane.showInputDialog(null, "Digite a senha: ");
    }
    JOptionPane.showMessageDialog(null,"Senha correta!");

   }
}
 