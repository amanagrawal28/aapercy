package aapercy;

import org.openqa.selenium.chrome.ChromeDriver;

import io.percy.selenium.Percy;

public class testPercy {

	private static Percy percy;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://example.com");
		percy = new Percy(driver);
		percy.snapshot("Java example");
		driver.close();
	}
}