import java.util.Scanner;

public class exercicio1 {
public static void  main (String[] args){
Scanner teclado = new Scanner (System.in);    
    
int numnotas = 4;    
double somanotas = 0;    
    
    for(int i = 1; i <= numnotas; i++){
        
System.out.println("Digite a nota" +i);        
        
double nota = teclado.nextDouble();
somanotas += nota;

     
     
     
}

double media = somanotas / numnotas;
System.out.println ("A média do aluno é:" +media);


}    
}
