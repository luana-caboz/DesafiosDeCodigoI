import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        boolean continuar = true;

        while (continuar) { 
            System.out.println("\n\n ***BEM VINDO AO CABOZBANK***\n\n" 
            +"Escolha uma das opcoes:  \n\n"
            +"1 - Depositar\n"
            +"2 - Sacar\n"
            +"3 - Consultar Saldo\n"
            +"0 - Encerrar\n");

            int opcao = scanner.nextInt(); 

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: "+saldo);
                    break;
                    
                case 2:
                    System.out.println("Informe o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    if(saldo >= saque){
                        saldo = saldo - saque;
                        System.out.println("Saldo atual: "+saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: "+saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente."); 
                    break;
            }
        }
    }
}