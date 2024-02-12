package calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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

	private BigDecimal first;
	private BigDecimal second;
	private BigDecimal result;
	private String operation;
	private String answer;
	private JTextField textField_1;

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
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(10, 35, 264, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(10, 156, 60, 60);
		frame.getContentPane().add(btn7);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn4.setBounds(10, 222, 60, 60);
		frame.getContentPane().add(btn4);

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn1.setBounds(10, 288, 60, 60);
		frame.getContentPane().add(btn1);

		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn8.setBounds(75, 156, 60, 60);
		frame.getContentPane().add(btn8);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn5.setBounds(75, 222, 60, 60);
		frame.getContentPane().add(btn5);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn2.setBounds(75, 288, 60, 60);
		frame.getContentPane().add(btn2);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn9.setBounds(140, 156, 60, 60);
		frame.getContentPane().add(btn9);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn6.setBounds(140, 222, 60, 60);
		frame.getContentPane().add(btn6);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn3.setBounds(140, 288, 60, 60);
		frame.getContentPane().add(btn3);

		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn0.setBounds(10, 354, 60, 60);
		frame.getContentPane().add(btn0);

		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Rockwell", Font.BOLD, 18));
		btn00.setBounds(75, 354, 60, 60);
		frame.getContentPane().add(btn00);

		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnDot.setBounds(140, 354, 60, 60);
		frame.getContentPane().add(btnDot);

		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = new BigDecimal(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMultiply.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnMultiply.setBounds(214, 156, 60, 60);
		frame.getContentPane().add(btnMultiply);

		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = new BigDecimal(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnMinus.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnMinus.setBounds(214, 222, 60, 60);
		frame.getContentPane().add(btnMinus);

		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = new BigDecimal(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnPlus.setBounds(214, 288, 60, 60);
		frame.getContentPane().add(btnPlus);

		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = new BigDecimal(textField.getText());
				if (operation == "+") {
					result = first.add(second);
					textField.setText(result.toString());
				} else if (operation == "-") {
					result = first.subtract(second);
					textField.setText(result.toString());
				} else if (operation == "/") {
					try {
						result = first.divide(second);
					} catch (ArithmeticException ex) {
						result = first.divide(second, 20, RoundingMode.HALF_UP);
					}
					textField.setText(result.toString());
				} else if (operation == "*") {
					result = first.multiply(second);
					textField.setText(result.toString());
				} else if (operation == "%") {
					result = first.multiply(second.divide(new BigDecimal("100")));
					textField.setText(result.toString());
				}
			}
		});
		btnEquals.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnEquals.setBounds(214, 354, 60, 60);
		frame.getContentPane().add(btnEquals);

		btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newText = "";
				int textLength = textField.getText().length();

				if (textLength > 0) {
					StringBuilder builder = new StringBuilder(textField.getText());
					builder.deleteCharAt(textLength - 1);
					newText = builder.toString();
					textField.setText(newText);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 14));
		btnBackspace.setBounds(10, 90, 60, 60);
		frame.getContentPane().add(btnBackspace);

		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnClear.setBounds(75, 90, 60, 60);
		frame.getContentPane().add(btnClear);

		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = new BigDecimal(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnPercent.setBounds(140, 90, 60, 60);
		frame.getContentPane().add(btnPercent);

		btnDevide = new JButton("/");
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = new BigDecimal(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDevide.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnDevide.setBounds(214, 89, 60, 60);
		frame.getContentPane().add(btnDevide);

		textField_1 = new JTextField();
		textField_1.setBounds(10, 11, 264, 27);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
