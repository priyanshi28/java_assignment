package org.javabeans;

public class Triangle {
	 private String value;
	 private String height;
	
	public Triangle(String value,String height)
	 {
		 this.value = value;
		 this.height = height;
	 }
   public String getValue() {
		return value;
	}
   public String getHeight() {
	return height;
   }

public void draw()
   {
	   System.out.println(getValue() + "   ApplicationContext - Constructor  height vlaue "+getHeight());
   }
}
