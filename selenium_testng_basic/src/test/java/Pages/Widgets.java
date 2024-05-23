package Pages;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Widgets {

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
    @Test(description = "Widgets_TC01 - Acceder a la pantalla de Widgets", enabled = false)
    public void Widgets_TC01() throws InterruptedException {
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
        Utils.chromeDriver.findElementByXPath("//h5[contains(text(),'Widgets')]/parent::div").click();
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
    @Test(description = "Widgets_TC02 - Verificar el funcionamiento de Accordian", enabled = false)
    public void Widgets_TC02() throws InterruptedException {

        Widgets_TC01();
        // Paso 1 - Click en "Accordian"
        // Acción
        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Accordian')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Accordian']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Accordian']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@id='section1Heading']").size() > 0) {
            System.out.println("Aparece el elemento //div[@id='section1Heading']");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@id='section2Heading']").size() > 0) {
            System.out.println("Aparece el elemento //div[@id='section2Heading']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@id='section3Heading']").size() > 0) {
            System.out.println("Aparece el elemento //div[@id='section3Heading']");
        }
        if (Utils.chromeDriver
                .findElementsByXPath(
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

        // Paso 2 - Click en "Where does it comes from?"
        // Acción

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        Utils.chromeDriver.findElementByXPath("//div[contains(@id,'section2Heading')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver
                .findElementsByXPath("//p[contains(text(),'Contrary to popular belief, Lorem Ipsum is not sim')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //p[contains(text(),'Contrary to popular belief, Lorem Ipsum is not sim')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//p[contains(text(),'The standard chunk of Lorem Ipsum used since the 1')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //p[contains(text(),'The standard chunk of Lorem Ipsum used since the 1')]");
        }
    }

    /* HECHO */
    @Test(description = "Widgets_TC03 - Verificar el funcionamiento de Auto Complete", enabled = false)
    public void Widgets_TC03() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Auto Complete"
        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Auto Complete')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath(
                "//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='auto-complete__value-container css-1hwfws3']")
                .size() > 0) {
            System.out.println("Aparece el elemento //div[@class='auto-complete__value-container css-1hwfws3']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Auto Complete']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Auto Complete']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='col-12 mt-4 col-md-6']//div[3]").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='col-12 mt-4 col-md-6']//div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-1')]");
        }

        // Paso 2
        // Accion - Escribir en el inicio de los campos de colos multiple y simple

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        // Encuentra el campo de entrada
        WebElement colorMultiple = Utils.chromeDriver
                .findElement(By.xpath("//input[contains(@id,'autoCompleteMultipleInput')]"));

        // Rellena el campo de entrada
        colorMultiple.sendKeys("Red");

        // Pulsar "Enter" después de rellenar el campo de entrada
        colorMultiple.sendKeys(Keys.ENTER);

        // Rellena el campo de entrada
        colorMultiple.sendKeys("Blue");

        // Pulsar "Enter" después de rellenar el campo de entrada
        colorMultiple.sendKeys(Keys.ENTER);

        // Encuentra el campo de entrada
        WebElement colorSimple = Utils.chromeDriver
                .findElement(By.xpath("//input[contains(@id,'autoCompleteSingleInput')]"));

        // Rellena el campo de entrada
        colorSimple.sendKeys("Green");

        // Pulsar "Enter" después de rellenar el campo de entrada
        colorSimple.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        // Condicion
        if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'autoCompleteMultipleInput')]").getText()
                .contains("Red")) {
            System.out.println(
                    "Aparece el texto 'Red' en el elemento //input[contains(@id,'autoCompleteMultipleInput')]");
        }
        if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'autoCompleteMultipleInput')]").getText()
                .contains("Blue")) {
            System.out.println(
                    "Aparece el texto 'Blue' en el elemento //input[contains(@id,'autoCompleteMultipleInput')]");
        }
        if (Utils.chromeDriver.findElementByXPath("//input[contains(@id,'autoCompleteSingleInput')]").getText()
                .contains("Green")) {
            System.out.println(
                    "Aparece el texto 'Green' en el elemento //input[contains(@id,'autoCompleteSingleInput')]");
        }
    }

    /* HECHO */
    @Test(description = "Widgets_TC04 - Verificar el funcionamiento de Date Picker", enabled = false)
    public void Widgets_TC04() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Date Picker"
        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Date Picker')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Date Picker']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Date Picker']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[@id='datePickerMonthYearInput']").size() > 0) {
            System.out.println("Aparece el elemento //input[@id='datePickerMonthYearInput']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[@id='dateAndTimePickerInput']").size() > 0) {
            System.out.println("Aparece el elemento //input[@id='dateAndTimePickerInput']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='col-12 mt-4 col-md-6']//div[3]").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='col-12 mt-4 col-md-6']//div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-2')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-2')]");
        }

        // Paso 2
        // Accion - Click en los campos "Select Date" y "Data Time"

        // Accion 1

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        Utils.chromeDriver.findElementByXPath("//input[@id='datePickerMonthYearInput']").click();
        Thread.sleep(2000);
        // Condicion
        if (Utils.chromeDriver.findElementsByXPath(
                "//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//select[@class='react-datepicker__month-select']").size() > 0) {
            System.out.println("Aparece el elemento //select[@class='react-datepicker__month-select']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@aria-label='Choose Tuesday, April 30th, 2024']")
                .size() > 0) {
            System.out.println("Aparece el elemento //div[@aria-label='Choose Tuesday, April 30th, 2024']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//select[@class='react-datepicker__year-select']").size() > 0) {
            System.out.println("Aparece el elemento //select[@class='react-datepicker__year-select']");
        }

        // Accion 2
        Utils.chromeDriver.findElementByXPath("//h1[normalize-space()='Date Picker']").click();
        Utils.chromeDriver.findElementByXPath("//input[@id='dateAndTimePickerInput']").click();
        Thread.sleep(2000);
        // Condicion
        if (Utils.chromeDriver.findElementsByXPath(
                "//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='react-datepicker__month-read-view']").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='react-datepicker__month-read-view']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='react-datepicker__year-read-view']").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='react-datepicker__year-read-view']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@aria-label='Choose Thursday, May 2nd, 2024']").size() > 0) {
            System.out.println("Aparece el elemento //div[@aria-label='Choose Thursday, May 2nd, 2024']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='react-datepicker-time__header']").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='react-datepicker-time__header']");
        }
    }

    /* HECHO */
    @Test(description = "Widgets_TC05 - Verificar el funcionamiento del Slider", enabled = false)
    public void Widgets_TC05() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Slider"
        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Slider')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Slider']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Slider']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[@type='range']").size() > 0) {
            System.out.println("Aparece el elemento //input[@type='range']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[@id='sliderValue']").size() > 0) {
            System.out.println("Aparece el elemento //input[@id='sliderValue']");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[2]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[2]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-3')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-3')]");
        }

        // Paso 2
        // Accion - Verificar la funcion del "Slider" clickando y manteniendo

        // Encuentra el elemento del slider
        WebElement slider = Utils.chromeDriver.findElement(By.xpath("//input[@type='range']"));

        // Calcula el ancho del slider
        int sliderWidth = slider.getSize().getWidth();

        // Crea un objeto Actions para interactuar con el slider
        Actions action = new Actions(Utils.chromeDriver);

        // Mueve el slider al máximo de la izquierda (valor 0)
        action.dragAndDropBy(slider, -sliderWidth, 0).perform();

        // Espera un momento para asegurar que el slider se haya movido completamente a
        // la izquierda
        try {
            Thread.sleep(1000); // Espera 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Mueve el slider al máximo de la derecha (valor 100)
        action.dragAndDropBy(slider, sliderWidth, 0).perform();

        Thread.sleep(2000);
        // Condicion
        if (Utils.chromeDriver.findElementsByXPath("//input[contains(@id,'sliderValue') and contains(@value,'100')]")
                .size() > 0) {
            System.out.println("Aparece el elemento //input[contains(@id,'sliderValue') and contains(@value,'100')]");
        }
    }

    /* HECHO */
    @Test(description = "Widgets_TC06 - Verificar el funcionamiento de Proggress Bar", enabled = false)
    public void Widgets_TC06() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Progress Bar"

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        Utils.chromeDriver.findElementByXPath("//span[normalize-space()='Progress Bar']").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='mb-3']").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='mb-3']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Progress Bar']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Progress Bar']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@id='progressBar']").size() > 0) {
            System.out.println("Aparece el elemento //div[@id='progressBar']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//button[@id='startStopButton']").size() > 0) {
            System.out.println("Aparece el elemento //button[@id='startStopButton']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='col-12 mt-4 col-md-6']//div[3]").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='col-12 mt-4 col-md-6']//div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-4')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-4')]");
        }

        // Paso 2
        // Accion - Click en el boton "Start"
        Utils.chromeDriver.findElementByXPath("//button[contains(@id,'startStopButton')]").click();
        Thread.sleep(11000);
        // Condicion
        if (Utils.chromeDriver
                .findElementsByXPath("//div[contains(@role,'progressbar') and contains(@style,'width: 100')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[contains(@role,'progressbar') and contains(@style,'width: 100')]");
        }

        // Paso 3
        // Accion - Click en el boton "Stop"
        Utils.chromeDriver.findElementByXPath("//button[@id='resetButton']").click();
        Utils.chromeDriver.findElementByXPath("//button[contains(@id,'startStopButton')]").click();
        Thread.sleep(5000);
        Utils.chromeDriver.findElementByXPath("//button[contains(@id,'startStopButton')]").click();
        Thread.sleep(2000);
        // Condicion
        if (Utils.chromeDriver
                .findElementsByXPath("//div[contains(@role,'progressbar') and contains(@style,'width: 50')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[contains(@role,'progressbar') and contains(@style,'width: 50')]");
        }
    }

    /* HECHO */
    @Test(description = "Widgets_TC07 - Verificar el funcionamiento de Tabs", enabled = false)
    public void Widgets_TC07() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Tabs"

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Tabs')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='mb-3']").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='mb-3']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//nav[@role='tablist']").size() > 0) {
            System.out.println("Aparece el elemento //nav[@role='tablist']");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//a[contains(@id,'demo-tab-use') and contains(@aria-selected,'false')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //a[contains(@id,'demo-tab-use') and contains(@aria-selected,'false')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//a[contains(@id,'demo-tab-origin') and contains(@aria-selected,'false')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //a[contains(@id,'demo-tab-origin') and contains(@aria-selected,'false')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Tabs']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Tabs']");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//a[contains(@id,'demo-tab-what') and contains(@aria-selected,'true')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //a[contains(@id,'demo-tab-what') and contains(@aria-selected,'true')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-5')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-5')]");
        }

        // Paso 2
        // Accion - Click en "Origin"
        Utils.chromeDriver.findElementByXPath("//a[contains(@id,'demo-tab-origin')]").click();
        Thread.sleep(2000);
        // Condicion
        if (Utils.chromeDriver
                .findElementsByXPath("//a[contains(@id,'demo-tab-what') and contains(@aria-selected,'false')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //a[contains(@id,'demo-tab-what') and contains(@aria-selected,'false')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//a[contains(@id,'demo-tab-use') and contains(@aria-selected,'false')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //a[contains(@id,'demo-tab-use') and contains(@aria-selected,'false')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//a[contains(@id,'demo-tab-origin') and contains(@aria-selected,'true')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //a[contains(@id,'demo-tab-origin') and contains(@aria-selected,'true')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//p[contains(text(),'Contrary to popular belief, Lorem Ipsum is not sim')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //p[contains(text(),'Contrary to popular belief, Lorem Ipsum is not sim')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//p[contains(text(),'The standard chunk of Lorem Ipsum used since the 1')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //p[contains(text(),'The standard chunk of Lorem Ipsum used since the 1')]");
        }
    }

    /* HECHO */
    @Test(description = "Widgets_TC08- Verificar el funcionamiento de Tool Tips", enabled = false)
    public void Widgets_TC08() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Tool Tips"

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Tool Tips')]").click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Tool Tips']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Tool Tips']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//p[normalize-space()='Practice Tool Tips']").size() > 0) {
            System.out.println("Aparece el elemento //p[normalize-space()='Practice Tool Tips']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//button[@id='toolTipButton']").size() > 0) {
            System.out.println("Aparece el elemento //button[@id='toolTipButton']");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[@id='toolTipTextField']").size() > 0) {
            System.out.println("Aparece el elemento //input[@id='toolTipTextField']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@id='texToolTopContainer']").size() > 0) {
            System.out.println("Aparece el elemento //div[@id='texToolTopContainer']");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-6')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-6')]");
        }

        // Paso 2
        /*
         * Accion - Mantener el cursos encima de los "hover" del boton verde, el campo
         * vacio, la palabra "Contrary" y el codigo numerico
         * 
         */
        // Accion 1
        // Encuentra el elemento que revela el mensaje al pasar el ratón sobre él
        WebElement botonConHover = Utils.chromeDriver.findElement(By.xpath("//button[@id='toolTipButton']"));

        // Crea un objeto Actions
        Actions actions = new Actions(Utils.chromeDriver);

        // Mueve el cursor del mouse sobre el elemento
        actions.moveToElement(botonConHover).perform();

        // Condicion 1
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(@role,'tooltip')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(@role,'tooltip')]");
        }
        Thread.sleep(2000);
        // Accion 2
        // Encuentra el elemento que revela el mensaje al pasar el ratón sobre él
        WebElement campoConHover = Utils.chromeDriver.findElement(By.xpath("//input[@id='toolTipTextField']"));

        // Mueve el cursor del mouse sobre el elemento
        actions.moveToElement(campoConHover).perform();

        // Condicion 2
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(@role,'tooltip')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(@role,'tooltip')]");
        }
        Thread.sleep(2000);

        // Realiza un scroll vertical de 500 píxeles
        js.executeScript("window.scrollBy(0,500)");

        // Accion 3
        // Encuentra el elemento que revela el mensaje al pasar el ratón sobre él
        WebElement palabraConHover = Utils.chromeDriver.findElement(By.xpath("//a[normalize-space()='Contrary']"));

        // Mueve el cursor del mouse sobre el elemento
        actions.moveToElement(palabraConHover).perform();

        // Condicion 3
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(@role,'tooltip')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(@role,'tooltip')]");
        }
        Thread.sleep(2000);

        // Accion 4
        // Encuentra el elemento que revela el mensaje al pasar el ratón sobre él
        WebElement numerosConHover = Utils.chromeDriver.findElement(By.xpath("//a[normalize-space()='1.10.32']"));

        // Mueve el cursor del mouse sobre el elemento
        actions.moveToElement(numerosConHover).perform();

        // Condicion 4
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(@role,'tooltip')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(@role,'tooltip')]");
        }
        Thread.sleep(2000);
    }

    /* HECHO */
    @Test(description = "Widgets_TC09 - Verificar el funcionamiento de Menu - Menu 1", enabled = false)
    public void Widgets_TC09() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Menu"

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        Utils.chromeDriver.findElementByXPath("//div[contains(@class,'element-list collapse show')]//li[@id='item-7']")
                .click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Menu']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Menu']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//a[normalize-space()='Main Item 1']").size() > 0) {
            System.out.println("Aparece el elemento //a[normalize-space()='Main Item 1']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//a[normalize-space()='Main Item 2']").size() > 0) {
            System.out.println("Aparece el elemento //a[normalize-space()='Main Item 2']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//a[normalize-space()='Main Item 3']").size() > 0) {
            System.out.println("Aparece el elemento //a[normalize-space()='Main Item 3']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='col-12 mt-4 col-md-6']//div[3]").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='col-12 mt-4 col-md-6']//div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-7')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-7')]");
        }

        // Paso 2
        // Accion - Mantener el cursor encima de "Main item 1"

        // Encuentra el elemento que revela el mensaje al pasar el ratón sobre él
        WebElement mainItem1 = Utils.chromeDriver.findElement(By.xpath("//a[normalize-space()='Main Item 1']"));

        // Crea un objeto Actions
        Actions actions = new Actions(Utils.chromeDriver);

        // Mueve el cursor del mouse sobre el elemento
        actions.moveToElement(mainItem1).perform();

        Thread.sleep(2000);
    }

    /* HECHO */
    @Test(description = "Widgets_TC10 - Verificar el funcionamiento de Menu - Menu 2", enabled = false)
    public void Widgets_TC10() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Menu"

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        Utils.chromeDriver.findElementByXPath("//div[contains(@class,'element-list collapse show')]//li[@id='item-7']")
                .click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Menu']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Menu']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//a[normalize-space()='Main Item 1']").size() > 0) {
            System.out.println("Aparece el elemento //a[normalize-space()='Main Item 1']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//a[normalize-space()='Main Item 2']").size() > 0) {
            System.out.println("Aparece el elemento //a[normalize-space()='Main Item 2']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//a[normalize-space()='Main Item 3']").size() > 0) {
            System.out.println("Aparece el elemento //a[normalize-space()='Main Item 3']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='col-12 mt-4 col-md-6']//div[3]").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='col-12 mt-4 col-md-6']//div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-7')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-7')]");
        }

        // Paso 2
        // Accion - Mantener el cursor encima de "Main item 1"

        // Encuentra el elemento que revela el mensaje al pasar el ratón sobre él
        WebElement mainItem1 = Utils.chromeDriver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));

        // Crea un objeto Actions
        Actions actions = new Actions(Utils.chromeDriver);

        // Mueve el cursor del mouse sobre el elemento
        actions.moveToElement(mainItem1).perform();

        Thread.sleep(2000);

        // Condicion
        if (Utils.chromeDriver.findElementsByXPath("(//li[a[text()='Sub Item']])[1]").size() > 0) {
            System.out.println("Aparece el elemento (//li[a[text()='Sub Item']])[1]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//li[a[text()='Sub Item']][2]").size() > 0) {
            System.out.println("Aparece el elemento //li[a[text()='Sub Item']][2]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//li[a[contains(text(),'SUB SUB LIST')]]").size() > 0) {
            System.out.println("Aparece el elemento //li[a[contains(text(),'SUB SUB LIST')]]");
        }
    }

    /* HECHO */
    @Test(description = "Widgets_TC11 - Verificar el funcionamiento de Menu - Menu 3", enabled = false)
    public void Widgets_TC11() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Menu"

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        Utils.chromeDriver.findElementByXPath("//div[contains(@class,'element-list collapse show')]//li[@id='item-7']")
                .click();
        Thread.sleep(2000);
        // Condición
        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Menu']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Menu']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//a[normalize-space()='Main Item 1']").size() > 0) {
            System.out.println("Aparece el elemento //a[normalize-space()='Main Item 1']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//a[normalize-space()='Main Item 2']").size() > 0) {
            System.out.println("Aparece el elemento //a[normalize-space()='Main Item 2']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//a[normalize-space()='Main Item 3']").size() > 0) {
            System.out.println("Aparece el elemento //a[normalize-space()='Main Item 3']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='col-12 mt-4 col-md-6']//div[3]").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='col-12 mt-4 col-md-6']//div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-7')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-7')]");
        }

        // Paso 2
        // Accion - Mantener el cursor encima de "Main item 1"

        // Encuentra el elemento que revela el mensaje al pasar el ratón sobre él
        WebElement mainItem1 = Utils.chromeDriver.findElement(By.xpath("//a[normalize-space()='Main Item 3']"));

        // Crea un objeto Actions
        Actions actions = new Actions(Utils.chromeDriver);

        // Mueve el cursor del mouse sobre el elemento
        actions.moveToElement(mainItem1).perform();

        Thread.sleep(2000);
    }

    /* HECHO */
    @Test(description = "Widgets_TC12 - Verificar el funcionamiento de Select Menu - Select Menu 1", enabled = false)
    public void Widgets_TC12() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Select Menu"

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Select Menu')]").click();
        Thread.sleep(2000);
        // Condición

        // Realiza un scroll vertical de 500 píxeles
        js.executeScript("window.scrollBy(0,500)");

        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Select Menu']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Select Menu']]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[contains(@class,' css-1uccc91-singleValue') and contains(@xpath,'1')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[contains(@class,' css-1uccc91-singleValue') and contains(@xpath,'1')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Select Title')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Select Title')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//select[@id='oldSelectMenu']").size() > 0) {
            System.out.println("Aparece el elemento //select[@id='oldSelectMenu']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Select...')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Select...')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//select[@id='cars']").size() > 0) {
            System.out.println("Aparece el elemento //select[@id='cars']");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-8')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-8')]");
        }

        // Paso 2
        // Accion - Click en "Select Value"
        Utils.chromeDriver.findElementByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[@id='selectMenuContainer']/div[2]/div[1]")
                .click();
        Thread.sleep(1000);

        // Encuentra y selecciona la opción deseada del menú desplegable
        WebElement dropdownOption = Utils.chromeDriver
                .findElement(By.xpath("//div[contains(text(),'Group 1, option 2')]"));
        dropdownOption.click();

        Thread.sleep(2000);
        // Condicion
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Group 1, option 1')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Group 1, option 1')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Group 1, option 2')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Group 1, option 2')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Group 2, option 1')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Group 2, option 1')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Group 2, option 2')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Group 2, option 2')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'A root option')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'A root option')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Another root option')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Another root option')]");
        }
    }

    /* HECHO */
    @Test(description = "Widgets_TC13 - Verificar el funcionamiento de Select Menu - Select Menu 2", enabled = false)
    public void Widgets_TC13() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Select Menu"

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Select Menu')]").click();
        Thread.sleep(2000);
        // Condición

        // Realiza un scroll vertical de 500 píxeles
        js.executeScript("window.scrollBy(0,500)");

        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Select Menu']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Select Menu']]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[contains(@class,' css-1uccc91-singleValue') and contains(@xpath,'1')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[contains(@class,' css-1uccc91-singleValue') and contains(@xpath,'1')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Select Title')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Select Title')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//select[@id='oldSelectMenu']").size() > 0) {
            System.out.println("Aparece el elemento //select[@id='oldSelectMenu']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Select...')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Select...')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//select[@id='cars']").size() > 0) {
            System.out.println("Aparece el elemento //select[@id='cars']");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-8')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-8')]");
        }

        // Paso 2
        // Accion - Click en "Select One"
        Utils.chromeDriver.findElementByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[@id='selectMenuContainer']/div[4]/div[1]")
                .click();
        Thread.sleep(1000);

        // Encuentra y selecciona la opción deseada del menú desplegable
        WebElement dropdownOption = Utils.chromeDriver
                .findElement(By.xpath("//div[contains(text(),'Dr.')]"));
        dropdownOption.click();

        Thread.sleep(2000);
        // Condicion
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Dr.')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Dr.')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Mr.')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Mr.')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Mrs.')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Mrs.')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Ms.')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Ms.')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Prof.')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Prof.')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Other')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Other')]");
        }
    }

    /* HECHO */
    @Test(description = "Widgets_TC14 - Verificar el funcionamiento de Select Menu - Select Menu 3", enabled = false)
    public void Widgets_TC14() throws InterruptedException {

        Widgets_TC01();
        // Paso 1
        // Acción - Click en "Select Menu"

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");

        Utils.chromeDriver.findElementByXPath("//span[contains(normalize-space(),'Select Menu')]").click();
        Thread.sleep(2000);
        // Condición

        // Realiza un scroll vertical de 500 píxeles
        js.executeScript("window.scrollBy(0,500)");

        if (Utils.chromeDriver.findElementsByXPath("//h1[normalize-space()='Select Menu']").size() > 0) {
            System.out.println("Aparece el elemento //h1[normalize-space()='Select Menu']]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[contains(@class,' css-1uccc91-singleValue') and contains(@xpath,'1')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[contains(@class,' css-1uccc91-singleValue') and contains(@xpath,'1')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Select Title')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Select Title')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//select[@id='oldSelectMenu']").size() > 0) {
            System.out.println("Aparece el elemento //select[@id='oldSelectMenu']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[contains(text(),'Select...')]").size() > 0) {
            System.out.println("Aparece el elemento //div[contains(text(),'Select...')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//select[@id='cars']").size() > 0) {
            System.out.println("Aparece el elemento //select[@id='cars']");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[3]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//li[contains(@class,'btn btn-light active') and contains(@id,'item-8')]")
                .size() > 0) {
            System.out
                    .println(
                            "Aparece el elemento //li[contains(@class,'btn btn-light active') and contains(@id,'item-8')]");
        }

        // Paso 2
        // Accion - Click en "Old Style Select Menu"
        Utils.chromeDriver.findElementByXPath("//select[@id='oldSelectMenu']").click();
        Thread.sleep(1000);

        // Encuentra y selecciona la opción deseada del menú desplegable
        WebElement dropdownOption = Utils.chromeDriver
                .findElement(By.xpath("//option[contains(text(),'Blue')]"));
        dropdownOption.click();

        Thread.sleep(2000);
        // Condicion
        if (Utils.chromeDriver.findElementsByXPath("//option[contains(text(),'Red')]").size() > 0) {
            System.out.println("Aparece el elemento //option[contains(text(),'Red')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//option[contains(text(),'Blue')]").size() > 0) {
            System.out.println("Aparece el elemento //option[contains(text(),'Blue')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//option[contains(text(),'Green')]").size() > 0) {
            System.out.println("Aparece el elemento //option[contains(text(),'Green')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//option[contains(text(),'Yellow')]").size() > 0) {
            System.out.println("Aparece el elemento //option[contains(text(),'Yellow')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//option[contains(text(),'Purple')]").size() > 0) {
            System.out.println("Aparece el elemento //option[contains(text(),'Purple')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//option[contains(text(),'Black')]").size() > 0) {
            System.out.println("Aparece el elemento //option[contains(text(),'Black')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//option[contains(text(),'White')]").size() > 0) {
            System.out.println("Aparece el elemento //option[contains(text(),'White')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//option[contains(text(),'Voilet')]").size() > 0) {
            System.out.println("Aparece el elemento //option[contains(text(),'Voilet')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//option[contains(text(),'Indigo')]").size() > 0) {
            System.out.println("Aparece el elemento //option[contains(text(),'Indigo')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//option[contains(text(),'Magenta')]").size() > 0) {
            System.out.println("Aparece el elemento //option[contains(text(),'Magenta')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//option[contains(text(),'Aqua')]").size() > 0) {
            System.out.println("Aparece el elemento //option[contains(text(),'Aqua')]");
        }
    }
}