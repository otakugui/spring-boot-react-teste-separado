package ui;

import org.junit.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static WebDriver driver;
    protected ClientesPage clientesPage;

    @BeforeClass
    public static void inicializar() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void carregarPaginaInicial() {
        driver.get("http://localhost:3000/clients");
        clientesPage = new ClientesPage(driver);
        driver.manage().window().setSize(new Dimension(1442, 813));
    }
}