package com.TimerApp.zachary;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Gui {

	private JLabel TimeLabel; // Reference to the label
	private JButton startButton; // Reference to the start button
	private JButton stopButton; // Reference to the stop button

	public Gui() {
		// Set the frame
		JFrame frame = new JFrame("Timer");

		// Create an Hello World label
		TimeLabel = new JLabel("EMPTY TEXT", JLabel.CENTER);
		TimeLabel.setFont(TimeLabel.getFont().deriveFont(48f));

		// Create the Buttons
		startButton = new JButton("Start");
		stopButton = new JButton("Stop");

		// Create boders
		Border GreenBorder = BorderFactory.createLineBorder(Color.GREEN);
		Border BlackBorder = BorderFactory.createLineBorder(Color.BLACK);

		// Create buttons panel
		JPanel ButtonsPanel = new JPanel();
		ButtonsPanel.setLayout(new FlowLayout());
		ButtonsPanel.add(startButton);
		ButtonsPanel.add(stopButton);

		// Create the text panel
		JPanel TextPanel = new JPanel();
		TextPanel.setLayout(new BorderLayout());
		TextPanel.add(TimeLabel, BorderLayout.CENTER);
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

	public void setLabelText(String text) {
		TimeLabel.setText(text);
	}

}
