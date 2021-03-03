package automationpractice;

import org.Account;
import org.AccountBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.pages.*;
import org.utils.TestHelper;

public class RegistrationTest extends BaseTest{
    private Account account;
    private MainPage mainPage;
    private SignInPage signInPage;
    private RegistrationPage registrationPage;
    private MyAccountPage myAccountPage;
    private TestHelper testHelper;
    private Products products;

    @Before
    public void setupAccount() {
        account = new AccountBuilder ()
                .withGender("Mr.")
                .withEmail("Paul.Dinker"+ testHelper.randomInt () +"@gmail.com")
                .withPassword("Paul.Dinker")
                .withFirstCustomerName("Paul")
                .withLastCustomerName("Dinker")
                .withBirthdayDay("10")
                .withBirthdayMonth("12")
                .withBirthdayYear("1992")
                .withFirstName("Kirkorov")
                .withLastName("Anton")
                .withCompany("IBM")
                .withAddress1("New York 1")
                .withAddress2("Kiev 5")
                .withCity("Austria")
                .withState("Alabama")
                .withZipCode("02578")
                .withCountry("United States")
                .withPhoneMobile("+30662035645")
                .withAliasAddress("Byym!")
                .build();
        mainPage = new MainPage (driver);
    }



    @Test
    public void canCreateNewAccount() {
        signInPage = mainPage.clickSignIn();
        registrationPage = signInPage.createNewAccountWithEmail(account.getEmail());
        myAccountPage = registrationPage.fillAndSubmitRegistrationForm(account);
        String actualResult = myAccountPage.getAccountName();
        String expectedResult = account.getFirstCustomerName();


        Assert.assertTrue("If test failed then user name is incorrect", actualResult.contains(expectedResult));

    }

}
