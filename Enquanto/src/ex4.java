
import javax.swing.JOptionPane;

public class ex4 {
    //Conte e exiba todos os números pares entre 1 e 100.

    public static void main(String[] args) {
        int i = 1;

        while (i <= 100){
            if(i%2==0){
                JOptionPane.showMessageDialog(null, i);
            }
            i++;
        }

    }
    
} 
