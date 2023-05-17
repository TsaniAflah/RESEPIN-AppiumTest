import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Test2 extends base {

	public static void main(String[] args) throws MalformedURLException{
		
		AndroidDriver<AndroidElement> driver =capabilities();
		
		/*
		 * 5. Android Automator
		 *  Dengan menggunakan metode findElementByAndroidUIAutomator(), kita mencari elemen yang memiliki 
		 *  teks "bagikan resep" menggunakan Android UI Automator. Setelah elemen tersebut ditemukan, dilakukan 
		 *  tindakan klik pada elemen tersebut dengan menggunakan metode click().
		 */
		driver.findElementByAndroidUIAutomator("text(\"bagikan resep\")").click();
	}

}
