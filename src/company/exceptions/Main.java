package company.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        try {
            // float resultado = dividirPorCero(1);
            // int number = obtenerElemento9(array);
            FileInputStream in = new FileInputStream("/asd/archivo.txt");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static float dividirPorCero(int numero) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = numero / 0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("No es posible dividir por cero :/");
        }
        return resultado;
    }

    public static int obtenerElemento9(int[] array) throws ArrayIndexOutOfBoundsException {
        int resultado = 0;
        try {
            resultado = array[8];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Se sobré pasó el tamaño del array :/");
        }
        return resultado;
    }
}

