package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
    WebDriver driver;

    @Given("^that the user acess the Fleury page$")
    public void that_the_user_acess_the_Fleury_page(){
//    	Configura o navegador onde o teste será executado
		System.setProperty("chromedriver", "C:\\SeleniumWebdrivers");
		driver = new ChromeDriver();
//		Maximiza o navegador
		driver.manage().window().maximize();
//		Abre a pagina da Fleury
		driver.get("https://www.fleury.com.br/");
    }

    @When("^the user click on the Unity$")
    public void the_user_click_on_the_Unity(){
//    	Clica em unidades
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Convênios'])[1]/following::div[6]"))
				.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		Aceita a solicitação que aparece no rodapé
		driver.findElement(By.partialLinkText("CONTINUAR")).click();
    }

    @When("^the user clicks to select an item in the Filter by ease$")
    public void the_user_clicks_to_select_an_item_in_the_Filter_by_ease(){
//    	Seleciona um item no Filtro por facilidade
		driver.findElement(By.id("checkoox-select-facilities")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".checkbox-fieldcomponentstyle__CheckboxFieldStyled-sc-1mdajsk-0:nth-child(3) > .fa-check-square > path")).click();
    }

    @When("^the user selects the first option in the units$")
    public void the_user_selects_the_first_option_in_the_units(){
//    	Clica em ver detalhes da primeira unidade que aparece
		driver.findElement(By.id("button-see-on-map-2-vila-mariana")).click();
    }
    
    @Then("^the title shoud be the same as that selected$")
    public void the_title_shoud_be_the_same_as_that_selected(){
    	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    	String title = driver.getTitle();
    	System.out.println("Titulo: "+ title);

//    	Compara o titulo da nova pagina
    	Assert.assertEquals("Unidade Vila Mariana › Laboratórios | Fleury Medicina e Saúde", title);
    }
    

    @Then("^the page shoud be closed$")
	public void the_page_shoud_be_closet() throws Throwable {
//    	Fecha o navegador
		driver.close();
	}
}
