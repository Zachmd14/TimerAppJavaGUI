package com.TimerApp.zachary;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App {
	public static void main(String[] args) {

		Gui gui = new Gui();

		int time = 25;
		gui.setLabelText(String.valueOf(time));

	}
}
