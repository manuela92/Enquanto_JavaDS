import javax.swing.JOptionPane;

public class ex5 {
    //O programa tem um número secreto. O usuário deve tentar adivinhar até acertar.

    public static void main(String[] args) {
        String secreto = "" ;

        while (!secreto.equals("7")){
        secreto = JOptionPane.showInputDialog(null, "Descubra o número secreto: ");
    }
    JOptionPane.showMessageDialog(null,"Você acertou!");

   }

}

 