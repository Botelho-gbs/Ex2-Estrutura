public class Vetor {
    private Aluno[] alunos;
    private int tamanho;

    public Vetor() {
        alunos = new Aluno[10];
        tamanho = 0;
    }

    public void adiciona(Aluno aluno) {
        if (tamanho == alunos.length) {
            Aluno[] novaArray = new Aluno[alunos.length * 2];
            for (int i = 0; i < alunos.length; i++) {
                novaArray[i] = alunos[i];
            }
            alunos = novaArray;
        }
        alunos[tamanho++] = aluno;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < tamanho; i++) {
            if (alunos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    public Aluno get(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return alunos[indice];
        }
        return null;
    }

    public Aluno remove(int indice) {
        if (indice < 0 || indice >= tamanho) {
            return null;
        }
        Aluno alunoRemovido = alunos[indice];
        for (int i = indice; i < tamanho - 1; i++) {
            alunos[i] = alunos[i + 1];
        }
        tamanho--;
        return alunoRemovido;
    }
}