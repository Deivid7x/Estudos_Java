public class Identação {
// No java a identação não altera do código, apenas serve para facilitar a visualização (e é recomendado)
    public static void main(String[] args) {
        int mediaFinal = 8;
        if (mediaFinal < 6) 
            System.out.println("REPROVADO");

        else if (mediaFinal == 6)
            System.out.println("QUASE");

        else  
            System.out.println("APROVADO");
        
    }
}