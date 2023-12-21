package by.morphey.password_generator.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener {

	JButton button;
	JTextField textField;
	JComboBox comboBox;
	JLabel label;

	final int WIDTH = 350;
	final int HEIGHT = 200;
	final String[] SIZE = { "--", "10", "12", "14", "16", "18" };

	public Window() {
		this.setTitle("Password Generator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setLayout(null);
		this.setLocationRelativeTo(null);

		textField = new JTextField();
		button = new JButton("Generate");
		comboBox = new JComboBox(SIZE);
		label = new JLabel("Password size");

		button.setFont(new Font("Serif", Font.PLAIN, 12));
		button.setBounds(WIDTH - 100, 20, 100, 30);
		textField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
		textField.setBounds(5, 20, WIDTH - 105, 30);
		textField.setFont(new Font("HelveticaNeue", Font.BOLD, 14));
		textField.setBackground(Color.darkGray);
		textField.setForeground(Color.GREEN);
		comboBox.setBounds(120, 55, 60, 20);
		label.setFont(new Font("Serif", Font.PLAIN, 14));
		label.setBounds(10, 55, 100, 20);

		this.add(textField);
		this.add(button);
		this.add(comboBox);
		this.add(label);

		comboBox.addActionListener(this);
		button.addActionListener(this);

		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			if (!comboBox.getSelectedItem().equals("--"))
				textField.setText(Logic.randomizer(Integer.parseInt((String) comboBox.getSelectedItem())));
			else
				textField.setText("");
		}
	}

}
