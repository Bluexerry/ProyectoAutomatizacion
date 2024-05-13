package Pages;

import Utilities.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Elements {

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
  @Test(description = "Elements_TC01 - Acceder a la pantalla de elementos", enabled = false)
  public void Elements_TC01() throws InterruptedException {

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

    // Paso 2 - Click en Boton "Elements"
    // Acción
    Utils.chromeDriver.findElementByXPath("//h5[contains(text(),'Elements')]/parent::div").click();
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
  @Test(description = "Elements_TC02 - Verificar el Funcionamiento de la textBox.", enabled = false)
  public void Elements_TC02() throws InterruptedException {

    Elements_TC01();
    // Paso 1 - Click en "TextBox"
    // Acción
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-')]/span[contains(text(),'Text Box')]").click();
    Thread.sleep(2000);
    // Condición
    if (Utils.chromeDriver.findElementsByXPath("//input[@id='userName']").size() > 0) {
      System.out.println("Aparece el elemento //input[@id='userName']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[@id='userEmail']").size() > 0) {
      System.out.println("Aparece el elemento //input[@id='userEmail']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//textarea[@id='currentAddress']").size() > 0) {
      System.out.println("Aparece el elemento //textarea[@id='currentAddress']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//textarea[@id='permanentAddress']").size() > 0) {
      System.out.println("Aparece el elemento //textarea[@id='permanentAddress']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@id='submit']").size() > 0) {
      System.out.println("Aparece el elemento //button[@id='submit']");
    }

    // Paso 2 - Rellenar elementos
    // Acción
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userName')]").sendKeys("Antonio");
    Utils.chromeDriver.findElementByXPath("//input[@id='userEmail']").sendKeys("antonio@pepephone.com");
    Utils.chromeDriver.findElementByXPath("//textarea[@id='currentAddress']").sendKeys("Calle Angustia 85");
    Utils.chromeDriver.findElementByXPath("//textarea[@id='permanentAddress']").sendKeys("Av de las letras 42");

    // Realiza un scroll vertical de 500 píxeles
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("window.scrollBy(0,500)");

    Utils.chromeDriver.findElementByXPath("//button[@id='submit']").click();
    // Condición
    if (Utils.chromeDriver.findElementByXPath("//p[contains(@id,'name')]").getText().contains("Antonio")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //p[contains(@id,'name')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//p[@id='email']").getText().contains("antonio@pepephone.com")) {
      System.out.println("Aparece el texto 'antonio@pepephone.com' en el elemento //p[@id='email']");
    }
    if (Utils.chromeDriver.findElementByXPath("//p[@id='currentAddress']").getText().contains("Calle Angustia 85")) {
      System.out.println("Aparece el texto 'Calle Angustia 85' en el elemento //p[@id='currentAddress']");
    }
    if (Utils.chromeDriver.findElementByXPath("//p[@id='permanentAddress']").getText()
        .contains("Av de las letras 42")) {
      System.out.println("Aparece el texto 'Av de las letras 42' en el elemento //p[@id='permanentAddress']");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC03 - Verificar el Funcionamiento de CheckBox - Home", enabled = false)
  public void Elements_TC03() throws InterruptedException {

    Elements_TC01();
    // Paso 1
    // Accion - Click en "CheckBox"
    Utils.chromeDriver.findElementByXPath("//span[contains(text(),'Check Box')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Check Box')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Check Box')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]").size() > 0) {
      System.out
          .println("Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[@class='rct-title']").size() > 0) {
      System.out.println("Aparece el elemento //span[@class='rct-title']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@title='Expand all']").size() > 0) {
      System.out.println("Aparece el elemento //button[@title='Expand all']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@title='Collapse all']").size() > 0) {
      System.out.println("Aparece el elemento //button[@title='Collapse all']");
    }

    // Paso 2
    // Accion - Click en la casilla "Home"
    Utils.chromeDriver.findElementByXPath("//span[contains(@class,'rct-checkbox')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='You have selected :']")
        .size() > 0) {
      System.out.println("Aparece el texto //span[contains(normalize-space(),'You have selected :')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='home']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='home']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='desktop']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='desktop']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='notes']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='notes']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='commands']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='commands']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='documents']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='documents']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='workspace']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='workspace']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='react']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='react']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='angular']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='angular']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='veu']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='veu']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='office']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='office']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='public']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='public']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='private']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='private']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='classified']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='classified']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='general']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='general']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='downloads']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='downloads']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='wordFile']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='wordFile']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='excelFile']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='excelFile']");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC04 - Verificar el funcionamiento de la CheckBox - Desktop", enabled = false)
  public void Elements_TC04() throws InterruptedException {

    Elements_TC01();
    // Paso 1
    // Accion - Click en "CheckBox"
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-1')]//span[contains(text(),'Check Box')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Check Box')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Check Box')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]").size() > 0) {
      System.out
          .println("Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[@class='rct-title']").size() > 0) {
      System.out.println("Aparece el elemento //span[@class='rct-title']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@title='Expand all']").size() > 0) {
      System.out.println("Aparece el elemento //button[@title='Expand all']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@title='Collapse all']").size() > 0) {
      System.out.println("Aparece el elemento //button[@title='Collapse all']");
    }

    // Paso 2
    // Accion - Click en boton +
    Utils.chromeDriver.findElementByXPath("//button[contains(@aria-label,'Expand all')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Desktop')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Desktop')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Notes')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Notes')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Commands')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Commands')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Documents')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Documents')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'WorkSpace')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'WorkSpace')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'React')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'React')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Angular')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Angular')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Veu')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Veu')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Office')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Office')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Public')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Public')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Private')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Private')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Classified')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Classified')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'General')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'General')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Downloads')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Downloads')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Word File.doc')]").size() > 0) {
      System.out.println("");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Excel File.doc')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Excel File.doc')]");
    }

    // Paso 3
    // Accion - Click en "Desktop"
    Utils.chromeDriver.findElementByXPath("//span[contains(text(),'Desktop')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='You have selected :']")
        .size() > 0) {
      System.out.println("Aparece el texto //span[contains(normalize-space(),'You have selected :')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='desktop']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='desktop']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='notes']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='notes']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='commands']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='commands']");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-half-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-half-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-notes']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-notes']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-commands']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-commands']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC05 - Verificar el funcionamiento de ChexkBox - Documents", enabled = false)
  public void Elements_TC05() throws InterruptedException {

    Elements_TC01();
    // Paso 1
    // Accion - Click en "CheckBox"
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-1')]//span[contains(text(),'Check Box')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Check Box')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Check Box')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]").size() > 0) {
      System.out
          .println("Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[@class='rct-title']").size() > 0) {
      System.out.println("Aparece el elemento //span[@class='rct-title']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@title='Expand all']").size() > 0) {
      System.out.println("Aparece el elemento //button[@title='Expand all']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@title='Collapse all']").size() > 0) {
      System.out.println("Aparece el elemento //button[@title='Collapse all']");
    }

    // Paso 2
    // Accion - Click en boton +
    Utils.chromeDriver.findElementByXPath("//button[contains(@aria-label,'Expand all')]").click();

    // Realiza un scroll vertical de 500 píxeles
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("window.scrollBy(0,500)");

    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Desktop')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Desktop')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Notes')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Notes')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Commands')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Commands')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Documents')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Documents')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'WorkSpace')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'WorkSpace')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'React')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'React')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Angular')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Angular')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Veu')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Veu')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Office')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Office')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Public')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Public')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Private')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Private')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Classified')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Classified')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'General')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'General')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Downloads')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Downloads')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Word File.doc')]").size() > 0) {
      System.out.println("");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Excel File.doc')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Excel File.doc')]");
    }

    // Paso 3
    // Accion - Click en "Documents"
    Utils.chromeDriver.findElementByXPath("//span[contains(text(),'Documents')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='You have selected :']")
        .size() > 0) {
      System.out.println("Aparece el texto //span[contains(normalize-space(),'You have selected :')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='documents']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='documents']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='workspace']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='workspace']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='react']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='react']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='angular']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='angular']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='veu']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='veu']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='office']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='office']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='public']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='public']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='private']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='private']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='classified']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='classified']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='general']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='general']");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-half-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-half-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-documents']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-documents']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }

    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-workspace']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-workspace']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-react']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-react']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-angular']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-angular']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-veu']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-veu']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-office']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-office']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-public']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-public']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-private']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-private']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-classified']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-classified']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-general']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-general']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC06 - Verificar el funcionamiento CheckBox - Office", enabled = false)
  public void Elements_TC06() throws InterruptedException {

    Elements_TC01();
    // Paso 1
    // Accion - Click en "CheckBox"
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-1')]//span[contains(text(),'Check Box')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Check Box')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Check Box')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]").size() > 0) {
      System.out
          .println("Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[@class='rct-title']").size() > 0) {
      System.out.println("Aparece el elemento //span[@class='rct-title']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@title='Expand all']").size() > 0) {
      System.out.println("Aparece el elemento //button[@title='Expand all']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@title='Collapse all']").size() > 0) {
      System.out.println("Aparece el elemento //button[@title='Collapse all']");
    }

    // Paso 2
    // Accion - Click en boton +
    Utils.chromeDriver.findElementByXPath("//button[contains(@aria-label,'Expand all')]").click();

    // Realiza un scroll vertical de 500 píxeles
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("window.scrollBy(0,500)");

    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Desktop')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Desktop')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Notes')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Notes')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Commands')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Commands')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Documents')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Documents')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'WorkSpace')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'WorkSpace')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'React')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'React')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Angular')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Angular')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Veu')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Veu')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Office')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Office')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Public')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Public')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Private')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Private')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Classified')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Classified')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'General')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'General')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Downloads')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Downloads')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Word File.doc')]").size() > 0) {
      System.out.println("");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Excel File.doc')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Excel File.doc')]");
    }

    // Paso 3
    // Accion - Click en "Office"
    Utils.chromeDriver.findElementByXPath("//span[contains(text(),'Office')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='You have selected :']")
        .size() > 0) {
      System.out.println("Aparece el texto //span[contains(normalize-space(),'You have selected :')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='office']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='office']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='public']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='public']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='private']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='private']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='classified']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='classified']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='general']").size() > 0) {
      System.out.println("Aparece el texto //span[normalize-space()='general']");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-half-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-half-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-documents']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-half-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-documents']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-half-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-office']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-office']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-public']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-public']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-private']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-private']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-classified']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-classified']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-general']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-general']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC07 - Verificar el funcionamiento CheckBox - Downloads", enabled = false)
  public void Elements_TC07() throws InterruptedException {

    Elements_TC01();
    // Paso 1
    // Accion - Click en "CheckBox"
    Utils.chromeDriver.findElementByXPath("//li[contains(@id,'item-1')]//span[contains(text(),'Check Box')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Check Box')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Check Box')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]").size() > 0) {
      System.out
          .println("Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[@class='rct-title']").size() > 0) {
      System.out.println("Aparece el elemento //span[@class='rct-title']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@title='Expand all']").size() > 0) {
      System.out.println("Aparece el elemento //button[@title='Expand all']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@title='Collapse all']").size() > 0) {
      System.out.println("Aparece el elemento //button[@title='Collapse all']");
    }

    // Paso 2
    // Accion - Click en boton +
    Utils.chromeDriver.findElementByXPath("//button[contains(@aria-label,'Expand all')]").click();

    // Realiza un scroll vertical de 500 píxeles
    JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
    js.executeScript("window.scrollBy(0,500)");

    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Desktop')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Desktop')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Notes')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Notes')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Commands')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Commands')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Documents')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Documents')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'WorkSpace')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'WorkSpace')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'React')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'React')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Angular')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Angular')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Veu')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Veu')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Office')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Office')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Public')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Public')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Private')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Private')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Classified')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Classified')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'General')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'General')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Downloads')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Downloads')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Word File.doc')]").size() > 0) {
      System.out.println("");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Excel File.doc')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Excel File.doc')]");
    }

    // Paso 3
    // Accion - Click en "Downloads"
    Utils.chromeDriver.findElementByXPath("//span[contains(text(),'Downloads')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='You have selected :']")
        .size() > 0) {
      System.out.println("Aparece el texto //span[contains(normalize-space(),'You have selected :')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Downloads')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Downloads')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Word File.doc')]").size() > 0) {
      System.out.println("");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(text(),'Excel File.doc')]").size() > 0) {
      System.out.println("Aparece el elemento //span[contains(text(),'Excel File.doc')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-half-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-half-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-downloads']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-downloads']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-wordFile']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-wordFile']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//label[@for='tree-node-excelFile']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]")
        .size() > 0) {
      System.out.println(
          "Aparece el texto //label[@for='tree-node-excelFile']//span[@class='rct-checkbox']//*[name()='svg' and contains(@class,'rct-icon rct-icon-check')]");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC08 - Verificar el funcionamiento Radio Button", enabled = false)
  public void Elements_TC08() throws InterruptedException {

    Elements_TC01();
    // Paso 1
    // Accion - Click en "RadioButton"
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Radio Button')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Radio Button')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Radio Button')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-2')]").size() > 0) {
      System.out
          .println("Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-2')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'mb-3')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(@class,'mb-3')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//label[contains(normalize-space(),'Yes')]").size() > 0) {
      System.out.println("Aparece el elemento //label[contains(normalize-space(),'Yes')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//label[contains(normalize-space(),'Impressive')]").size() > 0) {
      System.out.println("Aparece el elemento //label[contains(normalize-space(),'Impressive')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//label[contains(normalize-space(),'No')]").size() > 0) {
      System.out.println("Aparece el elemento //label[contains(normalize-space(),'No')]");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
    }

    // Paso 2
    // Accion - Click en boton "Yes"
    Utils.chromeDriver.findElementByXPath("//label[contains(normalize-space(),'Yes')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//p[contains(@class,'mt-3')]").size() > 0) {
      System.out.println("Aparece el elemento //p[contains(@class,'mt-3')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//span[contains(@class,'text-success')and contains(text(),'Yes')]")
        .size() > 0) {
      System.out.println("Aparece el elemento //span[contains(@class,'text-success')and contains(text(),'Yes')]");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC09 - Verificar el funcionamiento de Web Tables - Edicion 1", enabled = false)
  public void Elements_TC09() throws InterruptedException {

    Elements_TC01();
    // Paso 1
    // Accion - Click en "Web Tables"
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Web Tables')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'addNewRecordButton')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'addNewRecordButton')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-3')]").size() > 0) {
      System.out
          .println("Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-3')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Web Tables')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Web Tables')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'searchBox')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'searchBox')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@value,'1')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@value,'1')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//select[contains(@aria-label,'rows per page')]").size() > 0) {
      System.out.println("Aparece el elemento //select[contains(@aria-label,'rows per page')]");
    }

    if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'First Name')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(text(),'First Name')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Last Name')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(text(),'Last Name')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Age')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(text(),'Age')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Email')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(text(),'Email')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Salary')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(text(),'Salary')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Department')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(text(),'Department')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Action')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(text(),'Action')]");
    }

    // Paso 2
    // Accion - Click y edicio en las casillas descritas
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'addNewRecordButton')]").click();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").sendKeys("Antonio");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").sendKeys("Vergara");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").sendKeys("antonio@example.com");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'age')]").sendKeys("30");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'salary')]").sendKeys("1500");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'department')]").sendKeys("Gaming");
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").getText().contains("Antonio")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'firstName')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").getText().contains("Vergara")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'lastName')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").getText()
        .contains("antonio@example.com")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'userEmail')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'age')]").getText()
        .contains("30")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'age')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'salary')]").getText().contains("1500")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'salary')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'department')]").getText().contains("Gaming")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'department')]");
    }

    // Paso 3
    // Accion - Click en "Submit"
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Antonio']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Antonio']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Veragara']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Veragara']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='30']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='30']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='antonio@example.com']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='antonio@example.com']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='1500']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='1500']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Gaming']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Gaming']");
    }
    if (Utils.chromeDriver
        .findElementsByXPath(
            "//span[@id='delete-record-4']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //span[@id='delete-record-4']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[@id='registration-form-modal']").size() < 0) {
      System.out.println("Aparece el elemento //div[@id='registration-form-modal']");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC10 - Verificar el funcionamiento de Web Tables - Edicion 2", enabled = false)
  public void Elements_TC10() throws InterruptedException {

    Elements_TC01();
    // Paso 1
    // Accion - Click en "Web Tables"
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Web Tables')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'addNewRecordButton')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'addNewRecordButton')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-3')]").size() > 0) {
      System.out
          .println("Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-3')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Web Tables')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Web Tables')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'searchBox')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'searchBox')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@value,'1')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@value,'1')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//select[contains(@aria-label,'rows per page')]").size() > 0) {
      System.out.println("Aparece el elemento //select[contains(@aria-label,'rows per page')]");
    }

    // Paso 2
    // Accion - Click en boton con forma de lapiz en la seccion "FN" - Cierra
    Utils.chromeDriver
        .findElementByXPath(
            "//span[contains(@id,'edit-record-1')]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")
        .click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//div[@id='registration-form-modal']").size() > 0) {
      System.out.println("Aparece el elemento //div[@id='registration-form-modal']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'firstName')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'firstName')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'lastName')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userEmail')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'userEmail')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'age')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'age')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'salary')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'salary')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'department')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'department')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'submit')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'submit')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@class,'close')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@class,'close')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'fade modal-backdrop show')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(@class,'fade modal-backdrop show')]");
    }

    // Paso 3
    // Accion - Click y edicion en las casillas descritas
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").sendKeys("Jesus");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").sendKeys("Vazquez");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").sendKeys("jesus@example.com");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'age')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'age')]").sendKeys("25");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'salary')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'salary')]").sendKeys("1500");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'department')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'department')]").sendKeys("Programing");
    // Condicion
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").getText().contains("Jesus")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'firstName')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").getText().contains("Vazquez")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'lastName')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").getText()
        .contains("jesus@example.com")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'userEmail')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'age')]").getText()
        .contains("25")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'age')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'salary')]").getText().contains("1500")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'salary')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'department')]").getText().contains("Programing")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'department')]");
    }

    // Paso 4
    // Accion - Click en "Submit"
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Jesus']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Jesus']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Vazquez']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Vazquez']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='25']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='25']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='jesus@example.com']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='jesus@example.com']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='1500']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='1500']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Programing']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Programing']");
    }
    if (Utils.chromeDriver
        .findElementsByXPath(
            "//span[@id='delete-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //span[@id='delete-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[@id='registration-form-modal']").size() < 0) {
      System.out.println("Aparece el elemento //div[@id='registration-form-modal']");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC11 - Verificar el funcionamiento de Web Tables - Edicion 3", enabled = false)
  public void Elements_TC11() throws InterruptedException {

    Elements_TC01();
    // Paso 1
    // Accion - Click en "Web Tables"
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Web Tables')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'addNewRecordButton')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'addNewRecordButton')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-3')]").size() > 0) {
      System.out
          .println("Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-3')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Web Tables')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Web Tables')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'searchBox')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'searchBox')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@value,'1')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@value,'1')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//select[contains(@aria-label,'rows per page')]").size() > 0) {
      System.out.println("Aparece el elemento //select[contains(@aria-label,'rows per page')]");
    }

    // Paso 2
    // Accion - Click en boton con forma de lapiz en la seccion "FN" - Alden
    Utils.chromeDriver
        .findElementByXPath(
            "//span[contains(@id,'edit-record-2')]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")
        .click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//div[@id='registration-form-modal']").size() > 0) {
      System.out.println("Aparece el elemento //div[@id='registration-form-modal']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'firstName')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'firstName')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'lastName')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userEmail')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'userEmail')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'age')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'age')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'salary')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'salary')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'department')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'department')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'submit')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'submit')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@class,'close')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@class,'close')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'fade modal-backdrop show')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(@class,'fade modal-backdrop show')]");
    }

    // Paso 3
    // Accion - Click y edicion en las casillas descritas
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").sendKeys("Miguel");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").sendKeys("Romero");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").sendKeys("miguel@example.com");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'age')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'age')]").sendKeys("24");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'salary')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'salary')]").sendKeys("1200");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'department')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'department')]").sendKeys("Developming");
    // Condicion
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").getText().contains("Miguel")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'firstName')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").getText().contains("Romero")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'lastName')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").getText()
        .contains("miguel@example.com")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'userEmail')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'age')]").getText()
        .contains("24")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'age')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'salary')]").getText().contains("1200")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'salary')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'department')]").getText()
        .contains("Developming")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'department')]");
    }

    // Paso 4
    // Accion - Click en "Submit"
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Miguel']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Miguel']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Romero']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Romero']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='24']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='24']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='miguel@example.com']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='miguel@example.com']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='1200']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='1200']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Develpmong']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Developming']");
    }
    if (Utils.chromeDriver
        .findElementsByXPath(
            "//span[@id='edit-record-2']//*[name()='svg']")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //span[@id='edit-record-2']//*[name()='svg']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[@id='registration-form-modal']").size() < 0) {
      System.out.println("Aparece el elemento //div[@id='registration-form-modal']");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC12 - Verificar el funcionamiento de Web Tables - Edicion 4", enabled = false)
  public void Elements_TC12() throws InterruptedException {

    Elements_TC01();
    // Paso 1
    // Accion - Click en "Web Tables"
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Web Tables')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'addNewRecordButton')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'addNewRecordButton')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-3')]").size() > 0) {
      System.out
          .println("Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-3')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Web Tables')]").size() > 0) {
      System.out.println("Aparece el elemento //h1[contains(normalize-space(),'Web Tables')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'searchBox')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'searchBox')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@value,'1')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@value,'1')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//select[contains(@aria-label,'rows per page')]").size() > 0) {
      System.out.println("Aparece el elemento //select[contains(@aria-label,'rows per page')]");
    }

    // Paso 2
    // Accion - Click en boton con forma de lapiz en la seccion "FN" - Kierra
    Utils.chromeDriver
        .findElementByXPath(
            "//span[contains(@id,'edit-record-3')]//*[name()='svg']//*[name()='path' and contains(@d,'M880 836H1')]")
        .click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//div[@id='registration-form-modal']").size() > 0) {
      System.out.println("Aparece el elemento //div[@id='registration-form-modal']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'firstName')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'firstName')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'lastName')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'userEmail')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'userEmail')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'age')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'age')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'salary')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'salary')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'department')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'department')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'submit')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'submit')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@class,'close')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@class,'close')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[contains(@class,'fade modal-backdrop show')]").size() > 0) {
      System.out.println("Aparece el elemento //div[contains(@class,'fade modal-backdrop show')]");
    }

    // Paso 3
    // Accion - Click y edicion en las casillas descritas
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").sendKeys("Samuel");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").sendKeys("Abastos");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").sendKeys("samuel@example.com");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'age')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'age')]").sendKeys("28");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'salary')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'salary')]").sendKeys("1000");
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'department')]").clear();
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'department')]").sendKeys("Streaming");
    // Condicion
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").getText().contains("Samuel")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'firstName')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").getText().contains("Abastos")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'lastName')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").getText()
        .contains("samuel@example.com")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'userEmail')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'age')]").getText()
        .contains("28")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'age')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'salary')]").getText().contains("1000")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'salary')]");
    }
    if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'department')]").getText()
        .contains("Streaming")) {
      System.out.println("Aparece el texto 'Antonio' en el elemento //input[contains(@id,'department')]");
    }

    // Paso 4
    // Accion - Click en "Submit"
    Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Samuel']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Samuel']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Abastos']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Abastos']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='28']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='28']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='samuel@example.com']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='samuel@example.com']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='1000']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='1000']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Streaming']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Streaming']");
    }
    if (Utils.chromeDriver
        .findElementsByXPath(
            "//span[@id='delete-record-3']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //span[@id='delete-record-3']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[@id='registration-form-modal']").size() < 0) {
      System.out.println("Aparece el elemento //div[@id='registration-form-modal']");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC13 - Verificar el funcionamiento de Web Tables - Filtrado de busqueda", enabled = false)
  public void Elements_TC13() throws InterruptedException {

    Elements_TC10();
    // Paso 1
    // Accion - Click en el buscador
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'searchBox')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'searchBox')]").size() > 0) {
      System.out.println("Aparece el elemento //input[contains(@id,'searchBox')]");
    }

    // Paso 2
    // Accion - Click en el filtrado de busqueda
    Utils.chromeDriver.findElementByXPath("//input[contains(@id,'searchBox')]").sendKeys("Jesus");
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Jesus']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Jesus']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Vazquez']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Vazquez']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='25']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='25']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='jesus@example.com']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='jesus@example.com']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='1500']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='1500']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Programing']").size() > 0) {
      System.out.println("Aparece el elemento //div[normalize-space()='Programing']");
    }
    if (Utils.chromeDriver.findElementsByXPath("//*[name()='path' and contains(@d,'M880 836H1')]").size() > 0) {
      System.out.println("Aparece el elemento //*[name()='path' and contains(@d,'M880 836H1')]");
    }
    if (Utils.chromeDriver
        .findElementsByXPath(
            "//span[@id='delete-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //span[@id='delete-record-1']//*[name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]");
    }
  }

  /* HECHO */
  @Test(description = "Elements_TC14 - Verificar el funcionamiento de Buttons", enabled = false)
  public void Elements_TC14() throws InterruptedException {

    Elements_TC01();
    // Paso 1
    // Accion - Click en "Buttons"
    Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Buttons')]").click();
    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver
        .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-4')]").size() > 0) {
      System.out
          .println("Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-4')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'doubleClickBtn')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'doubleClickBtn')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'rightClickBtn')]").size() > 0) {
      System.out.println("Aparece el elemento //button[contains(@id,'rightClickBtn')]");
    }
    if (Utils.chromeDriver.findElementsByXPath("//button[@id='XMUMp']").size() > 0) {
      System.out.println("Aparece el elemento //button[@id='XMUMp']");
    }
    if (Utils.chromeDriver.findElementsByXPath(
        "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
        .size() > 0) {
      System.out.println(
          "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
    }

    // Paso 2
    // Accion - Doble click en "Double click me"

    // Encuentra el elemento en el que quieres hacer doble clic
    WebElement element = Utils.chromeDriver.findElement(By.xpath("//button[contains(@id,'doubleClickBtn')]"));

    // Crea un objeto Actions
    Actions actions = new Actions(Utils.chromeDriver);

    // Realiza un doble clic en el elemento
    actions.doubleClick(element).perform();

    Thread.sleep(2000);
    // Condicion
    if (Utils.chromeDriver.findElementsByXPath("//p[@id='doubleClickMessage']").size() > 0) {
      System.out.println("Aparece el elemento //p[@id='doubleClickMessage']");
    }
  }
}