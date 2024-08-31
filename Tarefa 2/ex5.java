import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args) {
        int [][] matriz = new int[7][7];
        int [] maiores_das_linhas = new int[7];
        int [] menores_das_colunas = new int[7];

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " + i + " e " + j));
            }
        }

        for(int i = 0; i < 7; i++){
            maiores_das_linhas[i] = matriz[i][0];
            menores_das_colunas[i] = matriz[0][i];
            for(int j = 0; j < 7; j++){
                if(matriz[i][j] > maiores_das_linhas[i]){
                    maiores_das_linhas[i] = matriz[i][j];
                }
                if(matriz[j][i] < menores_das_colunas[i]){
                    menores_das_colunas[i] = matriz[j][i];
                }
            }
        }

        StringBuilder matrizStr = new StringBuilder("Matriz: \n");
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                matrizStr.append(matriz[i][j]).append("\t");
        }
        matrizStr.append("\n");
        }

        StringBuilder maioresStr = new StringBuilder("Maiores elementos de cada linha:\n");
        for (int i = 0; i < 7; i++) {
            maioresStr.append(maiores_das_linhas[i]).append("\t");
        }

        StringBuilder menoresStr = new StringBuilder("\nMenores elementos de cada coluna:\n");
        for (int i = 0; i < 7; i++) {
            menoresStr.append(menores_das_colunas[i]).append("\t");
        }

        JOptionPane.showMessageDialog(null, matrizStr.toString() + "\n" + maioresStr.toString() + "\n" + menoresStr.toString());
    }
}
