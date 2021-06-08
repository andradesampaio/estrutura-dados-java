package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String[] args) {
        Queue<String> filaDoJava = new LinkedList<String>();
        filaDoJava.add("Mauricio");
        String x2 = filaDoJava.poll();
    }
}
