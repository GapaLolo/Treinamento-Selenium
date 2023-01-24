package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import support.Uteis;

public class HomePage extends Uteis {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

//    public void assertEqualsExibindo(String idElemento, Int){
//        Assert.assertEquals(mensagemE,esperadoE, driver.findElement(By.id(idElemento)).isDisplayed());
//    }



    public void acessarAplicacao(){
        driver.get("https://www.qazando.com.br/curso.html");
        esperarElementoPresente(By.id("btn-ver-cursos"), 10);
    }

    public void scrollDown () throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public void preencherEmail(){
        driver.findElement(By.id("email")).sendKeys("teste@teste.com");
    }

    public void pressionarEnter(){
        driver.findElement(By.id("email")).sendKeys(Keys.ENTER);
    }

    public void verificarResultado(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("O cupom esta errado", "QAZANDO15OFF", texto_cupom);
    }

    public void assertEqualsComparacao(String mensagem, String esperado, String texto){
        Assert.assertEquals(mensagem, esperado, texto);
    }
}
