package week2.day3;

public class Button extends WebElement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b=new Button();
		b.click();
		b.setText("hello");
	}

	public void submit()
	{
		System.out.println("Button cls submit method");
	}
}
