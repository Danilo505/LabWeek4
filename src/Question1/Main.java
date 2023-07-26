package Question1;

import Question1.gerenciadores.GerenciadorArrayList;
import Question1.gerenciadores.GerenciadorLinkedList;

public class Main {
    public static void main(String[] args) {
        //Definindo os valores
        Integer[] values = {1,2,3,3,4,4,5};
        Character[] valuesChar = {'a','b','b','f','c','v','x','c'};

        //Trabalhando com os ArrayList
        GerenciadorArrayList<Integer> gerenciadorAL = new GerenciadorArrayList<>();
        GerenciadorArrayList<Character> gerenciadorALC = new GerenciadorArrayList<>();

        //Adicionando os valores
        gerenciadorAL.addAll(values);
        gerenciadorALC.addAll(valuesChar);

        //Filtrando os dados
        gerenciadorAL.filter();
        gerenciadorALC.filter();

        //Definindo os LinkedList
        GerenciadorLinkedList<Integer> gerenciadorLL = new GerenciadorLinkedList<>();
        GerenciadorLinkedList<Character> gerenciadorLLC = new GerenciadorLinkedList<>();

        //Adicionando os valores
        gerenciadorLL.addAll(values);
        gerenciadorLLC.addAll(valuesChar);

        //Filtrando os dados
        gerenciadorLL.filter();
        gerenciadorLLC.filter();
    }
}
