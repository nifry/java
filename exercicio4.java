import java.util.Scanner;

public class exercicio4 {
    
public static void main (String[]args) {

Scanner scanner = new Scanner(System.in);

int numnotas = 3;
double totalnotas = 0;
int contador = 0;

while (contador < numnotas) {
    contador++;
    System.out.println("Digite a nota:" +contador+ ".");
    double nota = scanner.nextDouble();
    totalnotas += nota;
}

double media = totalnotas/ numnotas;

System.out.println("A média das notas é :" +media);

scanner.close();
}
}
