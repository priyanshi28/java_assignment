package sprencorenew;

public class Traingle {
	
	
	private String type;
	public String gettype() {
		return type;
	}
	
     public  void setType (String type) {
        this.type =type;
}  
     public void draw()
 	{
 		System.out.println( gettype() + "hello");
 	}
}
