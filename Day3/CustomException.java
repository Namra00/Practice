

public class CustomException extends Exception{
	
	private static final long seialVersionUID = 1L;
	
	private static int uid[] = {1,2,3,4,5};
	
	private static String uname[] = {"Namra","Poojan","Divya","Kush","Deveraj"};
	
	CustomException() {}
	
	CustomException(String str) { super(str);}
	
	
	public static void main(String[] args) 
	{
		
		try {
			System.out.println("User ID: " + "\t" + "User Name: " + "\t");
			
			for (int i=0; i<5; i++) 
			{
				System.out.println("\t" + uid[i] + "\t" + uname[i] + "\t");
				
				if (uname[i].length() <= 4)
				{
					CustomException ce = new CustomException("user name length is less than 5");
					throw ce;
				}
			}
		}
		
		catch (CustomException e) {
			e.printStackTrace();
		}
		
	}
}