package org.javabeans;

public class Triangle {
	 private String value;
	 
   public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
public void draw()
   {
	   System.out.println(getValue() + "  hello Spring via ApplicationContext");
   }
}
