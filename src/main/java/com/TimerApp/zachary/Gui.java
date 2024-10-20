package com.TimerApp.zachary;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Gui {
	public Gui() {
		// Set the frame
		JFrame frame = new JFrame("Timer");

		// Create an Hello World label
		JLabel testLabel = new JLabel("Hello World!", JLabel.CENTER);

		// Create the Buttons
		JButton StartButton = new JButton("Start");
		JButton StopButton = new JButton("Stop");

		// Create boders
		Border GreenBorder = BorderFactory.createLineBorder(Color.GREEN);
		Border BlackBorder = BorderFactory.createLineBorder(Color.BLACK);

		// Create buttons panel
		JPanel ButtonsPanel = new JPanel();
		ButtonsPanel.setLayout(new FlowLayout());
		ButtonsPanel.add(StartButton);
		ButtonsPanel.add(StopButton);

		// Create the text panel
		JPanel TextPanel = new JPanel();
		TextPanel.setLayout(new BorderLayout());
		TextPanel.add(testLabel, BorderLayout.CENTER);
		// TextPanel.setBorder(BlackBorder);

		// Create MainPanel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(ButtonsPanel, BorderLayout.SOUTH);
		mainPanel.add(TextPanel, BorderLayout.NORTH);

		// Set the frame
		frame.add(mainPanel);
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setMinimumSize(new Dimension(500, 400));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}
}
