package stepdefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Aschalew on 17/05/2017...
 */
public class MyStepdefs {

    private String fruit;
    private String price;

    public MyStepdefs(){
        fruit = System.getProperty("fruitName");
        price = System.getProperty("price");
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void iCheckout(int arg0, String arg1) throws Throwable {
        System.out.println("When");
    }

    @Given("^the price of fruits as follow$")
    public void thePriceOfFruitsAsFollow() throws Throwable {

    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int arg0) throws Throwable {
        System.out.println("Then");
        System.out.println("Given");

        System.out.println("Running thePriceOfFruitsAsFollow ");
        if (fruit.contains("Banana")){
            System.out.println("The fruit is "+ fruit  +" and it costs "+ price +"c" );
        }else{
            System.out.println("The fruit is not Banana");
        }
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

    @Given("^Open chrome and start application$")
    public void openChromeAndStartApplication() throws Throwable {
        System.out.println("GivenGiven");
    }

    @When("^I enter valid username and valid password$")
    public void iEnterValidUsernameAndValidPassword() throws Throwable {
        System.out.println("WhenWhen");
    }

    @Then("^user should be able to login successfully$")
    public void userShouldBeAbleToLoginSuccessfully() throws Throwable {
        System.out.println("ThenThen");
    }
}
