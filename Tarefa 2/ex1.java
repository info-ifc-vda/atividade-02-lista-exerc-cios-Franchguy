import javax.swing.JOptionPane;

public class ex1{

    public static void main(String[] args) {
        int linhas = 0;

        while (true) {
            String valorStr = JOptionPane.showInputDialog(null, "Digite um valor: ");
            double valor = Double.parseDouble(valorStr);

            if (valor <= 0) {
                break;
            }

            if (linhas % 20 == 0) {
                imprimir_cabecalho();
            }

            double cubo = Math.pow(valor, 3);
            double raiz_quadrada = Math.sqrt(valor);

            System.out.printf("%-10.2f %-15.2f %-15.2f%n", valor, cubo, raiz_quadrada);

            linhas++;
        }
    }

    private static void imprimir_cabecalho() {
        System.out.println("\n---------------------------------------------");
        System.out.printf("%-10s %-15s %-15s%n", "Valor", "Cubo", "Raiz Quadrada");
        System.out.println("---------------------------------------------");
    }
}
