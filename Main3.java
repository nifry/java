import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a idade do usuário:");
        int idade = scanner.nextInt();
        
        System.out.println("Digite a porcentagem de frequência do usuário:");
        double frequencia = scanner.nextDouble();
        
        if (idade > 18 || frequencia >= 85) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado. Condições não atendidas.");
        }
        
        scanner.close();
    }
}