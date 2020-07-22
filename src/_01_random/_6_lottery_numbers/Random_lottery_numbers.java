package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Random_lottery_numbers {

public static void main(String[] args) {
	Random ran = new Random();
	for (int i = 0; i < 6; i++) {
		JOptionPane.showMessageDialog(null, ran.nextInt(100));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
