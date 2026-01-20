package locators;

import org.openqa.selenium.By;

public class LocatorSectionComputers {
    public static final By SOFTWARE_SECTION = By.xpath("//a[@title='Show products in category Software' and contains(text(), 'Software')]");
    public static final By SOFTWARE_PRODUCTS = By.xpath("//h2[@class='product-title']");

}
