public class MinhaClasse {
    // toda classe precisa de um metodo main, que é o código abaixo
    public static void main(String[] args) {
        // System.out.print("testando");

        // declarando uma variavel

        // tipo NomeBemDefinido = Atribuição (opcional em alguns casos) ps: As strings precisam ter aspas duplas no JAVA
        
        String primeiroNome = "Deivid";
        String restoDoNome = "Dos Santos Bento";

        String nomeCompleto = nomeCompleto(primeiroNome, restoDoNome);

        System.out.print(nomeCompleto);

        // Alguns tipos usados no JAVA são: bit, short, int, long (o mais utilizado é o int)
        // para valores decimais temos: float, double (o mais utilizado é o double)
        // Além dos tipos acima temos o tipo String que serve para armazenamento de texto

        // Por fim, se queremos criar uma variavel que não mudará seu valor durante o código (ou seja, uma constante) devemos usar a palavra final antes de declarar o tipo da variavel, e devemos deixar o nome da variavel em caixa alta,ex: 

        final String MEU_NOME = "\nDeivid"; // Esse "\n" serve para quebra de linha na string

        System.out.print(MEU_NOME);

    }

    
    //Além do método main, a classe pode ter mais métodos, declarado assim:
    public static String nomeCompleto (String primeiroNome, String restoDoNome){
        return "Seu nome é: " + primeiroNome + " " + restoDoNome; 
    }
}

