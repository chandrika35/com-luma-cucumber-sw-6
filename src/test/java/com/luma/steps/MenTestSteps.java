package com.luma.steps;

import com.luma.pages.Homepage;
import com.luma.pages.MensPantPage;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MenTestSteps {
    @When("^I mouse hover Men menu$")
    public void iMouseHoverMenMenu() throws InterruptedException {
        Thread.sleep(2000);
        new Homepage().mouseHoverToMenMenu();
    }

    @And("^I mouse hover on Bottoms menu$")
    public void iMouseHoverOnBottomsMenu() {
        new Homepage().mouseHoverToBottomMenu();
    }

    @And("^I click on Pant menu$")
    public void iClickOnPantMenu() {
        new Homepage().mouseHoverAndClickOnPantMenu();
    }

    @Then("^I mouse hover on product name Cronus Yoga Pant and click on size (\\d+)$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize(int arg0) {
        new MensPantPage().mouseHoverAndClickOnPantSize();
    }

    @And("^I mouse hover on Cronus Yoga Pant and click on colour Black$")
    public void iMouseHoverOnCronusYogaPantAndClickOnColourBlack() {
        new MensPantPage().mouseHoverAndClickOnBlackColour();
    }

    @And("^I mouse hover on Cronus Yoga Pant and click on Add To Cart Button$")
    public void iMouseHoverOnCronusYogaPantAndClickOnAddToCartButton() {
        new MensPantPage().mouseHoverAndClickOnAddToCart();
    }

    @Then("^I should see message You added Cronus Yoga Pant to your shopping cart\\.$")
    public void iShouldSeeMessageYouAddedCronusYogaPantToYourShoppingCart() {
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = new MensPantPage().verifyProductAddedToCartSuccessfully();
        Assert.assertEquals("Product added message not displayed.", expectedText, actualText);
    }

    @Then("^I should see text Shopping cart$")
    public void iShouldSeeTextShoppingCart() {
        String expectedText = "Shopping Cart";
        String actualText = new ShoppingCartPage().verifyTextShoppingCart();
        Assert.assertEquals("Not Displayed.", actualText, expectedText);
    }

    @And("^I should see that product name Cronus Yoga Pant$")
    public void iShouldSeeThatProductNameCronusYogaPant() {
        String expectedText = "Cronus Yoga Pant";
        String actualText = new ShoppingCartPage().verifyProductName();
        Assert.assertEquals("Not Displayed.", actualText, expectedText);
    }

    @And("^I should see product size is (\\d+)$")
    public void iShouldSeeProductSizeIs(int arg0) {
        String expectedText = "32";
        String actualText = new ShoppingCartPage().verifyProductSize();
        Assert.assertEquals("Not Displayed.", actualText, expectedText);
    }

    @And("^I should see product colour Black$")
    public void iShouldSeeProductColourBlack() {
        String expectedText = "Black";
        String actualText = new ShoppingCartPage().verifyProductColour();
        Assert.assertEquals("Not Displayed.", actualText, expectedText);
    }
}

