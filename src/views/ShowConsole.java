package views;

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
}
