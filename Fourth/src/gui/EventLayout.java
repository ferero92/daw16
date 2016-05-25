package gui;

import java.awt.*;
import javax.swing.*;
import listeners.EventListener;

public class EventLayout extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JTextField txt;
	private JButton ok;
	private JButton cancel;

	public EventLayout(){
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 20));
		
		this.txt = new JTextField(8);
		this.ok = new JButton("OK");
		this.cancel = new JButton("Cancel");
		
		JPanel p1 = new JPanel();
		
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
		p1.add(ok);
		p1.add(cancel);		
		
		this.ok.addActionListener(new EventListener(this.txt, this.ok));
		this.cancel.addActionListener(new EventListener(this.txt, this.cancel));
		
		this.add(p1);
		this.add(this.txt);
		
	}
		
}
