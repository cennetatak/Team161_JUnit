package tests.day12_actionsClass_FakerClass;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utullities.ReusableMethods;
import utullities.TestBase_Each;

public class C06_FakerClass extends TestBase_Each {


    @Test
    public void test01(){

        Faker faker = new Faker();

        System.out.println(faker.name().firstName());

        System.out.println(faker.address().fullAddress());

        System.out.println(faker.internet().emailAddress());

        System.out.println(faker.internet().password());

        System.out.println(faker.gameOfThrones().house());



    }
}
