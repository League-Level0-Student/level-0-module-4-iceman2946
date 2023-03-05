package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score=JOptionPane.showInputDialog("What is your latest test score?");
	double test_score=Double.parseDouble(score);
	if(test_score>90 && test_score<100.01) {
		JOptionPane.showMessageDialog(null, "Great job on your test! Keep on the good work!");		
	}
	else if(test_score<90&&test_score>80) {
		JOptionPane.showMessageDialog(null, "Good job on your test! A little up and you are sucessful!");
	}
	else if(test_score<80&&test_score>70) {
		JOptionPane.showMessageDialog(null, "Not bad! Keep working harder if you want to be successful!");
	}
	else if (test_score<70&&test_score>60) {
		JOptionPane.showMessageDialog(null, "Watch out! If you want sucess put a dozen of effort into your test.");
	}
	else if(test_score<60) {
		JOptionPane.showMessageDialog(null,"Don't be in faliure next time! Come out strong!");
	}
}
}
