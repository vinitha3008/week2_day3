package week2.day3;

public class Edge extends Chrome{

	public void takeSnap()
	{
		System.out.println("snapshot in Edge class");
	}
	public void  clearCookies()
	{
		System.out.println("clear cookies in Edge class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge eob=new Edge();
		eob.openIncognito();
		eob.takeSnap();
		eob.clearCookies();
		
	}

}
