import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String answer=JOptionPane.showInputDialog(null,"What is your birthday?mm/dd");
if(answer.equals("03/28")) {
JOptionPane.showMessageDialog(null,"Happy Birthday!");
}
else {
JOptionPane.showMessageDialog(null,"Very merry UNbirthday!");
}
}
}
