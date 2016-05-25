package gui;

import java.awt.*;
import javax.swing.*;
import listeners.MoneyEvent;

public class MoneyLayout extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JTextField texto;
	private JLabel label;
	private JButton euro;
	private JButton ptas;
	
	public MoneyLayout(){
		this.setLayout(new GridLayout(3, 1));
		
		this.texto = new JTextField(8);
		this.label = new JLabel();
		this.euro = new JButton("a euros");
		this.ptas = new JButton("a pesetas");
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		p1.add(this.texto);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		p2.add(this.label);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		p3.add(this.euro);
		p3.add(this.ptas);
		
		this.euro.addActionListener(new MoneyEvent(this.texto, this.label, this.euro));
		this.ptas.addActionListener(new MoneyEvent(this.texto, this.label, this.ptas));
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
	}

}
