package Pages;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Forms {

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
    @Test(description = "Forms_TC01 - Acceder a la pantalla de forms", enabled = false)
    public void Forms_01() throws InterruptedException {

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
        Utils.chromeDriver.findElementByXPath("//h5[contains(text(),'Forms')]/parent::div").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Elements']")
                .size() > 0) {
            System.out.println("Aparece el elemento //div[normalize-space()='Elements']");
        }
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
    }

    /* HECHO */
    @Test(description = "Forms_TC02 - Verificar el funcionamiento de Practice Forms - Correcta aparicion de elementos y click en Date of Birth", enabled = false)
    public void Forms_02() throws InterruptedException {

        Forms_01();
        // Paso 1 - Click en "Practice Forms"
        // Acción
        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Practice Form')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Practice Form')]").size() > 0) {
            System.out.println("Aparece el elemento ");
        }
        if (Utils.chromeDriver.findElementsByXPath("//h5[contains(normalize-space(),'Student Registration Form')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //h5[contains(normalize-space(),'Student Registration Form')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'firstName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'firstName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'lastName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userEmail-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userEmail-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Gender']").size() > 0) {
            System.out.println("Aparece el elemento //div[normalize-space()='Gender']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userNumber-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userNumber-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'dateOfBirth-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'dateOfBirth-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]")
                .size() > 0) {
            System.out
                    .println("Aparece el elemento //div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']");
        }

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        if (Utils.chromeDriver.findElementsByXPath("//label[contains(normalize-space(),'Select picture')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //label[contains(normalize-space(),'Select picture')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'currentAddress-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'currentAddress-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'stateCity-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'stateCity-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'submit')]").size() > 0) {
            System.out.println("Aparece el elemento //button[contains(@id,'submit')]");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-0')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-0')]");
        }

        // Realiza un scroll de vuelta al inicio
        js.executeScript("window.scrollTo(0,0)");

        // Paso 2 - Click en "Date of Birth"
        // Acción
        Utils.chromeDriver.findElementByXPath("//input[contains(@id,'dateOfBirthInput')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//select[contains(@class,'react-datepicker__month-select')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //select[contains(@class,'react-datepicker__month-select')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//select[contains(@class,'react-datepicker__year-select')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //select[contains(@class,'react-datepicker__year-select')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(@aria-label,'Choose Monday, April 1st, 2024')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //div[contains(@aria-label,'Choose Monday, April 1st, 2024')]");
        }
    }

    /* HECHO */
    @Test(description = "Forms_TC03 - Verificar el funcionamiento de Practice Form - Correcta aparicion de elementos y checkeos", enabled = false)
    public void Forms_03() throws InterruptedException {

        Forms_01();
        // Paso 1
        // Acción - Click en "Practice Forms"
        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Practice Form')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Practice Form')]").size() > 0) {
            System.out.println("Aparece el elemento ");
        }
        if (Utils.chromeDriver.findElementsByXPath("//h5[contains(normalize-space(),'Student Registration Form')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //h5[contains(normalize-space(),'Student Registration Form')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'firstName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'firstName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'lastName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userEmail-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userEmail-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Gender']").size() > 0) {
            System.out.println("Aparece el elemento //div[normalize-space()='Gender']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userNumber-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userNumber-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'dateOfBirth-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'dateOfBirth-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]")
                .size() > 0) {
            System.out
                    .println("Aparece el elemento //div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']");
        }

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        if (Utils.chromeDriver.findElementsByXPath("//label[contains(normalize-space(),'Select picture')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //label[contains(normalize-space(),'Select picture')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'currentAddress-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'currentAddress-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'stateCity-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'stateCity-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'submit')]").size() > 0) {
            System.out.println("Aparece el elemento //button[contains(@id,'submit')]");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-0')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-0')]");
        }

        // Paso 2
        // Accion - Click en "Gender" y "Hobbies"
        Utils.chromeDriver.findElementByXPath("//label[contains(normalize-space(),'Male')]").click();
        Utils.chromeDriver.findElementByXPath("//label[contains(normalize-space(),'Sports')]").click();
        Thread.sleep(2000);
        // Condicion
        if (Utils.chromeDriver.findElementByXPath("//label[contains(normalize-space(),'Male')]").isSelected()) {
            System.out.println("Aparece el elemento //label[contains(normalize-space(),'Male')]");
        }
        if (Utils.chromeDriver.findElementByXPath("//label[contains(normalize-space(),'Sports')]").isSelected()) {
            System.out.println("Aparece el elemento //label[contains(normalize-space(),'Sports')]");
        }
    }

    /* HECHO */
    @Test(description = "Forms_TC04 - Verificar el funcionamiento de Practice Form - Correcta aparicion de elementos y picture ", enabled = false)
    public void Forms_04() throws InterruptedException {

        Forms_01();
        // Paso 1
        // Acción - Click en "Practice Forms"
        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Practice Form')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Practice Form')]").size() > 0) {
            System.out.println("Aparece el elemento ");
        }
        if (Utils.chromeDriver.findElementsByXPath("//h5[contains(normalize-space(),'Student Registration Form')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //h5[contains(normalize-space(),'Student Registration Form')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'firstName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'firstName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'lastName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userEmail-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userEmail-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Gender']").size() > 0) {
            System.out.println("Aparece el elemento //div[normalize-space()='Gender']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userNumber-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userNumber-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'dateOfBirth-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'dateOfBirth-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]")
                .size() > 0) {
            System.out
                    .println("Aparece el elemento //div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']");
        }

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        if (Utils.chromeDriver.findElementsByXPath("//label[contains(normalize-space(),'Select picture')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //label[contains(normalize-space(),'Select picture')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'currentAddress-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'currentAddress-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'stateCity-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'stateCity-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'submit')]").size() > 0) {
            System.out.println("Aparece el elemento //button[contains(@id,'submit')]");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-0')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-0')]");
        }

        // Paso 2
        // Accion - Click en "Picture"
        Utils.chromeDriver.findElementByXPath("//label[normalize-space()='Select picture']").click();
        Thread.sleep(2000);
        // Condicion
    }

    /* HECHO */
    @Test(description = "Forms_OK01 - Verificar el funcionamiento de Practice Form - Creacion de formulario", enabled = false)
    public void Forms_OK01() throws InterruptedException {

        Forms_01();
        // Paso 1
        // Acción - Click en "Practice Forms"
        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Practice Form')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Practice Form')]").size() > 0) {
            System.out.println("Aparece el elemento ");
        }
        if (Utils.chromeDriver.findElementsByXPath("//h5[contains(normalize-space(),'Student Registration Form')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //h5[contains(normalize-space(),'Student Registration Form')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'firstName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'firstName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'lastName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userEmail-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userEmail-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Gender']").size() > 0) {
            System.out.println("Aparece el elemento //div[normalize-space()='Gender']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userNumber-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userNumber-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'dateOfBirth-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'dateOfBirth-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]")
                .size() > 0) {
            System.out
                    .println("Aparece el elemento //div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']");
        }

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        if (Utils.chromeDriver.findElementsByXPath("//label[contains(normalize-space(),'Select picture')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //label[contains(normalize-space(),'Select picture')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'currentAddress-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'currentAddress-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'stateCity-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'stateCity-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'submit')]").size() > 0) {
            System.out.println("Aparece el elemento //button[contains(@id,'submit')]");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        }

        // Paso 2
        // Acción - Escribir en los campos
        Utils.chromeDriver.findElementByXPath("//input[contains(@id,'firstName')]").sendKeys("Jesus Manuel");
        Utils.chromeDriver.findElementByXPath("//input[contains(@id,'lastName')]").sendKeys("Vazquez Herrera");
        Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").sendKeys("jesus@example.com");
        Utils.chromeDriver.findElementByXPath("//label[contains(normalize-space(),'Male')]").click();
        Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userNumber')]").sendKeys("1234567890");
        Utils.chromeDriver.findElementByXPath("//label[contains(normalize-space(),'Sports')]").click();
        Utils.chromeDriver.findElementByXPath("//textarea[contains(@id,'currentAddress')]").sendKeys("Calle X Piso D");

        Utils.chromeDriver.findElementByXPath("//input[@id='dateOfBirthInput']").click();
        Thread.sleep(1000);
        Utils.chromeDriver.findElementByXPath("//input[@id='userNumber']").click();

        // Encuentra el campo de entrada (input) por su ID y envía el texto
        WebElement inputElement = Utils.chromeDriver.findElement(By.xpath("//input[@id='subjectsInput']"));
        inputElement.sendKeys("Art");

        // Envía la tecla "Enter"
        inputElement.sendKeys(Keys.ENTER);

        // Hacer clic en el elemento que despliega las opciones
        WebElement dropdownElement = Utils.chromeDriver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
        dropdownElement.click();

        // Hacer clic en la opción específica ("NCR")
        WebElement optionElement = Utils.chromeDriver.findElement(By.xpath("//div[contains(text(),'NCR')]"));
        optionElement.click();

        // Hacer clic en el elemento que despliega las opciones
        WebElement dropdownElement2 = Utils.chromeDriver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
        dropdownElement2.click();

        // Hacer clic en la opción específica ("Delhi")
        WebElement optionElement2 = Utils.chromeDriver.findElement(By.xpath("//div[contains(text(),'Delhi')]"));
        optionElement2.click();

        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementByXPath("//input[@id='firstName']").getText().contains("Jesus Manuel")) {
            System.out.println("Aparece el texto 'Jesus Manuel' en el elemento //input[@id='firstName']");
        }
        if (Utils.chromeDriver.findElementByXPath("//input[@id='lastName']").getText().contains("Vazquez Herrera")) {
            System.out.println("Aparece el texto 'Vazquez Herrera' en el elemento //input[@id='lastName']");
        }
        if (Utils.chromeDriver.findElementByXPath("//input[@id='userEmail']").getText().contains("jesus@example.com")) {
            System.out.println("Aparece el texto 'jesus@example.com' en el elemento //input[@id='userEmail']");
        }
        /*
         * if
         * (Utils.chromeDriver.findElementsByXPath("//label[normalize-space()='Male']").
         * size() > 0) {
         * System.out.println("Aparece el elemento //label[normalize-space()='Male']");
         * }
         */
        if (Utils.chromeDriver.findElementByXPath("//input[@id='userNumber']").getText().contains("1234567890")) {
            System.out.println("Aparece el texto '1234567890' en el elemento //input[@id='userNumber']");
        }
        /*
         * if
         * (Utils.chromeDriver.findElementsByXPath("//label[normalize-space()='Sports']"
         * ).
         * size() > 0) {
         * System.out.println("Aparece el elemento //label[normalize-space()='Sports']"
         * );
         * }
         */
        if (Utils.chromeDriver.findElementByXPath("//textarea[@id='currentAddress']").getText()
                .contains("Calle X Piso D")) {
            System.out.println("Aparece el texto 'Calle X Piso D' en el elemento //textarea[@id='currentAddress']");
        }

        // Paso 3
        // Accion - Click en "Submit"
        Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
        Thread.sleep(2000);
        // Condicion
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(@id,'example-modal-sizes-title-lg')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(@id,'example-modal-sizes-title-lg')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//th[contains(normalize-space(),'Label')]").size() > 0) {
            System.out.println("Aparece el elemento //th[contains(normalize-space(),'Label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//th[contains(normalize-space(),'Values')]").size() > 0) {
            System.out.println("Aparece el elemento //th[contains(normalize-space(),'Values')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'closeLargeModal')]").size() > 0) {
            System.out.println("Aparece el elemento //button[contains(@id,'closeLargeModal')]");
        }
    }

    /* HECHO */
    @Test(description = "Forms_KO01 - Verificar el funcionamiento de Practice Form - Fallo al redactar 1", enabled = false)
    public void Forms_KO01() throws InterruptedException {

        Forms_01();
        // Paso 1
        // Acción - Click en "Practice Forms"
        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Practice Form')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Practice Form')]").size() > 0) {
            System.out.println("Aparece el elemento ");
        }
        if (Utils.chromeDriver.findElementsByXPath("//h5[contains(normalize-space(),'Student Registration Form')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //h5[contains(normalize-space(),'Student Registration Form')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'firstName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'firstName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'lastName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userEmail-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userEmail-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Gender']").size() > 0) {
            System.out.println("Aparece el elemento //div[normalize-space()='Gender']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userNumber-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userNumber-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'dateOfBirth-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'dateOfBirth-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]")
                .size() > 0) {
            System.out
                    .println("Aparece el elemento //div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']");
        }

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        if (Utils.chromeDriver.findElementsByXPath("//label[contains(normalize-space(),'Select picture')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //label[contains(normalize-space(),'Select picture')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'currentAddress-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'currentAddress-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'stateCity-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'stateCity-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'submit')]").size() > 0) {
            System.out.println("Aparece el elemento //button[contains(@id,'submit')]");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        }

        // Paso 2
        // Acción - Escribir los campos opcionales
        Utils.chromeDriver.findElementByXPath("//input[@id='firstName']").sendKeys("Jesus Manuel");
        Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").sendKeys("jesus@example.com");
        Utils.chromeDriver.findElementByXPath("//label[contains(normalize-space(),'Sports')]").click();
        Utils.chromeDriver.findElementByXPath("//textarea[contains(@id,'currentAddress')]").sendKeys("Calle X Piso D");

        Utils.chromeDriver.findElementByXPath("//input[@id='dateOfBirthInput']").click();
        Thread.sleep(1000);
        Utils.chromeDriver.findElementByXPath("//input[@id='userNumber']").click();

        // Encuentra el campo de entrada (input) por su ID y envía el texto
        WebElement inputElement = Utils.chromeDriver.findElement(By.xpath("//input[@id='subjectsInput']"));
        inputElement.sendKeys("Art");

        // Envía la tecla "Enter"
        inputElement.sendKeys(Keys.ENTER);

        // Hacer clic en el elemento que despliega las opciones
        WebElement dropdownElement = Utils.chromeDriver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
        dropdownElement.click();

        // Hacer clic en la opción específica ("NCR")
        WebElement optionElement = Utils.chromeDriver.findElement(By.xpath("//div[contains(text(),'NCR')]"));
        optionElement.click();

        // Hacer clic en el elemento que despliega las opciones
        WebElement dropdownElement2 = Utils.chromeDriver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
        dropdownElement2.click();

        // Hacer clic en la opción específica ("Delhi")
        WebElement optionElement2 = Utils.chromeDriver.findElement(By.xpath("//div[contains(text(),'Delhi')]"));
        optionElement2.click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").getText()
                .contains("jesus@example.com")) {
            System.out
                    .println("Aparece el texto 'jesus@example.com' en el elemento //input[contains(@id,'userEmail')]");
        }
        if (Utils.chromeDriver.findElementByXPath("//textarea[contains(@id,'currentAddress')]").getText()
                .contains("Calle X Piso D")) {
            System.out.println(
                    "Aparece el texto 'Calle X Piso D' en el elemento //textarea[contains(@id,'currentAddress')]");
        }

        // Paso 3
        // Accion - Click en "Submit"
        Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
        Thread.sleep(2000);
        // Condicion
    }

    /* HECHO */
    @Test(description = "Forms_KO02 - Verificar el funcionamiento de Practice Form - Fallo al redactar 2", enabled = false)
    public void Forms_KO02() throws InterruptedException {

        Forms_01();
        // Paso 1
        // Acción - Click en "Practice Forms"
        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Practice Form')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[contains(normalize-space(),'Practice Form')]").size() > 0) {
            System.out.println("Aparece el elemento ");
        }
        if (Utils.chromeDriver.findElementsByXPath("//h5[contains(normalize-space(),'Student Registration Form')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //h5[contains(normalize-space(),'Student Registration Form')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'firstName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'firstName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'lastName')]").size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'lastName')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userEmail-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userEmail-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[normalize-space()='Gender']").size() > 0) {
            System.out.println("Aparece el elemento //div[normalize-space()='Gender']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'userNumber-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'userNumber-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'dateOfBirth-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'dateOfBirth-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]")
                .size() > 0) {
            System.out
                    .println("Aparece el elemento //div[@id='subjectsWrapper']//label[contains(@id,'subjects-label')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[contains(@id,'hobbiesWrapper')]//div[@class='col-md-3 col-sm-12']");
        }

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        if (Utils.chromeDriver.findElementsByXPath("//label[contains(normalize-space(),'Select picture')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //label[contains(normalize-space(),'Select picture')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'currentAddress-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'currentAddress-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//label[contains(@id,'stateCity-label')]").size() > 0) {
            System.out.println("Aparece el elemento //label[contains(@id,'stateCity-label')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//button[contains(@id,'submit')]").size() > 0) {
            System.out.println("Aparece el elemento //button[contains(@id,'submit')]");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        }

        // Paso 2
        // Acción - Escribir los campos opcionales y un solo campo obligatorio
        Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").sendKeys("jesus@example.com");
        Utils.chromeDriver.findElementByXPath("//label[contains(normalize-space(),'Sports')]").click();
        Utils.chromeDriver.findElementByXPath("//textarea[contains(@id,'currentAddress')]").sendKeys("Calle X Piso D");
        Utils.chromeDriver.findElementByXPath("//input[@id='firstName']").sendKeys("Jesus Manuel");
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'userEmail')]").getText()
                .contains("jesus@example.com")) {
            System.out
                    .println("Aparece el texto 'jesus@example.com' en el elemento //input[contains(@id,'userEmail')]");
        }
        if (Utils.chromeDriver.findElementByXPath("//textarea[contains(@id,'currentAddress')]").getText()
                .contains("Calle X Piso D")) {
            System.out.println(
                    "Aparece el texto 'Calle X Piso D' en el elemento //textarea[contains(@id,'currentAddress')]");
        }
        if (Utils.chromeDriver.findElementByXPath("//input[@id='firstName']").getText()
                .contains("Jesus Manuel")) {
            System.out
                    .println("Aparece el texto 'Jesus Manuel' en el elemento //input[@id='firstName']");
        }

        // Paso 3
        // Accion - Click en "Submit"
        Utils.chromeDriver.findElementByXPath("//button[contains(@id,'submit')]").click();
        Thread.sleep(2000);
        // Condicion
    }
}
