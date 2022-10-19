import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddProduct extends JFrame {

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
					AddProduct frame = new AddProduct();
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
	public AddProduct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AddProduct");
		lblNewLabel.setBounds(168, 41, 102, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ProductId");
		lblNewLabel_1.setBounds(35, 99, 81, 19);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(168, 98, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ProductName");
		lblNewLabel_2.setBounds(35, 172, 81, 19);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 171, 128, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ProductP");
		lblNewLabel_3.setBounds(35, 236, 81, 19);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(168, 235, 128, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("AddProduct");
		btnNewButton.setBounds(27, 310, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ViewProduct");
		btnNewButton_1.setBounds(168, 310, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Updated");
		btnNewButton_2.setBounds(297, 310, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setBounds(335, 254, 89, 23);
		contentPane.add(btnNewButton_3);
	}

}
