package pages.pages;

import components.ComponentDashboard;
import locators.LocatorDashboard;
import pages.Base.BasePage;

public class PageDashboard extends BasePage {

    public final ComponentDashboard compDashboard;

    public PageDashboard(){
        this.compDashboard = new ComponentDashboard();
    }

    public void open(String url){
        navigateto(url);
    }
    public void clickSectionComputers(){
        compDashboard.clickSection(LocatorDashboard.COMPUTER_SECTION);
    }



}
