import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AdminLogin");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setBounds(166, 29, 91, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserId");
		lblNewLabel_1.setBounds(42, 83, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(132, 80, 125, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(42, 146, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 143, 125, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(85, 198, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setBounds(216, 198, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
