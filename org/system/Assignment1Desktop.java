package org.system;

public class Assignment1Desktop extends Assignment1Computer {
	
	public void desktopSize() {
       System.out.println("desktopSize method from class Assignment1Desktop");
	}

	public static void main(String[] args) {

		Assignment1Desktop desktop=new Assignment1Desktop();
		
		desktop.desktopSize();
		desktop.computerMode();
		
	}

}
