
import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Por favor, insira seu nome: ");
        
        
        String nomeUsuario = scanner.nextLine();
        
        
        System.out.println("Bem-vindo, " + nomeUsuario + "!");
        
       
        scanner.close();
    }
}