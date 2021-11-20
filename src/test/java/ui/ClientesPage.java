package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientesPage {

    private WebDriver driver;

    private By primeiroCabecalhoNome = By.cssSelector("th:nth-child(1)");

    private By segundoCabecalhoEmail = By.cssSelector("th:nth-child(2)");

    public ClientesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String obterTextoPrimeiroCabecalho() {
        return driver.findElement(primeiroCabecalhoNome).getText();
    }

    public String obterTextoSegundoCabecalho() {
        return driver.findElement(segundoCabecalhoEmail).getText();
    }
}