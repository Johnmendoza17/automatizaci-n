package motoresdebusqueda.NewExperience.Step;


import motoresdebusqueda.NewExperience.PageObj.IngresoCliente;
import motoresdebusqueda.NewExperience.PageObj.Page;
import net.thucydides.core.annotations.Step;

public class Cliente {

    String actor;

    IngresoCliente paginaPrincipal;
    Page pagina;

    @Step("#actor ingresa a la pagina principal de New Experience")
    public void ingresarNewExperience() throws InterruptedException {
        Thread.sleep(5000);
        paginaPrincipal.open();
    }

    @Step("#actor realiza el ingreso a Gemini")
    public void ingresarBusqueda() throws InterruptedException {
        paginaPrincipal.Buscar();

    }

}
