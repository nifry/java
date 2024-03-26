public class main9 {
    public static void main(String[] args) {
       
        double media1 = calcularMedia(8, 9, 7);
        System.out.println("Média dos números 8, 9 e 7: " + media1);

        
        double media2 = calcularMedia(4, 5, 6);
        System.out.println("Média dos números 4, 5 e 6: " + media2);

        
        double somaDasMedias = media1 + media2;
        System.out.println("Soma das médias: " + somaDasMedias);

       
        double mediaDasMedias = (media1 + media2) / 2;
        System.out.println("Média das médias: " + mediaDasMedias);
    }

   
    public static double calcularMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}