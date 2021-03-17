package motoresdebusqueda.NewExperience.PageObj;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class Page extends PageObject {
    @FindBy(css = "a[href='/dashboard']")
    WebElementFacade dashboard;


    @FindBy(className = "name")
    public WebElementFacade name;
    //By name = By.className("name");

    @FindBy(className = "email")
    WebElementFacade email;
    //By email = By.className("email");

    @FindBy(css = "div.left-zone > .table-header > a")
    WebElementFacade following;
    //By following = By.cssSelector("div.left-zone > .table-header > a");

    @FindBy(id = "projects-filter-link")
    WebElementFacade projects;
    //By projects = By.id("projects-filter-link");


    public void Dashboard() throws InterruptedException {
        dashboard.click();
        Thread.sleep(2000);
        System.out.println("Este es el nombre: " + name.getText());
        Assert.assertEquals("Jason Andres Fierro Hernandez", name.getText());
        Thread.sleep(2000);
        System.out.println("Este es el correo: " + email.getText());
        Assert.assertEquals("Jason.fierro@evertecinc.com", email.getText());
        Thread.sleep(2000);
        System.out.println("Este es el Following: " + following.getText());
        Assert.assertEquals("Following", following.getText());
        Thread.sleep(2000);
        System.out.println("Este es el Projects: " + projects.getText());
        Assert.assertEquals("Projects", projects.getText());
        Thread.sleep(2000);
    }
}