public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 20, 7.5);
        Aluno aluno2 = new Aluno("Maria", 19, 8.0);
        Aluno aluno3 = new Aluno("Pedro", 21, 6.5);

        Vetor vetor = new Vetor();
        vetor.adiciona(aluno1);
        vetor.adiciona(aluno2);
        vetor.adiciona(aluno3);

        System.out.println("Tamanho do vetor: " + vetor.tamanho());

        Aluno alunoEncontrado = vetor.get(1);
        System.out.println("Aluno encontrado: " + alunoEncontrado.getNome());

        vetor.remove(0);
        System.out.println("Tamanho do vetor após remoção: " + vetor.tamanho());

        System.out.println("Contém o aluno 2? " + vetor.contem(aluno2));
        System.out.println("Contém o aluno 1? " + vetor.contem(aluno1));
    }
}
