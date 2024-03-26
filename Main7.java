public class Main7 {
    public static void main(String[] args) {
      
        int numero1 = 40;
        int numero2 = 20;
        
        int soma = numero1 + numero2;
        System.out.println("Soma: " + soma);
        
        int multiplicacao = numero1 * numero2;
        System.out.println("Multiplicação: " + multiplicacao);
        
        if (numero2 != 0) {
            double divisao = (double) numero1 / numero2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
        int subtracao = numero1 - numero2;
        System.out.println("Subtração: " + subtracao);
    }
}