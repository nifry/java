import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o consumo médio diário (VMD):");
        double vmd = scanner.nextDouble();
        
        System.out.println("Digite o lead time em dias:");
        int leadTime = scanner.nextInt();
        
        System.out.println("Digite o desvio padrão do lead time:");
        int desvioPadrao = scanner.nextInt();
        
        System.out.println("Digite o fator de segurança:");
        double fatorSeguranca = scanner.nextDouble();
        
        
        double estoqueMinimo = (vmd * leadTime) + (desvioPadrao * fatorSeguranca);
        
       
        double estoqueMaximo = estoqueMinimo + (vmd * leadTime);
        
        System.out.println("Estoque Mínimo: " + estoqueMinimo);
        System.out.println("Estoque Máximo: " + estoqueMaximo);
        
        scanner.close();
    }
}