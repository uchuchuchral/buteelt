package pro_dadlaga;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class teneg extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teneg frame = new teneg();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public teneg() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
