import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FBAccount {
    @Test
    public void FbAccount(){
        com.codeborne.selenide.Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "File/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open( "https://www.facebook.com/");
        $(byText( "Create New Account")).click();
        $("._5dbb").$(byName( "firstname" )).setValue( "Natia" ).pressEnter();
        $(byName( "lastname" )).setValue( "datukishvili" ).pressEnter();
        $(byName( "reg_email__")).setValue( "591701827" );
        $(byName( "reg_passwd__" )).setValue( "*********" ).click();
        $("#age_to_birthday_link").click();
        $("._5k_5").$(byName( "birthday_year" )).selectOptionByValue( "1984" );
        $("._8esa",2).selectRadio( "-1" );
        $("#custom_gender_container").$(byName ("preferred_pronoun")).shouldBe( Condition.visible );
        $("._7-1q").$(byName( "custom_gender" )).shouldBe( Condition.visible );
        $(".large_form").$(byName ("preferred_pronoun")).selectOptionByValue( "2" );
        $("._8esa",0).selectRadio( "1" );
        $("#custom_gender_container").$(byName ("preferred_pronoun")).shouldNotBe(Condition.visible );
        $("._7-1q").$(byName( "custom_gender" )).shouldNotBe( Condition.visible );
        sleep( 5000);













    }
}
