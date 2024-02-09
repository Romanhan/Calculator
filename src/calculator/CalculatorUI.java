package calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculatorUI {

	private JFrame frame;
	private JTextField textField;
	private JButton btn4;
	private JButton btn1;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btn0;
	private JButton btn00;
	private JButton btnDot;
	private JButton btnMultiply;
	private JButton btnMinus;
	private JButton btnPlus;
	private JButton btnEquals;
	private JButton btnBackspace;
	private JButton btnClear;
	private JButton btnPercent;
	private JButton btnDevide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUI window = new CalculatorUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 300, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(10, 11, 264, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(10, 156, 60, 60);
		frame.getContentPane().add(btn7);

		btn4 = new JButton("4");
		btn4.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn4.setBounds(10, 222, 60, 60);
		frame.getContentPane().add(btn4);

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText();
			}
		});
		btn1.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn1.setBounds(10, 288, 60, 60);
		frame.getContentPane().add(btn1);

		btn8 = new JButton("8");
		btn8.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn8.setBounds(75, 156, 60, 60);
		frame.getContentPane().add(btn8);

		btn5 = new JButton("5");
		btn5.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn5.setBounds(75, 222, 60, 60);
		frame.getContentPane().add(btn5);

		btn2 = new JButton("2");
		btn2.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn2.setBounds(75, 288, 60, 60);
		frame.getContentPane().add(btn2);

		btn9 = new JButton("9");
		btn9.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn9.setBounds(140, 156, 60, 60);
		frame.getContentPane().add(btn9);

		btn6 = new JButton("6");
		btn6.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn6.setBounds(140, 222, 60, 60);
		frame.getContentPane().add(btn6);

		btn3 = new JButton("3");
		btn3.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn3.setBounds(140, 288, 60, 60);
		frame.getContentPane().add(btn3);

		btn0 = new JButton("0");
		btn0.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn0.setBounds(10, 354, 60, 60);
		frame.getContentPane().add(btn0);

		btn00 = new JButton("00");
		btn00.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn00.setBounds(75, 354, 60, 60);
		frame.getContentPane().add(btn00);

		btnDot = new JButton(".");
		btnDot.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnDot.setBounds(140, 354, 60, 60);
		frame.getContentPane().add(btnDot);

		btnMultiply = new JButton("*");
		btnMultiply.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnMultiply.setBounds(210, 156, 60, 60);
		frame.getContentPane().add(btnMultiply);

		btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnMinus.setBounds(210, 222, 60, 60);
		frame.getContentPane().add(btnMinus);

		btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnPlus.setBounds(210, 288, 60, 60);
		frame.getContentPane().add(btnPlus);

		btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnEquals.setBounds(210, 354, 60, 60);
		frame.getContentPane().add(btnEquals);

		btnBackspace = new JButton("CE");
		btnBackspace.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnBackspace.setBounds(10, 90, 60, 60);
		frame.getContentPane().add(btnBackspace);

		btnClear = new JButton("C");
		btnClear.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnClear.setBounds(75, 90, 60, 60);
		frame.getContentPane().add(btnClear);

		btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnPercent.setBounds(140, 90, 60, 60);
		frame.getContentPane().add(btnPercent);

		btnDevide = new JButton("/");
		btnDevide.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnDevide.setBounds(210, 90, 60, 60);
		frame.getContentPane().add(btnDevide);
	}
}
