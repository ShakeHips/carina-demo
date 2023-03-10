package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.pages.*;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebFooterTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "Nikita Yazlovytsky")
    public void footerTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "homepage is not opened");
        FooterMenu footerMenu = homePage.getFooterMenu();
        Assert.assertTrue(footerMenu.areElementsPresentFooter(), "Elements are not present");

        NewsSimplePage newsSimplePage = footerMenu.openNewsSimplePage();
        Assert.assertTrue(newsSimplePage.newsPageCheck(), "News page did not open");
        homePage.open();

        ReviewsPage reviewsPage = footerMenu.openReviewsPage();
        Assert.assertTrue(reviewsPage.isReviewPageOpened(), "Reviews Page did not open");
        homePage.open();

        BlogPage blogPage = footerMenu.openBlogPage();
        Assert.assertTrue(blogPage.isBlogPageCheck(), "Blog page did not open");
        homePage.open();

        PhoneFinderPage phoneFinderPage = footerMenu.openPhoneFinderPage();
        Assert.assertTrue(phoneFinderPage.phoneFinderPageCheck(),"Phone Finder page did not open");
        homePage.open();

        ToolsPage toolsPage = footerMenu.openToolsPage();
        Assert.assertTrue(toolsPage.ToolsPageCheck(), "Tools page did not open");
        homePage.open();

        ComparingPage comparingPage = footerMenu.openComparingPage();
        Assert.assertTrue(comparingPage.comaparingPageCheck(), "Comparing page did not open");
        homePage.open();

        CoveragePage coveragePage = footerMenu.openCoveragePage();
        Assert.assertTrue(coveragePage.coveragePageTitleCheck(), "Coverage Page did not open");
        homePage.open();

        GlossaryPage glossaryPage = footerMenu.openGlossaryPage();
        Assert.assertTrue(glossaryPage.glossaryPageCheck(), "Glossary Page did not open");
        homePage.open();

        ContactUsPage contactUsPage = footerMenu.openContactUsPage();
        Assert.assertTrue(contactUsPage.contactUsPageCheck(), "Contact Us page did not open");
        homePage.open();
    }
}
