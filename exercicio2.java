import java.util.Scanner;

public class exercicio2{
public static void  main (String[] args){
Scanner teclado = new Scanner (System.in);    


 int numero = 20;
 while (numero != 10) {
    
// Enquanto a variavel for 10 o trecho  de código será repetido     
  System.out.println("Digite um número:");
  numero = teclado.nextInt();
  
  
  if (numero == 10) {
  System.out.println("Voce acertrou!" );
  } else  {
      System.out.println("Voce errou!" );
  }
  
  
  
}
}    
}
