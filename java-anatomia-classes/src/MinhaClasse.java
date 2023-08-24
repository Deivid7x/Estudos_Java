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
    }

    
    //Além do método main, a classe pode ter mais métodos, declarado assim:
    public static String nomeCompleto (String primeiroNome, String restoDoNome){
        return "Seu nome é: " + primeiroNome + " " + restoDoNome; 
    }
}

