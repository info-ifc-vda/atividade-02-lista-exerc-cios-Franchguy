import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];
        int[] vetor3 = new int[10];
        int[] vetor4 = new int[10];
        
        for(int i = 0; i < vetor1.length; i++){
            String numeros1 = JOptionPane.showInputDialog(null, "Digite um número para o vetor1 na posição " + i + ":");
            vetor1[i] = Integer.parseInt(numeros1);
        }

        for(int i = 0; i < vetor2.length; i++){
            String numeros2 = JOptionPane.showInputDialog(null, "Digite um número para o vetor2 na posição " + i + ":");
            vetor2[i] = Integer.parseInt(numeros2);
        }

        int somaVetor2 = 0;
        for(int num : vetor2) {
            somaVetor2 += num;
        }

        for(int i = 0; i < vetor1.length; i++){
            if(vetor1[i] % 2 == 0){
                vetor3[i] = vetor1[i] + somaVetor2;
            } else {
                vetor3[i] = vetor1[i];
            }
        }

        for(int i = 0; i < vetor1.length; i++){
            if(vetor1[i] % 2 != 0){
                int contadorDivisores = 0;
                for(int num : vetor2){
                    if(num != 0 && vetor1[i] % num == 0){
                        contadorDivisores++;
                    }
                }
                vetor4[i] = contadorDivisores;
            } else {
                vetor4[i] = 0;
            }
        }
        StringBuilder resultado1 = new StringBuilder("Primeiro vetor resultante:\n");
        for(int i = 0; i < vetor3.length; i++){
            resultado1.append("Posição ").append(i).append(": ").append(vetor3[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado1.toString());

        StringBuilder resultado2 = new StringBuilder("Segundo vetor resultante:\n");
        for(int i = 0; i < vetor4.length; i++){
            resultado2.append("Posição ").append(i).append(": ").append(vetor4[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultado2.toString());
    }
}
