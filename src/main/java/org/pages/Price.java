package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Price {
        private WebDriver driver;
    public Price (WebDriver driver){
        this.driver =driver;
        PageFactory.initElements (driver, this);

    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    public WebElement dresses;

    @FindBy(xpath = "//i[@class='icon-th-list']")
    public WebElement viwelist;

    @FindBy(xpath = "//input[@id='layered_id_attribute_group_3']")
    public WebElement size;

    @FindBy(id = "selectProductSort")
    public WebElement pricelowest;

    @FindBy(xpath = "//li[@class='ajax_block_product " +
            "first-in-line first-item-of-tablet-line first-item-of-mobile-line col-xs-12']" +
            "//span[contains(text(),'Add to cart')]")
    public WebElement CartOne;

    @FindBy(xpath = "//span[@title='Close window']")
    public WebElement closeone;

    @FindBy(xpath = "//li[@class='ajax_block_product\" +\n" +
            "                \" last-item-of-tablet-line col-xs-12']//span[contains(text(),\" +\n" +
            "                \"'Add to cart')]")
    public WebElement CartTwo;

    @FindBy(xpath = "//span[@title='Close window']")
    public WebElement closetwo;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    public WebElement cartl;

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout \" +\n" +
            "                \"button-medium']//span[contains(text()")
    public WebElement Proced;


    public RegistrationPage OpenRegistrationPage () {
        Actions action = new Actions (driver);
        action.moveToElement (dresses)
                .moveToElement (viwelist)
                .moveToElement (size)
                .moveToElement (pricelowest)
                .moveToElement (CartOne)
                .moveToElement (closeone)
                .moveToElement (CartTwo)
                .moveToElement (closetwo)
                .moveToElement (cartl)
                .moveToElement (Proced)
                .build ().perform ();
        return new RegistrationPage (driver);

    }
}
