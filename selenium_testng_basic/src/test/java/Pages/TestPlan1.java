package Pages;

import Utilities.Utils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan1 {

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

  @AfterSuite
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

  /**
   * Validar que se muestra todo el contenido de la página Home.
   * @throws InterruptedException
   */
  @Test(description = "TestPlan1_001 - Acceder a la pantalla de elementos", enabled = false)
  public static void TestPlan1_001() throws InterruptedException {

    // PASO 1

    // Acciones
    Utils.chromeDriver.get("https://demoqa.com/");

    // Condiciones
    if(Utils.chromeDriver.findElementsByXPath("//img[contains(@src,'/images/Toolsqa.jpg')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//a[contains(@href,'https://www.toolsqa.com/selenium-training/')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Elements')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Forms')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Alerts, Frame & Windows')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Widgets')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Interactions')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Book Store Application')]]").size() == 0){
      System.out.println("Validación paso 1 ha fallado!!");
    }


    // PASO 2

    // Acciones
    Utils.chromeDriver.findElementByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Elements')]]").click();
    Thread.sleep(2000);
    // Condiciones
    if(Utils.chromeDriver.findElementsByXPath("//li[contains(@id,'item-0')]//span[contains(text(),'Text Box')]").size() == 0){
      System.out.println("Validación paso 2 ha fallado!!");
    }


    // PASO 3

    // Acciones
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-0')]//span[contains(text(),'Text Box')]").click();

    // Condiciones
    if(Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userName')]").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userEmail')]").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("//textarea[contains(@id,'currentAddress')]").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("//textarea[contains(@id,'permanentAddress')]").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'submit')]").size() == 0){
      System.out.println("Validación paso 3 ha fallado!!");
    }


    // PASO 4

    // Acciones
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userName')]").sendKeys("Pepe");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").sendKeys("pepe@pepephone.com");
    Utils.chromeDriver.findElementByXPath("//textarea[contains(@id,'currentAddress')]").sendKeys("calle manila 85");
    Utils.chromeDriver.findElementByXPath("//textarea[contains(@id,'permanentAddress')]").sendKeys("Av de las ciencias 42");
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
  
    // Condiciones
    if(Utils.chromeDriver.findElementsByXPath("//p[contains(@id,'name')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//p[contains(@id,'email')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//p[contains(@id,'currentAddress')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//p[contains(@id,'permanentAddress')]").size() == 0){
      System.out.println("Validación paso 4 ha fallado!!");
    }

  }

  /**
   * Validar que se muestra todo el contenido de la página Home.
   * @throws InterruptedException
   */
  @Test(description = "TestPlan1_002 - Acceder a la pantalla de elementos", enabled = false)
  public static void TestPlan1_002() throws InterruptedException {

    // PASO 1

    // Acciones
    Utils.chromeDriver.get("https://demoqa.com/");

    // Condiciones
    if(Utils.chromeDriver.findElementsByXPath("//img[contains(@src,'/images/Toolsqa.jpg')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//a[contains(@href,'https://www.toolsqa.com/selenium-training/')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Elements')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Forms')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Alerts, Frame & Windows')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Widgets')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Interactions')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Book Store Application')]]").size() == 0){
      System.out.println("Validación paso 1 ha fallado!!");
    }


    // PASO 2

    // Acciones
    Utils.chromeDriver.findElementByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Elements')]]").click();
    Thread.sleep(2000);
    // Condiciones
    if(Utils.chromeDriver.findElementsByXPath("//li[contains(@id,'item-0')]//span[contains(text(),'Text Box')]").size() == 0){
      System.out.println("Validación paso 2 ha fallado!!");
    }


    // PASO 3

    // Acciones
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-0')]//span[contains(text(),'Text Box')]").click();

    // Condiciones
    if(Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userName')]").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userEmail')]").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("//textarea[contains(@id,'currentAddress')]").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("//textarea[contains(@id,'permanentAddress')]").size() == 0 ||
    Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'submit')]").size() == 0){
      System.out.println("Validación paso 3 ha fallado!!");
    }


    // PASO 4

    // Acciones
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userName')]").sendKeys("Antonio");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").sendKeys("antonio@pepephone.com");
    Utils.chromeDriver.findElementByXPath("//textarea[contains(@id,'currentAddress')]").sendKeys("calle angustia 85");
    Utils.chromeDriver.findElementByXPath("//textarea[contains(@id,'permanentAddress')]").sendKeys("Av de las letras 42");
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
  
    // Condiciones
    if(Utils.chromeDriver.findElementsByXPath("//p[contains(@id,'name')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//p[contains(@id,'email')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//p[contains(@id,'currentAddress')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//p[contains(@id,'permanentAddress')]").size() == 0){
      System.out.println("Validación paso 4 ha fallado!!");
    }
  }

  /**
   * Validar que se muestra todo el contenido de la página Home.
   * @throws InterruptedException
   */
  @Test(description = "TestPlan1_003 - Acceder a la pantalla de elementos", enabled = false)
  public static void TestPlan1_003() throws InterruptedException {

    // PASO 1

    // Acciones
    Utils.chromeDriver.get("https://demoqa.com/");

    // Condiciones
    if(Utils.chromeDriver.findElementsByXPath("//img[contains(@src,'/images/Toolsqa.jpg')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//a[contains(@href,'https://www.toolsqa.com/selenium-training/')]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Elements')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Forms')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Alerts, Frame & Windows')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Widgets')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Interactions')]]").size() == 0 ||
      Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Book Store Application')]]").size() == 0){
      System.out.println("Validación paso 1 ha fallado!!");
    }


    // PASO 2

    // Acciones
    Utils.chromeDriver.findElementByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Elements')]]").click();
    Thread.sleep(2000);
    // Condiciones
    if(Utils.chromeDriver.findElementsByXPath("//li[contains(@id,'item-1')]//span[contains(text(),'Check Box')]").size() == 0){
      System.out.println("Validación paso 2 ha fallado!!");
    }


    // PASO 3

    // Acciones
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-1')]//span[contains(text(),'Check Box')]").click();

    // Condiciones


    // PASO 4

    // Acciones

    Utils.chromeDriver.findElementByXPath("//button[contains(@aria-label,'Toggle')]").click();
    Utils.chromeDriver.findElementByXPath("//button[contains(@aria-label,'Toggle')][./following-sibling::label/span[contains(text(),'Desktop')]]").click();
    Utils.chromeDriver.findElementByXPath("//span[./following-sibling::span[contains(text(),'Notes')]][contains(@class,'rct-checkbox')]").click();





    

  }

  /**
   * Validar que se muestra todo el contenido de la página Home.
   * @throws InterruptedException
   */
  @Test(description = "TestPlan1_004 - Acceder a la pantalla de elementos", enabled = false)
  public static void TestPlan1_004() throws InterruptedException {

    // PASO 1

    Utils.chromeDriver.get("https://demoqa.com/");

    Utils.chromeDriver.findElementByXPath("//div[contains(@class,'card mt-4 top-card')][.//h5[contains(text(),'Forms')]]").click();

    Utils.chromeDriver.findElementByXPath("//li//span[text()='Practice Form']").click();
    
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"firstName\")]").click();
    Thread.sleep(1000);
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"firstName\")]").sendKeys("Pepe");
    Thread.sleep(1000);
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"lastName\")]").click();
    Thread.sleep(1000);
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"lastName\")]").sendKeys("Quality Assurance");
    Thread.sleep(1000);
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"userEmail\")]").click();
    Thread.sleep(1000);
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"userEmail\")]").sendKeys("pepe@qa.com");
    Thread.sleep(1000);
    Utils.chromeDriver.findElementByXPath("//input[contains(@value,\"Other\")]/..").click();
    Thread.sleep(1000);
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"userNumber\")]").click();
    Thread.sleep(1000);
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,\"userNumber\")]").sendKeys("0123456789");
    Thread.sleep(1000);
    Utils.chromeDriver.findElementByXPath("//textarea[contains(@id, \"currentAddress\")]").sendKeys("Av Assurance Quality");
    Thread.sleep(1000);


    Utils.chromeDriver.findElementByXPath("//div[./div[contains(text(),'Widgets')]]").click();
    Thread.sleep(1000);
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
    Thread.sleep(1000);
  }
}