package week2.day3;

public class Chrome extends Browser{

	public void openIncognito()
	{
		System.out.println("in chrome class");
		
	}
	public void clearCache()
	{
		System.out.println("chrome cache is cleared");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome ob=new Chrome();
		ob.openURL();
		ob.openIncognito();
		ob.clearCache();
		ob.closeBrowser();
	}

}
