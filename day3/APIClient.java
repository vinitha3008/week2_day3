package week2.day3;

public class APIClient {
	public void sendRequest(String endpoint)
	{
		System.out.println("Endpoint  "+endpoint);
	
	}
	public void sendRequest(String endpoint,String requestbody,boolean requestStatus)
	{
		System.out.println("Endpoint "+endpoint);
		System.out.println("Request body "+requestbody);
		System.out.println("request status "+requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient api=new APIClient();
		api.sendRequest("endpoint");
		api.sendRequest("2nd endpoint", "re_body", false);
	}

}
