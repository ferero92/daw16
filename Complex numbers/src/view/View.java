package view;

import java.awt.*;
import javax.swing.*;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JTextField n;
	private JTextField m;
	private JButton sum;
	private JButton minus;
	private JButton multiplication;
	private JTextField result;
	
	public View(){
		
		this.setLayout(new GridLayout(3, 1));
		
		this.n = new JTextField(5);
		this.m = new JTextField(5);
		this.sum = new JButton("Sum");
		this.minus = new JButton("Minus");
		this.multiplication = new JButton("Multiplication");
		this.result = new JTextField(10);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 2));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		panel1.add(new JLabel("Number a"));
		panel1.add(this.n);
		panel1.add(new JLabel("Number b"));
		panel1.add(this.m);
		
		panel2.add(this.sum);
		panel2.add(this.minus);
		panel2.add(this.multiplication);
		
		panel3.add(this.result);
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		
	}
	
	public void run(){
		
		this.setTitle("Complex Calculator");
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JTextField getN() {
		return n;
	}

	public void setN(JTextField n) {
		this.n = n;
	}

	public JTextField getM() {
		return m;
	}

	public void setM(JTextField m) {
		this.m = m;
	}

	public JButton getSum() {
		return sum;
	}

	public void setSum(JButton sum) {
		this.sum = sum;
	}

	public JButton getMinus() {
		return minus;
	}

	public void setMinus(JButton minus) {
		this.minus = minus;
	}

	public JButton getMultiplication() {
		return multiplication;
	}

	public void setMultiplication(JButton multiplication) {
		this.multiplication = multiplication;
	}

	public JTextField getResult() {
		return result;
	}

	public void setResult(JTextField result) {
		this.result = result;
	}

}
