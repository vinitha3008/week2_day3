package week2.day3;

public class TextField extends WebElement {

	public void getText(String s)
	{
		System.out.println("String from get Text:"+s);
	}
	
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		TextField t=new TextField();
		System.out.println("text field object:");
		t.click();
		t.getText(t.setText("WebElement text"));
		
	}

}
