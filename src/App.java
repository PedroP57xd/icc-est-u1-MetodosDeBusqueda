
import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        ShowConsole showConsole = new ShowConsole();
        System.out.println("Estudiante: Pedro Panjón\n");
        MetodosBusqueda mBusqueda = new MetodosBusqueda();

        Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
        };
        String name = "Juan";
        int age =25;
        int acii=498;
        boolean valorNombre=true;
        Persona resultadoPer = mBusqueda.searchPersonaByName(personas, name);
        Persona resultadoPerAge=mBusqueda.findPersonByAgeAndImpar(personas, age);
        Persona resultadoPerACII= mBusqueda.findPersonByValueName(personas, acii);
        showConsole.showPersonResult(resultadoPer, name);
        showConsole.showPersonResult(resultadoPerAge, age);
        showConsole.showPersonResult(resultadoPerACII,acii,valorNombre);
    }
}