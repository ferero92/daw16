import javax.swing.JOptionPane;
public class FutureTuition {

	public static void main(String[] args) {
		
		int count = 0;
		double tuition = 10000.00;
		double increase = 1.07;
		int doubled = 20000;
		
		while (tuition < doubled){
			tuition = tuition * increase;
			count++;
		}
		
		JOptionPane.showMessageDialog(null, "We need " + count + " years to doubled the tuition.");

	}
}