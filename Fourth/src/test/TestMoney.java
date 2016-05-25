package test;

import gui.MoneyLayout;

public class TestMoney {

	public static void main(String[] args) {
		
		MoneyLayout frame = new MoneyLayout();
		
		frame.setTitle("Conversor euros - pesetas");
		frame.setSize(400, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(MoneyLayout.EXIT_ON_CLOSE);

	}

}
