import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args)  {
        //TO DO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        //Exibir as mensagens para o nosso usuario
        //Obter pela classe scanner os valores digitados no terminal

        

        System.out.println("Por favor, Digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Por favor, Digite o numero da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, Digite o numero da Agencia:");
        String agencia = scanner.next();

        System.out.println("Por favor, Digite o valor desejado:");
        Double saldo = scanner.nextDouble();


        //Exibir a mensagem conta criada

        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência é " + agencia + " , conta: " + numero + '.');
        System.out.println("Seu saldo: " + saldo + "  já está disponivel para saque." );
        




        



    }
}
