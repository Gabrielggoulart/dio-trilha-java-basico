package contabanco;

import java.util.Scanner;

public class Menu {

    ContaTerminal conta = new ContaTerminal();
    Scanner teclado = new Scanner(System.in);

    public void criaConta(){
        System.out.println("------- Criar Conta -------");
        System.out.println("Digite o nÚmero da conta: ");
        conta.setNumeroConta(teclado.nextInt());
        System.out.println("Digite o número da agencia: ");
        conta.setNumeroAgencia(teclado.next());
        teclado.nextLine();
        System.out.println("Digite o nome do cliente: ");
        conta.setNomeCliente(teclado.nextLine());
        System.out.println("Digite o saldo da conta: ");
        conta.setSaldo(teclado.nextFloat());
    }

    public void info(){

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getNumeroAgencia() + ", conta " + conta.getNumeroConta() + " e seu saldo " + 
        conta.getSaldo() + " já está disponível para saque");

    }
}
