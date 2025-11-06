
import controllers.MetodosBusqueda;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        ShowConsole showConsole = new  ShowConsole();
        System.out.println("Estudiante: Pedro Panjón\n");
        MetodosBusqueda mBusqueda = new MetodosBusqueda(showConsole);
        
    }
}