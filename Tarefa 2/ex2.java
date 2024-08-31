import javax.swing.JOptionPane;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        int vetor1[]  = new int[10];
        int vetor2[] = new int[10];

        for(int i = 0; i < 10; i++){
            String numero_vetor1Str = JOptionPane.showInputDialog(null, "Digite um número para acrescentar no vetor 1: ");
            int numero_vetor1 = Integer.parseInt(numero_vetor1Str);
            vetor1[i] = numero_vetor1;

            String numero_vetor2Str = JOptionPane.showInputDialog(null, "Digite um número para acrescentar no vetor 2: ");
            int numero_vetor2 = Integer.parseInt(numero_vetor2Str);
            vetor2[i] = numero_vetor2;
        }
        for(int x = 0; x < 10; x++){
            if(vetor1[x] != vetor2[x]){
                System.out.println("O número: " + vetor1[x] + ", do vetor 1, é diferente do número: " + vetor2[x] + ", do vetor 2.");
            }
        }

    }
}
