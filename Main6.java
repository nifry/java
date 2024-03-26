public class Main6 {
    public static void main(String[] args) {
        String conteudo =  "Banana, Cajá, Goiaba, uva, morango, pêra, maçã, damasco, melão, laranja";
        
       
        String[] produtos = conteudo.split(", ");
        
        System.out.println("Conteúdo 1: " + produtos[0]);
        System.out.println("Conteúdo 3: " + produtos[2]);
        System.out.println("Conteúdo 7: " + produtos[6]);
    }
}