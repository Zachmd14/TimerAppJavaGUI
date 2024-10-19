package com.TimerApp.zachary;

import javax.swing.*;

public class App {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JLabel testLabel = new JLabel();
		testLabel.setText("Hello World");
		frame.add(testLabel);

	}
}
