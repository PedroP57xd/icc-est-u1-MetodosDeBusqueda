package views;

import models.Persona;

public class ShowConsole {

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public void printResult(int resutl1, int value) {
        if (resutl1 == -1) {
            System.out.println("\n ERROR --> No se Encontro el valor [ " + value + "]");
        } else {
            System.out.println("\n El numero {" + value + "}, se encontro en la pocision [" + resutl1 + "]");
        }
    }

    public void showPersonResult(Persona resPer, String name) {
        if (resPer!=null) {
            System.out.println("     Los datos de " + name + " son: " + resPer+"\n");
        } else {
            System.out.println("     No se encontraron datos de " + name+"\n");
        }

    }
    public void showPersonResult(Persona resPer, int age){
        if (resPer!=null) {
            System.out.println("     Persona mayor a " + age +" de edad y que sea impar: " + resPer+"\n");
        }else{
            System.out.println("     No se encontro ninguna persona mayor a " +age+"y con edad impar\n");
        }
    }
    public void showPersonResult(Persona resPer,int acii, boolean valorNombre){
        if (valorNombre) {
            System.out.println("     La persona que la suma de el valor Acii de su nombre es igua al 498 es: " + resPer);
        }else {
            System.out.println("     No hay nombres que la suma Ascii de sus letras de 498");
        }
    }
}
