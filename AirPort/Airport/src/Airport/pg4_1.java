package Airport;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class pg4_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pg4_1 frame = new pg4_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//public 
	/**
	 * Create the frame.
	 */
	public pg4_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("번 게이트");
		lblNewLabel_2.setBounds(250, 88, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("항공편명을 입력하여 주십시오.");
		lblNewLabel.setBounds(12, 35, 174, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(12, 60, 174, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("항공편 조회");
		btnNewButton.setBounds(41, 169, 97, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("지도 및 조회 결과");
		lblNewLabel_1.setBounds(273, 63, 105, 15);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(236, 60, 168, 158);
		contentPane.add(textArea);
		
		JButton btnNewButton_1 = new JButton("홈으로 돌아가기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KioskMain main = new KioskMain();
				main.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(301, 10, 121, 23);
		contentPane.add(btnNewButton_1);
		
	
	}
}
