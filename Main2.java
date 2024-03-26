import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1, nota2, nota3, nota4;
        
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextDouble();
        
        System.out.println("Digite a quarta nota:");
        nota4 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if(media >= 7){
            System.out.println("Aprovado sem recuperação!");
        }
        
        else if( media < 7 && media >= 4){
            
            System.out.println("Reprovado com direito a recuperaçao");
        }
        
        else {
            
            System.out.println("Reprovado sem direito a recuperação");
            
        }
        
        System.out.println("A média das notas é: " + media);
        
        scanner.close();
    }
}