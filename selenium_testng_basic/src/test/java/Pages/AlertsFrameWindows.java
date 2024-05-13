package Pages;

import Utilities.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnhandledAlertException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AlertsFrameWindows {

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
  @Test(description = "AlertsFrameWindows_TC01 - Acceder a la pantalla de Alerts, Frame & Windows", enabled = false)
  public void AlertsFrameWindows_TC01() throws InterruptedException {

    // Paso 1 - Entrar en la web y esperar 3 segundos
    // Acción
    Utils.chromeDriver.get("https://demoqa.com/");
    Thread.sleep(3000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//img[contains(@src,'/images/Toolsqa.jpg')]").size() > 0) {
      System.out.println("Aparece el elemento //img[contains(@src,'/images/Toolsqa.jpg')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Elements']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Elements']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Forms']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Forms']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Alerts, Frame & Windows']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Alerts, Frame & Windows']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Widgets']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Widgets']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Interactions']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Interactions']");
    }

    // Realiza un scroll vertical de 500 píxeles
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("window.scrollBy(0,500)");

    if (Utils.chromeDriver.findElementsByXPath("//h5[normalize-space()='Book Store Application']").size() > 0) {
      System.out.println("Aparece el elemento //h5[normalize-space()='Book Store Application']");
    }

    // Realiza un scroll de vuelta al inicio
    js.executeScript("window.scrollTo(0,0)");

    // Paso 2 - Click en Boton "Forms"
    // Acción
    Utils.chromeDriver.findElementByXPath("//h5[contains(text(),'Alerts')]/parent::div").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Elements']")
        .size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Elements']");
    }

    // Realiza un scroll vertical de 500 píxeles
    js.executeScript("window.scrollBy(0,500)");

    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Forms']")
        .size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Forms']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Alerts, Frame & Windows']")
        .size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Alerts, Frame & Windows']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Widgets']")
        .size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Widgets']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[@class='col-12 mt-4 col-md-6']").size() > 0) {
      System.out.println("Aparece el elemento //div[@class='col-12 mt-4 col-md-6']");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//div[@class='col-12 mt-4 col-md-6'][normalize-space()='Please select an item from left to start practice.']//div[2]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //div[@class='col-12 mt-4 col-md-6'][normalize-space()='Please select an item from left to start practice.']//div[2]");
    }

    // Realiza un scroll de vuelta al inicio
    js.executeScript("window.scrollTo(0,0)");
  }

  /* HECHO */
  @Test(description = "AlertsFrameWindows_TC02 - Verificar el funcionamiento de Browser Windows - Boton New Tab", enabled = false)
  public void AlertsFrameWindows_TC02() throws InterruptedException {

    AlertsFrameWindows_TC01();
    // Paso 1 - Click en "Browser Window"
    // Acción
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Browser Windows')]").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'tabButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'tabButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'windowButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'windowButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'messageWindowButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'messageWindowButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Browser Windows')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Browser Windows')]");
    }

    // Paso 2 - Click en "New Tab"
    // Acción
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'tabButton')]").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//body[contains(@style,'background-color:#a9a9a')]").size() > 0) {
      System.out.println("Aparece el elemento //body[contains(@style,'background-color:#a9a9a')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[@id='sampleHeading']").size() > 0) {
      System.out.println("Aparece el elemento //h1[@id='sampleHeading']");
    }
  }

  /* HECHO */
  @Test(description = "AlertsFrameWindows_TC03 - Verificar el funcionamiento de Browser Windows - Boton New Window", enabled = false)
  public void AlertsFrameWindows_TC03() throws InterruptedException {

    AlertsFrameWindows_TC01();
    // Paso 1 - Click en "Browser Window"
    // Acción
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Browser Windows')]").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'tabButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'tabButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'windowButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'windowButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'messageWindowButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'messageWindowButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Browser Windows')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Browser Windows')]");
    }

    // Paso 2
    // Accion - Click en "New Window"
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'windowButton')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//body[contains(@style,'background-color:#a9a9a')]").size() > 0) {
      System.out.println("Aparece el elemento //body[contains(@style,'background-color:#a9a9a')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[@id='sampleHeading']").size() > 0) {
      System.out.println("Aparece el elemento //h1[@id='sampleHeading']");
    }
  }

  /* HECHO */
  @Test(description = "AlertsFrameWindows_TC04 - Verificar el funcionamiento de Browser Windows - Boton New Window Message", enabled = false)
  public void AlertsFrameWindows_TC04() throws InterruptedException {

    AlertsFrameWindows_TC01();
    // Paso 1
    // Acción - Click en "Browser Windows"
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Browser Windows')]").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'tabButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'tabButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'windowButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'windowButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'messageWindowButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'messageWindowButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Browser Windows')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Browser Windows')]");
    }

    // Paso 2
    // Accion - Click en "New Window Message"
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'messageWindowButton')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//body").size() > 0) {
      System.out.println("Aparece el elemento //body");
    }
  }

  /* HECHO */
  @Test(description = "AlertsFrameWindows_TC05 - Verificar el funcionamiento de Alerts - Alerta Inmediata", enabled = false)
  public void AlertsFrameWindows_TC05() throws InterruptedException {

    AlertsFrameWindows_TC01();
    // Paso 1
    // Acción - Click en "Alerts"
    Utils.chromeDriver.findElementByXPath("//span[normalize-space()='Alerts']").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(normalize-space(),'Click Button to see alert')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //span[contains(normalize-space(),'Click Button to see alert')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//span[contains(normalize-space(),'On button click, alert will appear after 5 seconds')]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //span[contains(normalize-space(),'On button click, alert will appear after 5 seconds')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//span[contains(normalize-space(),'On button click, confirm box will appear')]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //span[contains(normalize-space(),'On button click, confirm box will appear')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//span[contains(normalize-space(),'On button click, prompt box will appear')]")
        .size() > 0) {
      System.out
          .println("Aparece el elemento //span[contains(normalize-space(),'On button click, prompt box will appear')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'alertButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'alertButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'timerAlertButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'timerAlertButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'confirmButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'confirmButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'promtButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'promtButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Alerts')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Alerts')]");
    }

    // Paso 2
    // Accion 1 - Haz clic en el botón de alerta inmediata
    Utils.chromeDriver.findElementByXPath("//button[@id='alertButton']").click();
    Thread.sleep(2000);

    // Condiciones 1
    if (Utils.chromeDriver.switchTo().alert().getText() == "You clicked a button") {
      System.out.println("Aparece el elemento //button[@id='alertButton']");
    }

    // Accion 2 - (Hace falta controlar la alerta mediante try/cathch)
    try {
      Utils.chromeDriver.switchTo().alert().accept();
    } catch (UnhandledAlertException e) {
      System.out.println(e);
    }

  }

  /* HECHO */
  @Test(description = "AlertsFrameWindows_TC06 - Verificar el funcionamiento de Alerts - Alerta tras 5 segundos", enabled = false)
  public void AlertsFrameWindows_TC06() throws InterruptedException {

    AlertsFrameWindows_TC01();
    // Paso 1
    // Acción - Click en "Alerts"
    Utils.chromeDriver.findElementByXPath("//span[normalize-space()='Alerts']").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(normalize-space(),'Click Button to see alert')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //span[contains(normalize-space(),'Click Button to see alert')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//span[contains(normalize-space(),'On button click, alert will appear after 5 seconds')]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //span[contains(normalize-space(),'On button click, alert will appear after 5 seconds')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//span[contains(normalize-space(),'On button click, confirm box will appear')]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //span[contains(normalize-space(),'On button click, confirm box will appear')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//span[contains(normalize-space(),'On button click, prompt box will appear')]")
        .size() > 0) {
      System.out
          .println("Aparece el elemento //span[contains(normalize-space(),'On button click, prompt box will appear')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'alertButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'alertButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'timerAlertButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'timerAlertButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'confirmButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'confirmButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'promtButton')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'promtButton')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Alerts')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Alerts')]");
    }

    // Paso 2
    /*
     * Accion - Click en boton "Click me" tras "On button click, alert will apear
     * after 5 seconds"
     */
    Utils.chromeDriver.findElementByXPath("//button[@id='timerAlertButton']").click();
    Thread.sleep(6000);

    // Condiciones 1
    if (Utils.chromeDriver.switchTo().alert().getText() == "This alert appeared after 5 seconds") {
      System.out.println("Aparece el elemento //button[@id='timerAlertButton']");
    }

    // Accion 2 - (Hace falta controlar la alerta mediante try/cathch)
    try {
      Utils.chromeDriver.switchTo().alert().accept();
    } catch (UnhandledAlertException e) {
      System.out.println(e);
    }

  }

  /* HECHO */
  @Test(description = "AlertsFrameWindows_TC07 - Verificar el funcionamiento de Frames", enabled = false)
  public void AlertsFrameWindows_TC07() throws InterruptedException {

    AlertsFrameWindows_TC01();
    // Paso 1
    // Acción - Click en "Frames"
    Utils.chromeDriver.findElementByXPath("//span[normalize-space()='Frames']").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver
        .findElementsByXPath("//div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]")
        .size() > 0) {
      System.out
          .println("Aparece el elemento //div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Frames']").size() > 0) {
      System.out.println("Aparece el elemento //h1[normalize-space()='Frames']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//body[contains(@style,'background-color:#a9a9a')]").size() > 0) {
      System.out.println("Aparece el elemento //body[contains(@style,'background-color:#a9a9a')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//body[contains(@style,'background-color:#a9a9a')]").size() > 0) {
      System.out.println("Aparece el elemento //body[contains(@style,'background-color:#a9a9a')]");
    }

    // Realiza un scroll vertical de 500 píxeles
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("window.scrollBy(0,500)");

    if (Utils.chromeDriver.findElementsByXPath(
        "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
    }
    Thread.sleep(2000);

    // Paso 2
    // Accion - Click y mantener en las tracciones horizontales y verticales

    /* No hay manera de hacer scroll actualmente */

    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//div[@id='frame2Wrapper']").size() > 0) {
      System.out.println("Aparece el elemento //div[@id='frame2Wrapper']");
    }
  }

  /* HECHO */
  @Test(description = "AlertsFrameWindows_TC08 - Verificar el funcionamiento de Nested Frames", enabled = false)
  public void AlertsFrameWindows_TC08() throws InterruptedException {

    AlertsFrameWindows_TC01();
    // Paso 1
    // Acción - Click en "Nested Frames" y verificacion de "Child Iframe"
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Nested Frames')]").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver
        .findElementsByXPath("//div[contains(text(),'Sample Nested Iframe page. There are nested iframe')]")
        .size() > 0) {
      System.out
          .println("Aparece el elemento //div[contains(text(),'Sample Nested Iframe page. There are nested iframe')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Nested Frames')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Nested Frames')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//p[contains(normalize-space(),'Child Iframe')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //p[contains(normalize-space(),'Child Iframe')]");
    }

    // Paso 2
    // Accion - Click en "Nested Frames" y verificacion de "Parents frame"
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Nested Frames')]").click();

    // Realiza un scroll vertical de 500 píxeles
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("window.scrollBy(0,500)");

    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver
        .findElementsByXPath("//div[contains(text(),'Sample Nested Iframe page. There are nested iframe')]")
        .size() > 0) {
      System.out
          .println("Aparece el elemento //div[contains(text(),'Sample Nested Iframe page. There are nested iframe')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Nested Frames')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Nested Frames')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//body[contains(text(),'Parent frame')]").size() > 0) {
      System.out.println("Aparece el elemento //body[contains(text(),'Parent frame')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[@class='col-12 mt-4 col-md-6']//div[3]").size() > 0) {
      System.out.println("Aparece el elemento //div[@class='col-12 mt-4 col-md-6']//div[3]");
    }
  }

  /* HECHO */
  @Test(description = "AlertsFrameWindows_TC09 - Verificar el funcionamiento de Modal Dialogs", enabled = false)
  public void AlertsFrameWindows_TC09() throws InterruptedException {

    AlertsFrameWindows_TC01();
    // Paso 1
    // Acción - Click en "Modal dialogs"
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Modal Dialogs')]").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Click on button to see modal']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Click on button to see modal']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'showSmallModal')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'showSmallModal')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'showLargeModal')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'showLargeModal')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Modal Dialogs')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Modal Dialogs')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[@class='col-12 mt-4 col-md-6']//div[3]").size() > 0) {
      System.out.println("Aparece el elemento //div[@class='col-12 mt-4 col-md-6']//div[3]");
    }

    // Paso 2
    // Accion - Click en "Small dialog"
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'showSmallModal')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'modal-header')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(@class,'modal-header')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'modal-body')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(@class,'modal-body')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'closeSmallModal')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'closeSmallModal')]");
    }
  }

  /* HECHO */
  @Test(description = "AlertsFrameWindows_TC10 - Verificar el funcionamiento de Modal Dialogs", enabled = false)
  public void AlertsFrameWindows_TC10() throws InterruptedException {

    AlertsFrameWindows_TC01();
    // Paso 1
    // Acción - Click en "Modal dialogs"
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Modal Dialogs')]").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Click on button to see modal']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Click on button to see modal']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'showSmallModal')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'showSmallModal')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'showLargeModal')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'showLargeModal')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Modal Dialogs')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Modal Dialogs')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[@class='col-12 mt-4 col-md-6']//div[3]").size() > 0) {
      System.out.println("Aparece el elemento //div[@class='col-12 mt-4 col-md-6']//div[3]");
    }

    // Paso 2
    // Accion - Click en "Large dialog"
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'showLargeModal')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(@id,'example-modal-sizes-title-lg')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(@id,'example-modal-sizes-title-lg')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]").size() > 0) {
      System.out
          .println("Aparece el elemento //p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'closeLargeModal')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'closeLargeModal')]");
    }
  }
}