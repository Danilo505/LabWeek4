package Question1.gerenciadores;

import Question1.ConsoleColors;
import Question1.gerenciadores.Gerenciador;

import java.util.LinkedList;

public class GerenciadorLinkedList <T> implements Gerenciador {
    private LinkedList<T> linkedList = new LinkedList<>();
    private LinkedList<T> linkedListRepetido = new LinkedList<>();

    public void filter(){

        for (int i = 0; i < linkedList.size(); i++) {
            for (int j = 0; j < linkedList.size(); j++) {
                if (linkedList.get(i) == linkedList.get(j) && i != j){
                    linkedListRepetido.add(linkedList.get(j));
                    linkedList.remove(j);

                }
            }
        }
        print();

    }
    public void addAll(T[] values){
        for (int i = 0; i < values.length; i++) {
            linkedList.add(values[i]);
        }
    }
    private void print(){
        System.out.println(ConsoleColors.WHITE_BOLD+ "-------Usando o LinkedList-------");
        System.out.print(ConsoleColors.GREEN_BOLD + "Resultado: ");
        System.out.println(linkedList);
        System.out.print(ConsoleColors.YELLOW_BOLD + "Filtro: ");
        System.out.println(linkedListRepetido);
        System.out.println();
    }

}