import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
		String answer = JOptionPane.showInputDialog(null, "What is name?");
		if (answer.equals("Mike")) {
JOptionPane.showMessageDialog(null,"Mike like fish");
		}

		if (answer.equals("Grace")) {
JOptionPane.showMessageDialog(null,"This guy enjoy Salmon crazy.");
		}
		if (answer.equals("William")) {
JOptionPane.showMessageDialog(null,"I don't know this guy much.");
		}

	}
	}
}

