package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {

    @FindBy(id = "warehouse-savings")
    public static WebElement viewWareHouseSavings;
    @FindBy(id="warehouse-locations-dropdown")
    public static WebElement FindaWarehouse;
    @FindBy(id="email-signup-dropdown")
    public static WebElement GetEmailOffers;
    @FindBy(id="customer-service-link")
    public static WebElement CustomerService;
    @FindBy(xpath ="//a[@id='country-select']" )
    public static WebElement us;
    @FindBy(xpath ="//div[@class='table-cell logo hidden-xs hidden-sm hidden-md hidden-lg']//img[@class='bc-logo logo-us']" )
    public static WebElement logo;
    @FindBy(xpath ="//input[@id='search-field']" )
    public static WebElement search;

    public void checkviewWareHouseSavings(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewWareHouseSavings.click();
    }
    public void checkFindaWarehouse(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        FindaWarehouse.click();
    }
    public void checkGetEmailOffers(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        GetEmailOffers.click();
    }
    public void checkCustomerService(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CustomerService.click();
    }
    public void checkus(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        us.click();
    }
    public void checkLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logo.click();
    }
    public void checkSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        search.click();  //search
    }
}
