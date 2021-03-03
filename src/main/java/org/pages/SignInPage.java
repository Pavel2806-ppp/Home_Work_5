package org.pages;

import org.attributes.AlreadyRegistered;
import org.attributes.CreateAccountAttribute;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;

    private Products products;
    private AlreadyRegistered alreadyRegistered;
    private CreateAccountAttribute createAccountAttribute;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public RegistrationPage createNewAccountWithEmail(String email){
        createAccountAttribute = new CreateAccountAttribute(driver);
        return createAccountAttribute.typeEmail(email).clickCreateAnAccount();
    }

    public Products ClickProducts() {
        products = new Products (driver);
        return products;
    }

}
