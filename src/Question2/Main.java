package Question2;

import Question2.Classes.GenericMatrix;

public class Main {
    public static void main(String[] args) {
        //Matriz de inteiros
        GenericMatrix<Integer> genericMatrix = new GenericMatrix<>(3);

        //Adicionando os valores inteiros
        Integer[] values = {5,6,9,3,4,5,2,4,7};
        genericMatrix.setValues(values);

        //Print
        genericMatrix.print();
        genericMatrix.diagonalPrincipal();
        genericMatrix.transposta();

        //Matriz de inteiros
        GenericMatrix<Character> genericMatrixC = new GenericMatrix<>(3);

        //Adicionando os valores inteiros
        Character[] valuesC = {'u','r','o','p','t','y','i','a','f'};
        genericMatrixC.setValues(valuesC);

        //Print
        genericMatrixC.print();
        genericMatrixC.diagonalPrincipal();
        genericMatrixC.transposta();
    }
}
