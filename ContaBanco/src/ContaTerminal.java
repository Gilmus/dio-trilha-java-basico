import java.util.Scanner;

public class ContaTerminal { 
    
    int Numero;   
    Double Saldo;    
    String Agencia, NomeCliente; 
       

    public static void main(String [] args){       

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Por favor, digite o número da Agência:"); 
            String Agencia = sc.nextLine();
            System.out.print("Digite o nome do cliente:");
            String NomeCliente = sc.nextLine(); 
            System.out.print("Digite o numero da Conta:"); 
            int Numero = sc.nextInt();            
            System.out.print("Digite o saldo:"); 
            double Saldo = sc.nextDouble();
            
            System.out.println("Olá,["+NomeCliente+"] obrigado por criar uma conta em nosso banco, sua agência é ["+Agencia+"], conta ["+Numero+"] e seu saldo [ R$ "+Saldo+"0] já está disponível para saque!");
        }
    

    }
}