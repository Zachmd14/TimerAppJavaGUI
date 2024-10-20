package com.TimerApp.zachary;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {

	private static int[] timeValue = { 25 };
	public static volatile Timer timer;

	static Gui gui = new Gui();

	public static void startTimer() {
		timeValue[0] = 25;
		gui.setLabelText(String.valueOf(timeValue[0]));
		timer.start();
	}

	public static void main(String[] args) {

		timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (timeValue[0] > 0) {
					timeValue[0]--;
					gui.setLabelText(String.valueOf(timeValue[0]));
				} else {
					((Timer) e.getSource()).stop();
					gui.setLabelText("Timer ended");
				}
			}
		});
	}
}
