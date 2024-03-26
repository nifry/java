import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma opção de atendimento:");
        System.out.println("1 - Consultar saldo da conta");
        System.out.println("2 - Verificar titular da conta");
        System.out.println("3 - Ser encaminhado para um atendente");
        System.out.print("Digite o número da opção desejada: ");
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("O saldo da conta é R$ 10.000");
                break;
            case 2:
                System.out.println("O usuário cadastrado na conta é Lucas Almeida de Souza");
                break;
            case 3:
                System.out.println("Você será encaminhado para um atendente");
                break;
            default:
                System.out.println("Opção inválida");
        }
        
        scanner.close();
    }
}