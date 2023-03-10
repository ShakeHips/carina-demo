package com.qaprosoft.carina.demo.gui.pages.LumaPages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.LumaComponents.HeaderMenuLuma;
import com.qaprosoft.carina.demo.gui.pages.LumaPages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePageLuma extends AbstractPage {

    @FindBy(xpath = "//div[@class=\"header content\"]")
    private HeaderMenuLuma headerMenu;

    public HeaderMenuLuma getHeaderMenuLuma(){
        return headerMenu;
    }

    public HomePageLuma(WebDriver driver) {
        super(driver);
    }
}
