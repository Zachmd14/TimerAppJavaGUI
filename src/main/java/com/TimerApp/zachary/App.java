package com.TimerApp.zachary;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App {
	public static void main(String[] args) {

		// Create an instance of TimerApp to display the GUI
		SwingUtilities.invokeLater(Gui::new);
	}
}
