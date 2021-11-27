package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class VisualizarClientesSteps {

    private static WebDriver driver;

    @Before
    public void inicializar(){
        driver = new ChromeDriver();
    }

    @Dado("que estou na pagina inicial")
    public void que_estou_na_pagina_inicial() {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:3000/clients");
    }
    @Quando("não estou logado")
    public void não_estou_logado() {

    }
    @Então("visualizo a cliente {string} com e-mail {string} na posição {string}")
    public void visualizo_a_cliente_com_e_mail_na_posição(String string, String string2, String posicaoString) {
        System.out.println(posicaoString);
        int posicao = Integer.parseInt(posicaoString);
        String nomeEsperado = string;
        String emailEsperado = string2;

        WebElement elementoNome = driver.findElement(By.cssSelector("#root > div > div > table > tbody > tr:nth-child(" + posicaoString + ") > td:nth-child(1)"));
        String nomeEncontrado = elementoNome.getText();

        WebElement elementoEmail = driver.findElement(By.cssSelector("#root > div > div > table > tbody > tr:nth-child(" + posicaoString + ") > td:nth-child(2)"));
        String emailEncontrado = elementoEmail.getText();

        assertThat(nomeEncontrado).isEqualTo(nomeEsperado);

        assertThat(emailEncontrado).isEqualTo(emailEsperado);
    }
    @After
    public void finalizar() {
        driver.quit();
    }
}