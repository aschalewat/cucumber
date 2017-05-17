package stepdefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Aschalew on 17/05/2017.
 */
public class MyStepdefs {
    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void iCheckout(int arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^the price of fruits as follow$")
    public void thePriceOfFruitsAsFollow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^the price of Fruit and Price$")
    public void thePriceOfFruitAndPrice(DataTable table) throws Throwable {
        List<List<String>> tbl = table.raw();
        int row = tbl.size();
        int col = tbl.get(0).size();
        for(int i = 0; i < row-1 ; i++){
            String fruit = "";
            String price = "";
            for(int j = 0; j < col; j++){
                if (j == 0){
                    fruit = tbl.get(i + 1).get(j).toString();
                }else{
                    price = tbl.get(i + 1).get(j).toString();
                }


            }
            System.out.println("The price of " + fruit + " is " + price + "C");
        }
    }
}
