package tests.day18_screenshot_jsexecutor;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utullities.ReusableMethods;
import utullities.TestBase_Each;

public class C02_TarihVeIsimliTumSayfaSS extends TestBase_Each {

    @Test
    public void test01(){

        // Testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");


        // screenshot alin
        ReusableMethods.tumSayfaResimCekTarihli(driver,"Anasayfa");

        // phone icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        // screenshot alin
        ReusableMethods.tumSayfaResimCekTarihli(driver,"Arama");
        // ilk urunu tiklayin
        driver.findElement(By.xpath("(//*[@class='prod-img'])[1]")).click();

        // screenshot alin
        ReusableMethods.tumSayfaResimCekTarihli(driver,"IlkUrun");

    }
}
