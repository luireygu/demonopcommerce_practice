package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pages.PageComputers;
import pages.pages.PageDashboard;
import utils.data.generalInfo;
import asserts.assertsPageComputers;
public class DashboardSteps {

    private final PageDashboard dashboardPage;
    private final PageComputers ComputersPage;
    private final assertsPageComputers asserts;

    public DashboardSteps(){
        this.dashboardPage = new PageDashboard();
        this.ComputersPage = new PageComputers();
        this.asserts = new assertsPageComputers();
    }

    @Given("el usuario ingresa a la pagina de Demo Nop Commerce")
    public void goToThePageNopCommerce(){
        dashboardPage.open(generalInfo.urlGeneral);
    }
    @When("el usuario de click en la seccion de computers")
    public void clickOnTheComputersSection (){
       dashboardPage.clickSectionComputers();
    }
   @And("el usuario da click en software")
    public void clickOnTheSoftwareSection(){

        ComputersPage.clickSectionComputers();
   }
   @Then("visualiza los 3 productos de software")
    public void viewSoftwareProducts(){
     //  asserts.assertSoftwareProducts();


   }

}
