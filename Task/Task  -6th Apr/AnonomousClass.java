package New;

import java.awt.*;
import java.awt.event.*;

public class AnonomousClass {
	private Frame f;

	public AnonomousClass() {
		f = new Frame("Hello .....!");
	}

	public void launchFrame() {
		f.setSize(170, 170);
		f.setBackground(Color.orange);
		f.setVisible(true);
		// Add a window listener

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		}); // Anonymous Inner Classes

	}

	public static void main(String args[]) {
		AnonomousClass f = new AnonomousClass();
		f.launchFrame();
	}
}
