package Airport;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import j_jtable.JTableTest.MyTableModel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class pg3_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pg3_1 frame = new pg3_1();
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
	public pg3_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("출발지를 입력해 주십시오.");
		lblNewLabel.setBounds(26, 57, 153, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("도착지를 입력해 주십시오.");
		lblNewLabel_1.setBounds(254, 57, 144, 15);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(36, 82, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(266, 82, 116, 21);
		contentPane.add(textField_1);
		
		
		
		JButton btnNewButton = new JButton("항공편 조회");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton.setBounds(158, 129, 97, 23);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(36, 184, 365, 67);
		contentPane.add(table);
		
		//JTable에 마우스 이벤트
		table.addMouseListener(new MouseAdapter(){	
				public void mouseClicked(MouseEvent arg0) {
					int r = table.getSelectedRow();
					int c = table.getSelectedColumn();
					System.out.println(r+":"+c);	//일단 예시
				}
			});
		
		btnNewButton_1 = new JButton("홈으로 돌아가기");
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
