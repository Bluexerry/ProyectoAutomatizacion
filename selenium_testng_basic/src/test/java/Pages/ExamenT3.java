package Pages;

import Utilities.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
    @Test(description = "ExamenT3 - Test 1 - Compra de productos para perro", enabled = true)
    public void ExamenT3_TC01() throws InterruptedException {

        /* Paso 1 */
        /* Accion */
        Utils.chromeDriver.get("https://piensoparaperro.es/");
        /* Condicion */
        if (Utils.chromeDriver.findElementsByXPath("//img[@alt='PiensoParaPerro.es']").size() > 0) {
            System.out.println("Aparece el elemento //img[@alt='PiensoParaPerro.es']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//input[@placeholder='Entra tu búsqueda']").size() > 0) {
            System.out.println("Aparece el elemento //input[@placeholder='Entra tu búsqueda']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//h3[@class='cat-title']").size() > 0) {
            System.out.println("Aparece el elemento //h3[@class='cat-title']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@id='_desktop_cart']").size() > 0) {
            System.out.println("Aparece el elemento //div[@id='_desktop_cart']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='user-info-layout-3 col-lg-2 col-md-2 col-xs-2']")
                .size() > 0) {
            System.out.println("Aparece el elemento //div[@class='user-info-layout-3 col-lg-2 col-md-2 col-xs-2']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@id='header_menu']").size() > 0) {
            System.out.println("Aparece el elemento //div[@id='header_menu']");
        }

        /* Paso 2 */
        /* Accion */
        Utils.chromeDriver.findElementByXPath("//input[@placeholder='Entra tu búsqueda']").click();
        Utils.chromeDriver.findElementByXPath("//input[@placeholder='Entra tu búsqueda']").clear();
        Utils.chromeDriver.findElementByXPath("//input[@placeholder='Entra tu búsqueda']").sendKeys("arion friends");
        Utils.chromeDriver.findElementByXPath("//button[@name='spr_submit_search']").click();
        Thread.sleep(2000);
        /* Condiciones */
        if (Utils.chromeDriver.findElementsByXPath("//h2[normalize-space()='Resultados de la búsqueda']").size() > 0) {
            System.out.println("Aparece el elemento //h2[normalize-space()='Resultados de la búsqueda']");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//a[contains(text(),'Arion Friends Winner 28Kg (Pack2x14Kg) - Pienso de')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //a[contains(text(),'Arion Friends Winner 28Kg (Pack2x14Kg) - Pienso de')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//a[contains(text(),'Arion Friends Bravo 28Kg (Pack2x14Kg) - Pienso con')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //a[contains(text(),'Arion Friends Bravo 28Kg (Pack2x14Kg) - Pienso con')]");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//div[@id='js-product-list-top']//div[@class='text-xs-center showing'][contains(text(),'Mostrar')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[@id='js-product-list-top']//div[@class='text-xs-center showing'][contains(text(),'Mostrar')]");
        }

        /* Paso 3 */
        /* Accion */
        Utils.chromeDriver
                .findElementByXPath("//a[normalize-space()='Arion Friends Vital Salmon 28Kg (Pack2x14Kg) -...']")
                .click();
        /* Condicion */
        if (Utils.chromeDriver.findElementsByXPath("//h3[normalize-space()='Categorías']").size() > 0) {
            System.out.println("Aparece el elemento //h3[normalize-space()='Categorías']");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//h1[contains(text(),'Arion Friends Vital Salmon 28Kg (Pack2x14Kg) - Pie')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //h1[contains(text(),'Arion Friends Vital Salmon 28Kg (Pack2x14Kg) - Pie')]");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//div[@class='col-lg-6 col-sm-12 col-xs-12 pb-right-column']//label[@class='label'][normalize-space()='Referencia:']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[@class='col-lg-6 col-sm-12 col-xs-12 pb-right-column']//label[@class='label'][normalize-space()='Referencia:']");
        }
        if (Utils.chromeDriver.findElementsByXPath(
                "//div[@class='col-lg-6 col-sm-12 col-xs-12 pb-right-column']//label[@class='label'][normalize-space()='Estado']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[@class='col-lg-6 col-sm-12 col-xs-12 pb-right-column']//label[@class='label'][normalize-space()='Estado']");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//div[@class='main-product clearfix']//div[@id='product-details']//p[1]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //div[@class='main-product clearfix']//div[@id='product-details']//p[1]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='Precio']").size() > 0) {
            System.out.println("Aparece el elemento //span[normalize-space()='Precio']");
        }

        /* Paso 4 */
        /* Accion */
        Utils.chromeDriver.findElementByXPath("//i[contains(@class,'material-icons touchspin-up')]").click();
        Thread.sleep(2000);
        /* Condicion */
        if (Utils.chromeDriver.findElementByXPath("//input[@id='quantity_wanted']").getText().contains("2")) {
            System.out.println("El campo //input[@id='quantity_wanted'] aumenta");
        }

        /* Paso 5 */
        /* Accion */
        Utils.chromeDriver.findElementByXPath("//button[normalize-space()='Comprar']").click();
        Thread.sleep(15000);
        /* Condicion */
        if (Utils.chromeDriver.findElementsByXPath("//img[@class='product-image']").size() > 0) {
            System.out.println("Aparece el elemento //img[@class='product-image']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//strong[normalize-space()='Cantidad:']").size() > 0) {
            System.out.println("Aparece el elemento //strong[normalize-space()='Cantidad:']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//strong[normalize-space()='Total de productos:']").size() > 0) {
            System.out.println("Aparece el elemento //strong[normalize-space()='Total de productos:']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//strong[normalize-space()='Envío total:']").size() > 0) {
            System.out.println("Aparece el elemento //strong[normalize-space()='Envío total:']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//strong[normalize-space()='Impuestos incluidos']").size() > 0) {
            System.out.println("Aparece el elemento //strong[normalize-space()='Impuestos incluidos']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//strong[normalize-space()='Total:']").size() > 0) {
            System.out.println("Aparece el elemento //strong[normalize-space()='Total:']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//h2[normalize-space()='También te puede interesar...']")
                .size() > 0) {
            System.out.println("Aparece el elemento //h2[normalize-space()='También te puede interesar...']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//p[contains(text(),'59,95 €')]").size() > 0) {
            System.out.println("Aparece el elemento //p[contains(text(),'59,95 €')]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//button[normalize-space()='Continuar comprando']").size() > 0) {
            System.out.println("Aparece el elemento //button[normalize-space()='Continuar comprando']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='cart-content']//a[@class='btn btn-primary']")
                .size() > 0) {
            System.out.println("Aparece el elemento //div[@class='cart-content']//a[@class='btn btn-primary']");
        }

        /* Paso 6 */
        /* Accion */
        Utils.chromeDriver.findElementByXPath("//div[@class='cart-content']//a[@class='btn btn-primary']").click();
        Thread.sleep(2000);
        /* Condicion */
        if (Utils.chromeDriver.findElementsByXPath("//span[normalize-space()='Gratis']").size() > 0) {
            System.out.println("Aparece el elemento //span[normalize-space()='Gratis']");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//a[contains(text(),'Arion Friends Vital Salmon 28Kg (Pack2x14Kg) - Pie')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //a[contains(text(),'Arion Friends Vital Salmon 28Kg (Pack2x14Kg) - Pie')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath(
                        "//img[@alt='Arion Friends Vital Salmon 28Kg (Pack2x14Kg) - Pienso mantenimiento salmón']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //img[@alt='Arion Friends Vital Salmon 28Kg (Pack2x14Kg) - Pienso mantenimiento salmón']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@data-paypal-bnpl-source-page='cart']").size() > 0) {
            System.out.println("Aparece el elemento //div[@data-paypal-bnpl-source-page='cart']");
        }

        /* Paso 7 */
        /* Accion */
        Utils.chromeDriver.findElementByXPath("//a[normalize-space()='Tramitar Pedido']").click();
        Thread.sleep(3000);
        /* Condicion */
        if (Utils.chromeDriver
                .findElementsByXPath("//section[@id='checkout-personal-information-step']//h1[@class='step-title h3']")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //section[@id='checkout-personal-information-step']//h1[@class='step-title h3']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='card-block cart-summary-totals']").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='card-block cart-summary-totals']");
        }
        if (Utils.chromeDriver.findElementsByXPath("//div[@class='content']").size() > 0) {
            System.out.println("Aparece el elemento //div[@class='content']");
        }

        /* Paso 8 */
        /* Acciones 1 de paso 8 */
        Utils.chromeDriver.findElementByXPath("//label[normalize-space()='Sr.']").click();
        Utils.chromeDriver.findElementByXPath("//input[@name='firstname']").sendKeys("Test");
        Utils.chromeDriver.findElementByXPath("//input[@name='lastname']").sendKeys("Test");
        Utils.chromeDriver.findElementByXPath("//form[@id='customer-form']//input[@name='email']")
                .sendKeys("Test@test.test");

        /* Condiciones */
        if (Utils.chromeDriver.findElementByXPath("//input[@name='firstname']").getText().contains("Test")) {
            System.out.println("El elemento //input[@name='firstname'] contiene ese texto");
        }
        if (Utils.chromeDriver.findElementByXPath("//input[@name='lastname']").getText().contains("Test")) {
            System.out.println("El elemento //input[@name='lastname'] contiene ese texto");
        }
        if (Utils.chromeDriver.findElementByXPath("//form[@id='customer-form']//input[@name='email']").getText()
                .contains("Test@test.test")) {
            System.out.println("El elemento //form[@id='customer-form']//input[@name='email'] contiene ese texto");
        }

        /* Accion final de paso 8 */

        // Realiza un scroll vertical de 500 píxeles
        JavascriptExecutor js = (JavascriptExecutor) Utils.chromeDriver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(1000);
        Utils.chromeDriver.findElementByXPath("//input[@name='psgdpr']").click();
        Thread.sleep(1000);
        Utils.chromeDriver.findElementByXPath("//button[@data-link-action='register-new-customer']").click();
        Thread.sleep(4000);

        /* Paso 9 */
        /* Acciones 1 de paso 9 */
        Utils.chromeDriver.findElementByXPath("//input[@name='company']").sendKeys("ADAITS");
        Utils.chromeDriver.findElementByXPath("//input[@name='vat_number']").sendKeys("12345678A");
        Utils.chromeDriver.findElementByXPath("//input[@name='address1']").sendKeys("Av. Turia 11");
        Utils.chromeDriver.findElementByXPath("//input[@name='postcode']").sendKeys("41019");
        Utils.chromeDriver.findElementByXPath("//input[@name='city']").sendKeys("Sevilla");

        // Encontrar el elemento &lt;select&gt; por su XPath y hacer clic en él
        WebElement selectElement1 = Utils.chromeDriver.findElement(By.xpath("//select[@name='id_state']"));

        // Crear una instancia de la clase Select
        Select select1 = new Select(selectElement1);

        // Seleccionar la opción por el texto visible (en este caso "Sevilla")
        select1.selectByVisibleText("Sevilla");
        Thread.sleep(1000);

        // Realiza un scroll vertical de 500 píxeles
        js.executeScript("window.scrollBy(0,500)");

        // Encontrar el elemento &lt;select&gt; por su XPath y hacer clic en él
        WebElement selectElement2 = Utils.chromeDriver.findElement(By.xpath("//select[@name='id_country']"));

        // Crear una instancia de la clase Select
        Select select2 = new Select(selectElement2);

        // Seleccionar la opción por el texto visible (en este caso "Sevilla")
        select2.selectByVisibleText("España");
        Thread.sleep(3000);
        Utils.chromeDriver.findElementByXPath("//input[@name='phone']").sendKeys("111111111");
        Utils.chromeDriver.findElementByXPath("//button[@name='confirm-addresses']").click();
        Thread.sleep(2000);
        Utils.chromeDriver.findElementByXPath("//button[@name='confirmDeliveryOption']").click();
        Thread.sleep(2000);

        // Realiza un scroll vertical de 500 píxeles
        js.executeScript("window.scrollBy(0,500)");

        /* Condiciones */
        if (Utils.chromeDriver
                .findElementsByXPath("//h4[contains(text(),'Por favor, revisa tu pedido antes de realizar el p')]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //h4[contains(text(),'Por favor, revisa tu pedido antes de realizar el p')]");
        }
        if (Utils.chromeDriver
                .findElementsByXPath("//section[@id='order-summary-content']//div[3]//div[1]//div[1]//div[1]")
                .size() > 0) {
            System.out.println(
                    "Aparece el elemento //section[@id='order-summary-content']//div[3]//div[1]//div[1]//div[1]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//section[@id='order-summary-content']//div[2]//div[1]//div[1]")
                .size() > 0) {
            System.out.println("Aparece el elemento //section[@id='order-summary-content']//div[2]//div[1]//div[1]");
        }
        if (Utils.chromeDriver.findElementsByXPath("//section[@id='checkout-payment-step']//h1[@class='step-title h3']")
                .size() > 0) {
            System.out
                    .println("Aparece el elemento //section[@id='checkout-payment-step']//h1[@class='step-title h3']");
        }
        Thread.sleep(3000);
    }
}