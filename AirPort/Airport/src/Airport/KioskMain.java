package Airport;

//주석 테스트
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class KioskMain extends JFrame {
	
	JPanel mainPanel;
	JButton searchByPass, searchByTicket, searchByAirplane, searchByGate, logobutton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KioskMain frame = new KioskMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end of 메인함수

	/**
	 * Create the frame.
	 */
	public KioskMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(null);

		// 버튼 크기 및 위치
		searchByPass = new JButton("여권번호로 예약 조회");
		searchByPass.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		searchByPass.setBackground(Color.WHITE);
		searchByPass.setBounds(75, 62, 160, 90);
		searchByPass.setContentAreaFilled(true);
		searchByPass.setRolloverIcon(new ImageIcon("src/Image/kosmo02.png"));
		mainPanel.add(searchByPass);

		searchByTicket = new JButton("티켓번호로 예약 조회");
		searchByTicket.setBackground(Color.WHITE);
		searchByTicket.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		searchByTicket.setBounds(293, 62, 160, 90);
		mainPanel.add(searchByTicket);

		searchByAirplane = new JButton("항공편 조회");
		searchByAirplane.setBackground(Color.WHITE);
		searchByAirplane.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		searchByAirplane.setBounds(75, 192, 160, 90);
		mainPanel.add(searchByAirplane);

		searchByGate = new JButton("게이트 조회");
		searchByGate.setBackground(Color.WHITE);
		searchByGate.setFont(new Font("한컴산뜻돋움", Font.BOLD, 14));
		searchByGate.setBounds(293, 192, 160, 90);
		mainPanel.add(searchByGate);

		logobutton = new JButton("", new ImageIcon("src/Image/kosmo02.png"));
		logobutton.setBackground(Color.WHITE);
		logobutton.setEnabled(false);
		logobutton.setBounds(336, 311, 186, 40);
		logobutton.setOpaque(false);	
		mainPanel.add(logobutton);

		// 버튼 이벤트 핸들러
		searchByPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "여권번호로 예약 조회");
				pg1_1 first = new pg1_1();
				first.setVisible(true);
			}
		});
		searchByTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "티켓번호로 예약 조회");
				pg2_1 second = new pg2_1();
				second.setVisible(true);
			}
		});
		searchByAirplane.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "항공편 조회");
				pg3_1 third = new pg3_1();
				third.setVisible(true);
			}
		});
		searchByGate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "게이트 조회");
				pg4_1 fourth = new pg4_1();
				fourth.setVisible(true);
			}
		});

	} // end of 생성자 함수

	protected void paintComponent(Graphics g) {                                                                                                          
		g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);

		super.paintComponents(g);
	}

	protected void paintBorder(Graphics g) {
		Graphics2D graphics = (Graphics2D) g;
		graphics.fillRoundRect(0, 0, getSize().width - 1, getSize().height - 1, 3, 3);
	}
	
	void decorate() {
		setBorderPainted(false);
		setOpaque(false);
	}

	private void setOpaque(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private void setBorderPainted(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	

}
