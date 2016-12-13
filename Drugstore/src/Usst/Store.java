package Usst;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;

public class Store extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Store frame = new Store();
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
	public Store() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u836F\u623F\u7AEF");
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_1 = new JLabel("\u836F\u54C11\u540D\u5B57\uFF1A ");
		panel_1.add(label_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_1.add(lblNewLabel);
		
		JLabel label_2 = new JLabel(" \u8BF7\u9009\u62E9\u836F\u54C11\u6570\u91CF\uFF1A");
		panel_1.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		panel_1.add(comboBox);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel_1.add(button);
		
		JLabel label_3 = new JLabel("\u836F\u54C12\u540D\u5B57\uFF1A ");
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel(" \u8BF7\u9009\u62E9\u836F\u54C12\u6570\u91CF\uFF1A");
		panel_1.add(label_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		panel_1.add(comboBox_1);
		
		JButton button_1 = new JButton("\u786E\u5B9A");
		panel_1.add(button_1);
		
		JLabel label_6 = new JLabel("\u836F\u54C13\u540D\u5B57\uFF1A ");
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel(" \u8BF7\u9009\u62E9\u836F\u54C13\u6570\u91CF\uFF1A");
		panel_1.add(label_8);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		panel_1.add(comboBox_2);
		
		JButton button_2 = new JButton("\u786E\u5B9A");
		panel_1.add(button_2);
		
		JLabel label_9 = new JLabel("\u836F\u54C14\u540D\u5B57\uFF1A ");
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("New label");
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel(" \u8BF7\u9009\u62E9\u836F\u54C14\u6570\u91CF\uFF1A");
		panel_1.add(label_11);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		panel_1.add(comboBox_3);
		
		JButton button_3 = new JButton("\u786E\u5B9A");
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("\u786E\u5B9A\u63D0\u53D6");
		panel_1.add(button_4);
	}

}
