import javax.swing.JOptionPane;

public class Riddler {
	public static void main(String[] args) {
		int score = 0;
		String answer = JOptionPane.showInputDialog("What kind of room has no doors or windows?");
		if (answer.equals("mushroom")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "wrong,mushroom");
		}
		answer = JOptionPane.showInputDialog("Which word in the dictionary is spelled incorrectly?");
		if (answer.equals("incorrectly")) {
			JOptionPane.showMessageDialog(null, "correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "wrong,incorrectly");
		}
		JOptionPane.showMessageDialog(null,"your score is "+score);
		
	}
}
