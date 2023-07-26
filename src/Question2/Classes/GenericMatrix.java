package Question2.Classes;

import Question1.ConsoleColors;

public class GenericMatrix <T> {

    private T[][] matrix;
    private int rowsAndcolumns;

    public GenericMatrix(int rowsAndcolumns) {
        this.rowsAndcolumns = rowsAndcolumns;
        matrix = (T[][]) new Object[rowsAndcolumns][rowsAndcolumns];
    }

    public void setValues (T[] value){
        if(value.length > (rowsAndcolumns*rowsAndcolumns)){
            System.out.println(ConsoleColors.RED_BOLD + "Infelismente a matrix definida não suporta todos esses valores");
        }else {
            int index = 0;
            for (int i = 0; i < rowsAndcolumns; i++) {
                for (int j = 0; j < rowsAndcolumns; j++) {
                    matrix[i][j] = value[index];
                    index++;
                }
            }
        }

    }
    public void print(){
        System.out.println(ConsoleColors.CYAN_BOLD + "Matriz original: ");
        for (int i = 0; i < rowsAndcolumns; i++) {
            for (int j = 0; j < rowsAndcolumns; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void diagonalPrincipal(){
        System.out.print(ConsoleColors.GREEN_BOLD + "Diagonal Principal: ");
        for (int i = 0; i < rowsAndcolumns; i++) {
            for (int j = 0; j < rowsAndcolumns; j++) {
                if (i == j){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
        System.out.println();
    }

    public void transposta(){
        System.out.println();
        System.out.println(ConsoleColors.YELLOW_BOLD + "Matriz Transposta: ");
        for (int i = 0; i < rowsAndcolumns; i++) {
            for (int j = 0; j < rowsAndcolumns; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}