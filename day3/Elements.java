package week2.day3;

public class Elements extends Button
{
	public void elementMethod()
	{
	System.out.println("this is from elements class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object for Elements class
		Elements e=new Elements();
		e.elementMethod();
		e.submit();
		e.click();
		e.setText("passed to WebElement");
		//object for radiobutton class
		RadioButton rd=new RadioButton();
		rd.selectRadioButton();
		//object for checkboxbutton class
		CheckBoxButton cb=new CheckBoxButton();
		cb.clickCheckButton();
	}

}
