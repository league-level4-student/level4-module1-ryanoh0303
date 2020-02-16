package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public void method(Zodiac z) {
		switch(z) {
		case ARIES:
			
			
			JOptionPane.showMessageDialog(null, "You’ve definitely been hustling over the past few years, but this year, you are going for a big final push on something you’ve been working towards for a long time. The good news is that you’re likely to see some big results, whether it be in your relationship or your career. But keep in mind that those results may not look exactly how you imagined they would. This year will contain moments that feel like detours, but remember that for you, Aries, the only way out is through.");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "You have bad luck this year");
			break;
		 default:
			JOptionPane.showMessageDialog(null, "YOU HAVE A HORRIBLE LUCK");
			break;
		
		
		
		}
		
			
		
	}
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope zodiac = new _00_Horoscope();
		Zodiac data =  Zodiac.ARIES;
		zodiac.method(data);
		
	
	}
	
}
