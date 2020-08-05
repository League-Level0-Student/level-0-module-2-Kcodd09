package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int age_int = Integer.parseInt(age);
		if(age_int>=18) {
			JOptionPane.showInputDialog("Who should the next president be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}		
}
