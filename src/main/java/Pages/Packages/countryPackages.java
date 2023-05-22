package Pages.Packages;

import BasePackage.BasePage;
import Utilities.ObjectRepositoryJsonParser;
import Utilities.TimeUtils;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
public class countryPackages extends BasePage {
    SoftAssert softAssert = new SoftAssert();
    public void saudiCountry() {
        //Check Saudi Country Selected
        WebElement countryBtn = ObjectRepositoryJsonParser.getObjectLocator("$.countries.countryBtn");
        softAssert.assertTrue(countryBtn.isDisplayed(),"Country Button not displayed");
        String saudiSelectedCountryText = getText(countryBtn);
        softAssert.assertEquals(saudiSelectedCountryText, "KSA", "Saudi Country not selected");
        TimeUtils.shortWait();

        //Check Plans
        WebElement liteType = ObjectRepositoryJsonParser.getObjectLocator("$.planType.liteType");
        elementIsDisplayed(liteType);
        String liteTypeText = getText(liteType);
        softAssert.assertEquals(liteTypeText, "LITE", "Lite Type not Found");

        WebElement classicType = ObjectRepositoryJsonParser.getObjectLocator("$.planType.classicType");
        elementIsDisplayed(classicType);
        String classicTypeText = getText(classicType);
        softAssert.assertEquals(classicTypeText, "CLASSIC", "Classic Type not Found");

        WebElement premiumType = ObjectRepositoryJsonParser.getObjectLocator("$.planType.premiumType");
        elementIsDisplayed(premiumType);
        String premiumTypeText = getText(premiumType);
        softAssert.assertEquals(premiumTypeText, "PREMIUM", "Premium Type not Found");

        //Check Prices
        WebElement litePrice = ObjectRepositoryJsonParser.getObjectLocator("$.planPrices.litePrice");
        elementIsDisplayed(litePrice);
        String litePriceText = getText(litePrice);
        softAssert.assertEquals(litePriceText, "15 SAR/month", "Lite Price not Found");

        WebElement classicPrice = ObjectRepositoryJsonParser.getObjectLocator("$.planPrices.classicPrice");
        elementIsDisplayed(classicPrice);
        String classicPriceText = getText(classicPrice);
        softAssert.assertEquals(classicPriceText, "25 SAR/month", "Classic Price not Found");

        WebElement premiumPrice = ObjectRepositoryJsonParser.getObjectLocator("$.planPrices.premiumPrice");
        elementIsDisplayed(premiumPrice);
        String premiumPriceText = getText(premiumPrice);
        softAssert.assertEquals(premiumPriceText, "60 SAR/month", "Premium Price not Found");

        TimeUtils.mediumWait();
        softAssert.assertAll();
    }
    public void kwCountry() {
        //Check Kuwait Country Selected
        WebElement countryBtn = ObjectRepositoryJsonParser.getObjectLocator("$.countries.countryBtn");
        softAssert.assertTrue(countryBtn.isDisplayed(),"Country Button not displayed");
        elementClick(countryBtn);
        WebElement selectKwCountry = ObjectRepositoryJsonParser.getObjectLocator("$.countries.kwCountry");
        elementClick(selectKwCountry);

        WebElement selectedCountry = ObjectRepositoryJsonParser.getObjectLocator("$.countries.countryBtn");
        String kuwaitSelectedCountryText = getText(selectedCountry);
        softAssert.assertEquals(kuwaitSelectedCountryText, "Kuwait", "Kuwait Country not selected");
        TimeUtils.mediumWait();

        //Check Plans
        WebElement liteType = ObjectRepositoryJsonParser.getObjectLocator("$.planType.liteType");
        elementIsDisplayed(liteType);
        String liteTypeText = getText(liteType);
        softAssert.assertEquals(liteTypeText, "LITE", "Lite Type not Found");

        WebElement classicType = ObjectRepositoryJsonParser.getObjectLocator("$.planType.classicType");
        elementIsDisplayed(classicType);
        String classicTypeText = getText(classicType);
        softAssert.assertEquals(classicTypeText, "CLASSIC", "Classic Type not Found");

        WebElement premiumType = ObjectRepositoryJsonParser.getObjectLocator("$.planType.premiumType");
        elementIsDisplayed(premiumType);
        String premiumTypeText = getText(premiumType);
        softAssert.assertEquals(premiumTypeText, "PREMIUM", "Premium Type not Found");

        //Check Prices
        WebElement litePrice = ObjectRepositoryJsonParser.getObjectLocator("$.planPrices.litePrice");
        elementIsDisplayed(litePrice);
        String litePriceText = getText(litePrice);
        softAssert.assertEquals(litePriceText, "1.2 KWD/month", "Lite Price not Found");

        WebElement classicPrice = ObjectRepositoryJsonParser.getObjectLocator("$.planPrices.classicPrice");
        elementIsDisplayed(classicPrice);
        String classicPriceText = getText(classicPrice);
        softAssert.assertEquals(classicPriceText, "2.5 KWD/month", "Classic Price not Found");

        WebElement premiumPrice = ObjectRepositoryJsonParser.getObjectLocator("$.planPrices.premiumPrice");
        elementIsDisplayed(premiumPrice);
        String premiumPriceText = getText(premiumPrice);
        softAssert.assertEquals(premiumPriceText, "4.8 KWD/month", "Premium Price not Found");

        TimeUtils.mediumWait();
        softAssert.assertAll();
    }
    public void bahrainCountry() {
        //Check Bahrain Country Selected
        WebElement countryBtn = ObjectRepositoryJsonParser.getObjectLocator("$.countries.countryBtn");
        softAssert.assertTrue(countryBtn.isDisplayed(),"Country Button not displayed");
        elementClick(countryBtn);
        WebElement selectBhCountry = ObjectRepositoryJsonParser.getObjectLocator("$.countries.bhCountry");
        elementClick(selectBhCountry);

        WebElement selectedCountry = ObjectRepositoryJsonParser.getObjectLocator("$.countries.countryBtn");
        String bahrainSelectedCountryText = getText(selectedCountry);
        softAssert.assertEquals(bahrainSelectedCountryText, "Bahrain", "Bahrain Country not selected");
        TimeUtils.shortWait();

        //Check Plans
        WebElement liteType = ObjectRepositoryJsonParser.getObjectLocator("$.planType.liteType");
        elementIsDisplayed(liteType);
        String liteTypeText = getText(liteType);
        softAssert.assertEquals(liteTypeText, "LITE", "Lite Type not Found");

        WebElement classicType = ObjectRepositoryJsonParser.getObjectLocator("$.planType.classicType");
        elementIsDisplayed(classicType);
        String classicTypeText = getText(classicType);
        softAssert.assertEquals(classicTypeText, "CLASSIC", "Classic Type not Found");

        WebElement premiumType = ObjectRepositoryJsonParser.getObjectLocator("$.planType.premiumType");
        elementIsDisplayed(premiumType);
        String premiumTypeText = getText(premiumType);
        softAssert.assertEquals(premiumTypeText, "PREMIUM", "Premium Type not Found");

        //Check Prices
        WebElement litePrice = ObjectRepositoryJsonParser.getObjectLocator("$.planPrices.litePrice");
        elementIsDisplayed(litePrice);
        boolean litePriceText = getText(litePrice).contains("BHD");
        softAssert.assertTrue(litePriceText,"Lite Price not Found");

        WebElement classicPrice = ObjectRepositoryJsonParser.getObjectLocator("$.planPrices.classicPrice");
        elementIsDisplayed(classicPrice);
        boolean classicPriceText = getText(classicPrice).contains("BHD/month");
        softAssert.assertTrue(classicPriceText, "Classic Price not Found");

        WebElement premiumPrice = ObjectRepositoryJsonParser.getObjectLocator("$.planPrices.premiumPrice");
        elementIsDisplayed(premiumPrice);
        boolean premiumPriceText = getText(premiumPrice).contains("6 BHD/month");
        softAssert.assertTrue(premiumPriceText, "Premium Price not Found");

        TimeUtils.mediumWait();
        softAssert.assertAll();
    }

}