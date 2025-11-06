package controllers;

import views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private int[] array;
    
    

    public MetodosBusqueda() {
    }



    public MetodosBusqueda(ShowConsole showConsole, int[] array) {
        this.array = new int[]{10,11,-2,5,6,8,15,22};
        this.showConsole = showConsole;
        showConsole.printArray(this.array);

        int result1= busquedaLineal(this.array,5);
        showConsole.printResult(result1,5);
    }



    public int busquedaLineal(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==value) {
                return i;
            }
        }
        return -1;
    }
    public int busquedaLinealWhile(int[] array, int value){
        int i=-1;
        while (value!=array[i]) {
            if (array[i]==value) {
                return i;
            }
            i++;
        }
        return -1;
    }

}
