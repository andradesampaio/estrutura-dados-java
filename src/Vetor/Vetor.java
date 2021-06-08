package Vetor;

import domain.Aluno;

import java.util.Arrays;

public class Vetor {

    private Aluno[] alunos = new Aluno[100];
    private int totalAluno = 0;

    public void adiciona(Aluno aluno) {
        this.garanteEspaco();
        alunos[totalAluno] = aluno;
        totalAluno++;
    }
    public boolean posicaoValida(int posicao){
        return posicao > 0 && posicao <= totalAluno;
    }

    public void adiciona(int posicao, Aluno aluno){
        this.garanteEspaco();
        if(!posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição invalida");
        }

        for (int i = totalAluno; i >= posicao ; i-=1) {
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalAluno++;
    }

    public boolean posicaoOcupada(int posicao){
        return posicao > 0 && posicao < totalAluno;
    }

    public Aluno pega(int posicao){

            if(!posicaoOcupada(posicao)) {
                throw new IllegalArgumentException("Posição invalida");
            }
        return new Aluno(alunos[posicao].getNome(), alunos[posicao].getIdade());
    }

    public void remove(int posicao){
        for (int i = posicao; i < this.totalAluno; i++) {
              alunos[i] = alunos[i+1];
        }
        totalAluno--;
    }

    public boolean contem(Aluno aluno){
        for (int i = 0; i < totalAluno; i++) {
       // for (int i = 0; i < alunos.length; i++) {
            if(aluno == alunos[i] ){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return totalAluno;
    }

    public void garanteEspaco(){
        if(this.totalAluno == alunos.length){
            Aluno[] novoArray = new Aluno[alunos.length * 2];
            for (int i = 0; i < alunos.length; i++) {
                novoArray[i] = alunos[i];
            }
            this.alunos = novoArray;
        }

    }

    @Override
    public String toString() {
        return "Alunos = " + Arrays.toString(alunos);
    }
}
