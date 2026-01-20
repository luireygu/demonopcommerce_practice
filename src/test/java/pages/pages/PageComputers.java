package pages.pages;

import components.ComponentSectionComputers;
import locators.LocatorSectionComputers;
import org.openqa.selenium.WebDriver;
import pages.Base.BasePage;

import java.util.List;

public class PageComputers extends BasePage {

    public  final ComponentSectionComputers compComputers;
    public PageComputers(){
        this.compComputers = new ComponentSectionComputers();
    }
    public void clickSectionComputers(){
        compComputers.clickSectionComputers(LocatorSectionComputers.SOFTWARE_SECTION);
    }
    public List<String> elementsSoftwareProducts(){
        return getTextsElements(LocatorSectionComputers.SOFTWARE_PRODUCTS);

    }
}
