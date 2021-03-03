package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Products {
    WebDriver driver;

    public Products( WebDriver driver) {
        this.driver = driver;
    }


    private void Dresses(String dress) {
        driver.findElement (By.xpath ("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")).click ();

    }

    private void Viwe(String viwelist) {
        driver.findElement (By.xpath ("//i[@class='icon-th-list']")).click ();
    }


    private void Size(String sizel) {
        driver.findElement (By.xpath ("//input[@id='layered_id_attribute_group_3']")).click ();
    }

    private void price(String pricelowest) {
        WebElement pricelowestFiled = driver.findElement (By.id ("selectProductSort"));
        if (pricelowestFiled.getText ().equals (" ")) {
            pricelowestFiled.clear ();
            pricelowestFiled.sendKeys (pricelowest);
        }
    }

    private void CartOne(String one) {
        driver.findElement (By.xpath ("//li[@class='ajax_block_product " +
                "first-in-line first-item-of-tablet-line first-item-of-mobile-line col-xs-12']" +
                "//span[contains(text(),'Add to cart')]")).click ();
    }

    private void closeone(String cone) {
        driver.findElement (By.xpath ("//span[@title='Close window']")).click ();
    }

    private void CartTwo(String two) {
        driver.findElement (By.xpath ("//li[@class='ajax_block_product" +
                " last-item-of-tablet-line col-xs-12']//span[contains(text()," +
                "'Add to cart')]")).click ();
    }

    private void closetwo(String ctwo) {
        driver.findElement (By.xpath ("//span[@title='Close window']")).click ();
    }

    private void Cart(String cartl) {
        driver.findElement (By.xpath ("//a[@title='View my shopping cart']")).click ();
    }

    private void Proced(String next) {
        driver.findElement (By.xpath ("//a[@class='button btn btn-default standard-checkout " +
                "button-medium']//span[contains(text()")).click ();
    }

}
