/*
 * Copyright 2013-2021 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qaprosoft.carina.demo.gui.components;

import com.qaprosoft.carina.demo.gui.pages.*;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

import java.util.List;

public class FooterMenu extends AbstractUIObject {

    @FindBy(xpath = "//div[@class=\"footer-inner\"]/div[@id=\"footmenu\"]/p/a")
    private List<ExtendedWebElement> allFooterButtons;

    @FindBy(xpath = "//div[@id=\"footmenu\"]/p/a[@href=\"reviews.php3\"]")
    private ExtendedWebElement reviewsLink;

    @FindBy(xpath = "//div[@id=\"footmenu\"]/p/a[@href=\"blog.php3\"]")
    private ExtendedWebElement blogLink;

    @FindBy(xpath = "//div[@id=\"footmenu\"]/p/a[@href=\"search.php3\"]")
    private ExtendedWebElement finderLink;

    @FindBy(xpath = "//div[@id=\"footmenu\"]/p/a[@href=\"tools.php3\"]")
    private ExtendedWebElement toolsLink;

    @FindBy(xpath = "//div[@id=\"footmenu\"]/p/a[@href=\"network-bands.php3\"]")
    private ExtendedWebElement coverageLink;

    @FindBy(xpath = "//div[@id=\"footmenu\"]/p/a[@href=\"glossary.php3\"]")
    private ExtendedWebElement glosarryLink;

    @FindBy(xpath = "//div[@id=\"footmenu\"]/p/a[@href=\"contact.php3\"]")
    private ExtendedWebElement contactUsButton;
    @FindBy(linkText = "Home")
    private ExtendedWebElement homeLink;

    @FindBy(xpath = "//div[@class='footer-inner']//a[contains(text(),'Compare')]")
    private ExtendedWebElement compareLink;
    
    @FindBy(linkText = "News")
    private ExtendedWebElement newsLink;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }


    public boolean areElementsPresentFooter(){
        ExtendedWebElement[] webElements = allFooterButtons.toArray(new ExtendedWebElement[8]);
        return allElementsPresent(webElements);
    }

    public HomePage openHomePage() {
        homeLink.click();
        return new HomePage(driver);
    }

    public CompareModelsPage openComparePage() {
        compareLink.click();
        return new CompareModelsPage(driver);
    }
    
    public NewsPage openNewsPage() {
        newsLink.click();
        return new NewsPage(driver);
    }

    public ReviewsPage openReviewsPage() {
        reviewsLink.click();
        return new ReviewsPage(driver);
    }

    public BlogPage openBlogPage() {
        blogLink.click();
        return new BlogPage(driver);
    }

    public PhoneFinderPage openPhoneFinderPage() {
        finderLink.click();
        return new PhoneFinderPage(driver);
    }

    public ToolsPage openToolsPage() {
        toolsLink.click();
        return new ToolsPage(driver);
    }

    public CoveragePage openCoveragePage() {
        coverageLink.click();
        return new CoveragePage(driver);
    }

    public GlossaryPage openGlossaryPage() {
        glosarryLink.click();
        return new GlossaryPage(driver);
    }

    public ContactUsPage openContactUsPage() {
        contactUsButton.click();
        return new ContactUsPage(driver);
    }

    public ComparingPage openComparingPage() {
        compareLink.click();
        return new ComparingPage(driver);
    }

    public NewsSimplePage openNewsSimplePage(){
        newsLink.click();
        return new NewsSimplePage(driver);
    }
}
