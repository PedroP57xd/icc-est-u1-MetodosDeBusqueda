package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private int[] array;

    

    public MetodosBusqueda() {
    }

    public MetodosBusqueda(ShowConsole showConsole) {
        this.array = new int[] { 10, 11, -2, 5, 6, 8, 15, 22 };
        this.showConsole = showConsole;
        showConsole.printArray(this.array);

        int result1 = busquedaLineal(5);
        showConsole.printResult(result1, 5);
        int result2 = busquedaLinealWhile(-2);
        showConsole.printResult(result2, -2);
        int result3 = busquedaLinealWhile(20);
        showConsole.printResult(result3, 20);
        Integer result4 = busquedaLinealobj(10);
        showConsole.printResult(result4, 10);

    }

    public int busquedaLineal(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int busquedaLinealWhile(int value) {
        int i = 0;
        while (i < array.length) {
            if (array[i] == value) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Integer busquedaLinealobj(int value) {
        int i = 0;
        while (i < array.length) {
            if (array[i] == value) {
                return i;
            }
            i++;
        }
        return -1;

    }
    public Persona searchPersonaByName(Persona[] personas, String nombre){
        for (Persona persona : personas) {
            if (persona.getName().equals(nombre)) {
                return persona ;
            }

        }
        
        return null;
    }
    public Persona findPersonByAgeAndImpar(Persona[] personas, int age){
        for (Persona persona : personas) {
            if (persona.getAge()>age && persona.getAge()%2!=0) {
                return persona;
            }
        }
        return null;
    }
    public Persona findPersonByValueName(Persona[] personas, int value){
            for (Persona persona : personas) {
                int cont=0;
                for (char letra : persona.getName().toCharArray()) {
                    cont+=(int)letra;
                }
                if (cont==value) {
                    return persona;
                }
            }


        return null;
    }
}
