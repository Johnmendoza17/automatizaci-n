package motoresdebusqueda.NewExperience;


import motoresdebusqueda.NewExperience.Step.Cliente;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewExperience {

    @Steps
    Cliente Cliente;

    @Managed
    WebDriver driver;

    @Test
    public void case1() throws InterruptedException {
        Cliente.ingresarNewExperience();
        Cliente.ingresarBusqueda();
    }

    @Test
    public void case31() throws InterruptedException {
        Cliente.ingresarNewExperience();
        Cliente.Regis();

    }

    @After
    public void cerrarBrowser(){
        driver.quit();
    }

}
