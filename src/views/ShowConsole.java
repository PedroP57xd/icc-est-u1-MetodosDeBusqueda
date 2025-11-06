package views;

public class ShowConsole {

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ", ");
        }
    }

    public void printResult(int resutl1, int value) {
        if (resutl1 == -1) {
            System.out.println("ERROR --> No se Encontro el valor");
        } else {
            System.out.println("El numero {" + value + "}, se encontro en la pocision [" + resutl1 + "]");
        }
    }
}
