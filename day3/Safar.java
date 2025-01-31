package week2.day3;

public class Safar extends Browser{

	public void readerMode()
	{
		System.out.println("Safari class readermode");
	}
	public void  fullScreenMode()
	{
		System.out.println("safari class fullscreenmode");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safar sob=new Safar();
		sob.openURL();
		sob.readerMode();
		sob.fullScreenMode();
		
	}

}
