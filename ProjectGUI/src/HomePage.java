import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("UserLogin");
		btnNewButton.setBounds(160, 73, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("HR SYSTEM");
		lblNewLabel.setBounds(180, 28, 112, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("AdminLogin");
		btnNewButton_1.setBounds(160, 129, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.setBounds(160, 188, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
