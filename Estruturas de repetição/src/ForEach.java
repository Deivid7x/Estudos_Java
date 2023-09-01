public class ForEach {
    public static void main(String[] args) {
        // criamos uma array da forma abaixo
        String alunos[] = {"Deivid","Harry","Yugi","Naruto"};

        // A sintaxe abaixo pode ser lida como: para cada aluno em alunos, faça algo.
        for (String aluno : alunos) {
            System.out.println("O aluno é: " + aluno);
        }
    }
}
