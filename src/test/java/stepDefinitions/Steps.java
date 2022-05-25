package stepDefinitions;


import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

public class Steps {

    @Given("^user on landing Page$")
    public void user_on_landing_page() throws Throwable {
        //throw new PendingException();
    	
    	System.out.println("user on landing Page");
    }

   /* @When("^enter (.+) and (.+)$")
    public void enter_and(String username, String password) throws Throwable {
        //throw new PendingException();
    	System.out.println("username= "+username);
    	System.out.println("password= "+password);
    }*/
    @When("^enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void enter_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("username= "+strArg1);
    	System.out.println("password= "+strArg2);
    	System.out.println("password1= "+strArg2);
    	System.out.println("password2= "+strArg2);
    	System.out.println("password3= "+strArg2);
    }
    @And("^click on submit$")
    public void click_on_submit() throws Throwable {
        //throw new PendingException();
    	System.out.println("clicked");
    }

    @Then("^if login successfull$")
    public void if_login_successfull() throws Throwable {
       // throw new PendingException();
    	System.out.println("if login successfull");
    }

   
    @And("^go to gome page \"([^\"]*)\"$")
    public void go_to_gome_page_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }

  /* @And("^go to gome page and search friend$")
    public void go_to_gome_page_and_search_friend() throws Throwable {
        System.out.println("go to gome page and search friend");
    }*/


}
