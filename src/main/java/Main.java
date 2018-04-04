import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.io.IOException;
import java.net.URL;
public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {

       /* ProcessBuilder processBuilder = new ProcessBuilder("D:/Winium/Winium.Desktop.Driver.exe");
        Process winium = processBuilder.start();
       */


        URL winiumDesktopDrvUrl = new URL("http://localhost:9999");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app", "C:/windows/system32/calc.exe");
        cap.setCapability("launchDelay","5");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9999"),cap);
        Thread.sleep(5000);

        WebElement app = driver.findElement(By.className("ApplicationFrameWindow"));
        WebElement w = app.findElement(By.className("Windows.UI.Core.CoreWindow"));
        WebElement numPad = w.findElement(By.id("NumberPad"));
        numPad.findElement(By.id("num1Button")).click();Thread.sleep(2000);
        numPad.findElement(By.id("num2Button")).click();
        Thread.sleep(1000);

    }


}
