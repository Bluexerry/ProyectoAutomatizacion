package Pages;

import Utilities.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExamenT3 {

    // Clases de utilidades

    // Instanciar acciones/condiciones
    public String testId;

    // Instanciar clases de test

    /**
     * Instanciador de la conexión entre el test y el dispositivo.
     * 
     * @throws Exception
     */
    @BeforeSuite
    public void setup_test() throws Exception {
        Utils.Instanciador_Chrome();
    }

    @AfterMethod
    public void breakup_test() throws Exception {
        Utils.CloseBrowser();
    }

    /**************************************************
     * 
     * 
     * Pruebas
     * 
     * 
     **************************************************/

    /* HECHO */
    @Test(description = "ExamenT3 - Test X", enabled = true)
    public void ExamenT3_TC01() throws InterruptedException {

        // Paso 1 - Entrar en la web y esperar 3 segundos
        // Acción
        Utils.chromeDriver.get("https://demoqa.com/");
        Thread.sleep(3000);
        // Condición
       

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");


        // Realiza un scroll de vuelta al inicio
        js.executeScript("window.scrollTo(0,0)");

        // Paso 2 - Click en Boton "Elements"
        // Acción
        Utils.chromeDriver.findElementByXPath("//h5[contains(text(),'Elements')]/parent::div").click();
        Thread.sleep(2000);
        // Condición
       

        // Realiza un scroll vertical de 500 píxeles
        js.executeScript("window.scrollBy(0,500)");


        // Realiza un scroll de vuelta al inicio
        js.executeScript("window.scrollTo(0,0)");
    }
}