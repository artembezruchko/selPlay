package selenide.art;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainTests {

    @Test
    public void openGoogle() {
        open("https://google.com");
    }
}
