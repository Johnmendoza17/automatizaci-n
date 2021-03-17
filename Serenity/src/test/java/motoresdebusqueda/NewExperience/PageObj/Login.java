package motoresdebusqueda.NewExperience.PageObj;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class Login extends PageObject {

    @FindBy(linkText = "Sign in")
    WebElementFacade Registrarse;


    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElementFacade Email;


    @FindBy(xpath = "//*[@id=\"passwd\"]")
    WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    WebElementFacade Ingresar;




    public void Registrar() throws InterruptedException {
        Thread.sleep(2000);
        Registrarse.click();
        Thread.sleep(2000);
        Email.type("Jhonmendoza17@hotmail.com");
        Thread.sleep(2000);
        Password.type("Bogota14*");
        Thread.sleep(2000);
        Ingresar.click();
        Thread.sleep(3000);

    }
}