package tests;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.*;
public class FirstTest {
    @Test
    public void testPageUrlAndTitle() {
        // Open page url
        open("https://onliner.by/");
        // Assert the url matches
        String url = WebDriverRunner.url();
        assertEquals(url, "https://www.onliner.by/");
        // Assert the title matches
        String title = title();
        assertEquals(title, "Onlíner");
    }
}