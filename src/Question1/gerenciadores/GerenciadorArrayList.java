package Question1.gerenciadores;

import Question1.ConsoleColors;
import Question1.gerenciadores.Gerenciador;

import java.util.ArrayList;

public class GerenciadorArrayList<T> implements Gerenciador {
    private ArrayList<T> arrayList = new ArrayList<>();
    private ArrayList<T> arrayListRepetidos = new ArrayList<>();

    public void filter(){
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i) == arrayList.get(j) && i != j){
                    arrayListRepetidos.add(arrayList.get(j));
                    arrayList.remove(j);
                }
            }
        }
        print();
    }
    public void addAll(T[] values){
        for (int i = 0; i < values.length; i++) {
            arrayList.add(values[i]);
        }
    }
    private void print(){
        System.out.println(ConsoleColors.CYAN_BOLD + "-------Usando o ArraList-------");
        System.out.print(ConsoleColors.GREEN_BOLD + "\nResultado: ");
        System.out.println(arrayList);
        System.out.print(ConsoleColors.YELLOW_BOLD + "Filtro: ");
        System.out.println(arrayListRepetidos);
        System.out.println();

    }
}