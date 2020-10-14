import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.AccesosVistas;
import page.ActualizaDatos;
import page.Login;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateMyAddresses {

    private WebDriver driver;
    private String baseURL;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
        baseURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    }

    @Test
    public void updateMyAddress() {
        driver.get(baseURL);
       //logueo
        Login.login(driver);

        //Acceso a vistas
        AccesosVistas vistas = new AccesosVistas(driver);
        vistas.accesoVistas();

        //actualizar datos
        ActualizaDatos datos = new ActualizaDatos(driver);
        datos.actualizarDatos();

        //Validar datos modificados
        datos.validarCambios();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }
}
