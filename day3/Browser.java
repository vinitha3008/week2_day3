package week2.day3;

public class Browser {
	public void  openURL()
	{
		System.out.println("url is opened");
	}
	public void closeBrowser()
	{
		System.out.println("browser is closed");
		
	}
	public void navigateBack() 
	{
		System.out.println("navigate back");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser=new Browser();
		browser.openURL();
		browser.closeBrowser();
		browser.navigateBack();
}

}
