package motoresdebusqueda.NewExperience;


import motoresdebusqueda.NewExperience.Step.Cliente;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewExperience {

    @Steps
    Cliente John;

    @Managed
    WebDriver driver;

    @Test
    public void case1() throws InterruptedException {
        John.ingresarNewExperience();
        John.ingresarBusqueda();

    }

    //Si se desea realizar otra prueba se genera otro @Test por cada caso de prueba, el cierra el anterior @Test y abre uno nuevo
    @Ignore
    public void S2_ingresoDashBoard() throws InterruptedException{

    }

    @After
    public void cerrarBrowser(){
        driver.quit();
    }

}
