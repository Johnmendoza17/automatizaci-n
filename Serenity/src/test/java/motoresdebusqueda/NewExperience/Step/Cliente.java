package motoresdebusqueda.NewExperience.Step;


import motoresdebusqueda.NewExperience.PageObj.IngresoCliente;
import motoresdebusqueda.NewExperience.PageObj.Login;
import net.thucydides.core.annotations.Step;

public class Cliente {

    String actor;

    IngresoCliente paginaPrincipal;
    Login login;

    @Step("#actor ingresa a la pagina principal de New Experience")
    public void ingresarNewExperience() throws InterruptedException {
        Thread.sleep(5000);
        paginaPrincipal.open();
    }

    @Step("#actor ingresa la palabra a buscar")
    public void ingresarBusqueda() throws InterruptedException {
        paginaPrincipal.Buscar();

    }
    @Step("#actor ingresa a la pestaña Registrarse y se logea")
    public void Regis() throws InterruptedException {
        login.Registrar();
    }

}
