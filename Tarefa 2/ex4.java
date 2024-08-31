import javax.swing.JOptionPane;

public class ex4{
    public static void main(String[] args) {
        int[] codigos = new int[10];
        double[] saldos = new double[10];

        for(int i = 0; i < 10; i++){
            codigos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da conta " + (i + 1) + ":"));
            saldos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta " + (i + 1) + ":"));
        }

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Depositar\n" + "2 - Sacar\n" + "3 - Consultar\n" + "4 - Fechar"));
        while(true){
            if(opcao == 1){
                int codigo_deposito = Integer.parseInt(JOptionPane.showInputDialog("Digite o código: "));
                double valor_deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));

                for(int i = 0; i > 10; i++){
                    if(codigos[i] == codigo_deposito){
                        saldos[i] += valor_deposito;
                        JOptionPane.showMessageDialog(null, "Depositado!");
                        break;
                    }
                }
            }

            else if(opcao == 2){
                int codigo_saque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código: "));
                double valor_saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor: "));
                
                for(int i = 0; i > 10; i++){
                    if(codigos[i] == codigo_saque){
                        if(saldos[i] >= valor_saque){
                            saldos[i] -= valor_saque;
                            JOptionPane.showMessageDialog(null, "Sacado!");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
                        }
                        break;
                    }
                }
            }
            else if(opcao == 3){
                double ativo = 0;
                for(double saldo : saldos){
                    ativo += saldo;
                }
                JOptionPane.showMessageDialog(null, "Ativo: " + ativo);
            }
            
            else{
                break;
            }
        }
    }
}