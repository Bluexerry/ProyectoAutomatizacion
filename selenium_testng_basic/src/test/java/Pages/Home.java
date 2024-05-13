package Pages;

import Utilities.Utils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Home {

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
    //Utils.Instanciador_Chrome();
  }

  @AfterSuite
  public void breakup_test() throws Exception {
    //Utils.CloseBrowser();
  }

  /**************************************************
   * 
   * 
   * Pruebas
   * 
   * 
   **************************************************/

  /**
   * Validar que se muestra todo el contenido de la página Home.
   * @throws InterruptedException
   */
  @Test(description = "TQA_Home_001 - Home checks", enabled = false)
  public static void TQA_Home_001() throws InterruptedException {

    Utils.chromeDriver.get("https://demoqa.com/");

  }

  /**
   * Validar el contenido de la página Elements.
   * @throws InterruptedException
   */
  @Test(description = "TQA_Home_002 - Elements page", enabled = false)
  public void TQA_Home_002() throws InterruptedException {
    TQA_Home_001();
    Utils.chromeDriver.findElementByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Elements')]]").click();
    if(Utils.chromeDriver.findElementsByXPath("//li//span[text()='Text Box']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Check Box']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Radio Button']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Web Tables']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Buttons']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Links']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Broken Links - Images']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Upload and Download']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Dynamic Properties']").size() == 0){
      System.out.println("Esta validación no bloqueante ha fallado!!");
    }
  }

  /**
   * Validar el contenido de la página Forms.
   * @throws InterruptedException
   */
  @Test(description = "TQA_Home_003 - Forms page", enabled = false)
  public static void TQA_Home_003() throws InterruptedException {
    TQA_Home_001();
    Utils.chromeDriver.findElementByXPath("//div[contains(@class,\"card-body\")]//h5[text()='Forms']").click();
    if(Utils.chromeDriver.findElementsByXPath("//li//span[text()='Practice Form']").size() == 0){
      System.out.println("Esta validación no bloqueante ha fallado!!");
    }
  }

  /**
   * Validar el contenido de la página Alerts, Frame & Windows.
   * @throws InterruptedException
   */
  @Test(description = "TQA_Home_004 - Alerts, Frame & Windows page", enabled = false)
  public void TQA_Home_004() throws InterruptedException {
    TQA_Home_001();
    Utils.chromeDriver.findElementByXPath("//div[contains(@class,\"card-body\")]//h5[text()='Alerts, Frame & Windows']").click();
    if(Utils.chromeDriver.findElementsByXPath("//li//span[text()='Browser Windows']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Alerts']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Frames']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Nested Frames']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Modal Frames']").size() == 0){
      System.out.println("Esta validación no bloqueante ha fallado!!");
    }
  }

  /**
   * Validar el contenido de la página Widgets.
   * @throws InterruptedException
   */
  @Test(description = "TQA_Home_005 - Widgets page", enabled = false)
  public void TQA_Home_005() throws InterruptedException {
    TQA_Home_001();
    Utils.chromeDriver.findElementByXPath("//div[contains(@class,\"card-body\")]//h5[text()='Widgets']").click();
    if(Utils.chromeDriver.findElementsByXPath("//li//span[text()='Accordian']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Auto Complete']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Date Picker']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Slider']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Progress Bar']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Tabs']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Tool Tips']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Menu']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Select Menu']").size() == 0){
      System.out.println("Esta validación no bloqueante ha fallado!!");
    }
  }

  /**
   * Validar el contenido de la página Interactions.
   * @throws InterruptedException
   */
  @Test(description = "TQA_Home_006 - Interactions page", enabled = false)
  public void TQA_Home_006() throws InterruptedException {
    TQA_Home_001();
    Utils.chromeDriver.findElementByXPath("//div[contains(@class,\"card-body\")]//h5[text()='Interactions']").click();
    if(Utils.chromeDriver.findElementsByXPath("//li//span[text()='Sortable']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Selectable']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Resizable']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Droppable']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Dragabble']").size() == 0){
      System.out.println("Esta validación no bloqueante ha fallado!!");
    }
  }

  /**
   * Validar el contenido de la página Book Store Application.
   * @throws InterruptedException
   */
  @Test(description = "TQA_Home_007 - Book Store Application page", enabled = false)
  public void TQA_Home_007() throws InterruptedException {
    TQA_Home_001();
    Utils.chromeDriver.findElementByXPath("//div[contains(@class,\"card-body\")]//h5[text()='Book Store Application']").click();
    if(Utils.chromeDriver.findElementsByXPath("//li//span[text()='Login']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Book Store']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Profile']").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//li//span[text()='Book Store API']").size() == 0){
      System.out.println("Esta validación no bloqueante ha fallado!!");
    }
  }
}
