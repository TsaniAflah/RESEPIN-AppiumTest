import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class Test extends base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver =capabilities();
		/*
		 * 1. id 
		 *  Pada case ini automation test dilakukan untuk membuka halaman 'About' dengan id 'about_page'
		 *  dimana berisi profil pengembang aplikasi. Selanjutnya menekan ikon untuk kembali
		 *  yang memiliki id 'icBack' 
		 */
		driver.findElementById("android:id/about_page").click();
		driver.findElementById("android:id/icBack").click();
		
		/*
		 * 2. Classname 
		 *  Pada case ini pada halaman 'Home' search bar yang ada akan dipakai dengan memanggil
		 *  Classname 'androidx.appcompat.widget.SearchView' yang kemudian metode sendKeys() 
		 *  pada framework Appium digunakan untuk mengirimkan input teks ke elemen pada aplikasi yang sedang diuji.
		 */
		driver.findElementByClassName("androidx.appcompat.widget.SearchView").sendKeys("Boba");
		
		/*
		 * 3. Index
		 *  Dengan menggunakan test script dibawah dapat digunakan dalam pengujian dengan framework Appium untuk 
		 *  menemukan elemen yang sesuai dengan XPath tertentu, dalam hal ini sebuah LinearLayout pada urutan kedua, 
		 *  dan melakukan tindakan klik pada elemen tersebut.
		 */
		driver.findElementByXPath("//LinearLayout[2]").click();
		 
		/*
		 * 4. Classname with index
		 *  Digunakan dalam pengujian dengan framework Appium untuk menemukan semua elemen yang memiliki 
		 *  kelas (class) "android.widget.Button" dan mengambil elemen pertama dari daftar elemen tersebut. 
		 *  Selanjutnya, dilakukan tindakan klik pada elemen tersebut.
		 */
		driver.findElementsByClassName("android.widget.Button").get(0).click();
	}
}