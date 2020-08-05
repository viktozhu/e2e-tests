package com.companyname.sample;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class StepDefinitions {

    @Given("step example")
    public void givenStepExample() {
    }

    @When("another example provided")
    public void anotherExampleProvided() {
        
    }

    @Then("Something tested")
    public void somethingTested() {
    }
}
