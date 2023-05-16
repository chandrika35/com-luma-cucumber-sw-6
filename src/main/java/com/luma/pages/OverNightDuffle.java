package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverNightDuffle extends Utility {
    private static final Logger log = LogManager.getLogger(OverNightDuffle.class.getName());

    public OverNightDuffle() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Overnight Duffle')]")
    WebElement bagProduct;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement getTextOfBagProductName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-ui-id='message-success']")
    WebElement getTextAddedToShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//a[text()='shopping cart']")
    WebElement shoppingCartLink;


    public void clickOnOvernightDuffelBag() {
        log.info("Click on Over Night Duffle Bag" + bagProduct.toString());
        clickOnElement(bagProduct);
    }

    public String verifyTextOverNightDuffleBag() {
        log.info("Get Text Over Night Duffle Bag" + getTextOfBagProductName.toString());
        return getTextFromElement(getTextOfBagProductName);
    }

    public void changeQtyOfBag() {
        log.info("Change Quantity of Bag" + changeQty.toString());
        clickOnElement(changeQty);
        changeQty.clear();
        sendTextToElement(changeQty, "3");
    }

    public void clickOnAddToCartProduct() {
        log.info("Click on Add to Cart" + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String verifyTextAddedToShoppingCartSuccessfully() {
        log.info("Get Text Product Added to Shopping cart Successfully" + getTextAddedToShoppingCart.toString());
        return getTextFromElement(getTextAddedToShoppingCart);

    }

    public void clickOnShoppingCartLink() {
        log.info("Click on Shopping cart Link" + shoppingCartLink.toString());
        clickOnElement(shoppingCartLink);
    }
}

