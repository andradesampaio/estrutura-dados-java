package Vetor;

import domain.Aluno;

import java.util.ArrayList;

public class VetorTeste {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno("Kayo", 18);
        Aluno aluno02 = new Aluno("Joao", 12);
        Aluno aluno03 = new Aluno("Mario", 40);

        Vetor lista = new Vetor();
        lista.adiciona(aluno01);
        lista.adiciona(aluno02);

        System.out.println(lista.pega(1));
        System.out.println(lista.contem(aluno02));
        System.out.println(lista.contem(aluno03));
        System.out.println(lista.tamanho());
        lista.adiciona(01, aluno03);

        System.out.println(lista.toString());
        lista.remove(1);
        System.out.println(lista.toString());

        new ArrayList();
    }
}
