package org.system;

public class Desktop extends Computer{

	public void desktopSize(float f)
	{
		System.out.println("Desktop Size :" +f +" "+"inches");
	}
	
	public static void main(String[] args) {
		
		Desktop des = new Desktop();
		des.computerModel();
		des.desktopSize(23.5f);
		
	}
}
