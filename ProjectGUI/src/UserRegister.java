import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UserRegister extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegister frame = new UserRegister();
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
	public UserRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserRegister");
		lblNewLabel.setBounds(173, 28, 111, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserId");
		lblNewLabel_1.setBounds(37, 75, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(133, 72, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("UserName");
		lblNewLabel_2.setBounds(37, 135, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 132, 151, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("EmailId");
		lblNewLabel_3.setBounds(37, 192, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(133, 189, 151, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(74, 266, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Updated");
		btnNewButton_1.setBounds(226, 266, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
