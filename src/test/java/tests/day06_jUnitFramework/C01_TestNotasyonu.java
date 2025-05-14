package tests.day06_jUnitFramework;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class C01_TestNotasyonu {


   @Test
   public void test01(){
       System.out.println("Test1 çqlıştı");
   }

  @Test @Disabled
    public void test02(){
        System.out.println("Test2 çqlıştı");
    }



  @Test
    public void test03(){
        System.out.println("Test3 çqlıştı");
    }









}
