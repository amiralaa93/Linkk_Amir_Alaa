package tests.Packages;

import BasePackage.BaseTest;
import Pages.Packages.countryPackages;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class countryPackagesTest extends BaseTest {
    private static countryPackages countryPackages;
    @BeforeClass
    public void initialization() {
        countryPackages = new countryPackages();
    }
    @Test(priority = 1, description="Check Saudi Country Packages")
    public void saudiCountryCheck(){
        countryPackages.saudiCountry();
    }
    @Test(priority = 2, description="Check Kuwait Country Packages")
    public void kuwaitCountryCheck(){
        countryPackages.kwCountry();
    }
    @Test(priority = 3, description="Check Bahrain Country Packages")
    public void bahrainCountryCheck(){
        countryPackages.bahrainCountry();
    }

}