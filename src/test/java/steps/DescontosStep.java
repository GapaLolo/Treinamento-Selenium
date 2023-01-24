package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da qazando")
    public void acessar_site_qazando(){

        homePage.acessarAplicacao();
        //homePage.assertEqualsExibindo("Não acessou a aplicacao",true, "btn-ver-cursos");

    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws InterruptedException {
        homePage.scrollDown();
        homePage.preencherEmail();
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() throws InterruptedException {
        /*WebElement.sendKeys(Keys.ENTER);*/
        homePage.pressionarEnter();
        /*driver.findElement(By.id("button")).click();*/
    }

//    @Quando("^eu falho$")
//    public void eu_falho() throws InterruptedException {
//        /*WebElement.sendKeys(Keys.ENTER);*/
//        driver.findElement(By.id("button")).click();
//        /*driver.findElement(By.id("button")).click();*/
//    }

    @Entao("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto() throws InterruptedException {
        String texto = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        homePage.assertEqualsComparacao("O cupom esta errado", "QAZANDO15OFF", texto);
    }


}
