package motoresdebusqueda.NewExperience.PageObj;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com/index.php")
public class IngresoCliente extends PageObject {

    @FindBy(xpath = "//input[@id=\"search_query_top\"]")
    WebElementFacade search;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    WebElementFacade buttonSearch;

    public IngresoCliente(WebDriver driver) {
        super(driver);
    }

    public void Buscar() throws InterruptedException {
        search.type("dress");
        buttonSearch.click();
        Thread.sleep(3000);

    }
}