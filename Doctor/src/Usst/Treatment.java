package Usst;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;

public class Treatment extends JFrame {
    static Case c1,c2;
	private JPanel contentPane;
	private JTextField med_na1;
	private JTextField med_num1;
	private JTextField fee_na1;
	private JTextField fee_num1;
	private JTextField med_na2;
	private JTextField med_num2;
	private JTextField fee_num2;
	private JTextField fee_na2;
	private JTextField med_num3;
	private JTextField med_na3;
	private JTextField med_na4;
	private JTextField med_num4;
	private JTextField fee_na3;
	private JTextField fee_num3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		
		Socket server=null;
		try {
			server =new Socket("127.0.0",2303);
			
			ObjectInputStream in=new 
					ObjectInputStream(server.getInputStream());
			
			
			ObjectOutputStream out =new 
					ObjectOutputStream(server.getOutputStream());
		  
			Case cc=new Drug
		  c2=(Case)out.writeObject();
		    try {
				c1=(Case)in.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
		
		
		
		
		
		
		
		
		
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	
		
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Treatment frame = new Treatment();
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
	public Treatment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 545, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel label = new JLabel("\u533B\u751F\u5C31\u8BCA\u5212\u4EF7\u7AEF");
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label_1 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C11\u62FC\u97F3\u7801");
		panel_1.add(label_1);
		
		med_na1 = new JTextField();
		panel_1.add(med_na1);
		med_na1.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C11\u7684\u6570\u91CF");
		panel_1.add(label_2);
		
		med_num1 = new JTextField();
		panel_1.add(med_num1);
		med_num1.setColumns(10);
		
		JLabel label_5 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C12\u62FC\u97F3\u7801");
		panel_1.add(label_5);
		
		med_na2 = new JTextField();
		panel_1.add(med_na2);
		med_na2.setColumns(10);
		
		JLabel label_6 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C12\u7684\u6570\u91CF");
		panel_1.add(label_6);
		
		med_num2 = new JTextField();
		panel_1.add(med_num2);
		med_num2.setColumns(10);
		
		JLabel label_10 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C13\u62FC\u97F3\u7801");
		panel_1.add(label_10);
		
		med_na3 = new JTextField();
		med_na3.setColumns(10);
		panel_1.add(med_na3);
		
		JLabel label_9 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C13\u7684\u6570\u91CF");
		panel_1.add(label_9);
		
		med_num3 = new JTextField();
		med_num3.setColumns(10);
		panel_1.add(med_num3);
		
		JLabel label_11 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C14\u62FC\u97F3\u7801");
		panel_1.add(label_11);
		
		med_na4 = new JTextField();
		med_na4.setColumns(10);
		panel_1.add(med_na4);
		
		JLabel label_12 = new JLabel("\u8BF7\u8F93\u5165\u836F\u54C14\u7684\u6570\u91CF");
		panel_1.add(label_12);
		
		med_num4 = new JTextField();
		med_num4.setColumns(10);
		panel_1.add(med_num4);
		
		JLabel label_3 = new JLabel("\u8BF7\u8F93\u5165\u6536\u8D39\u9879\u76EE1");
		panel_1.add(label_3);
		
		fee_na1 = new JTextField();
		panel_1.add(fee_na1);
		fee_na1.setColumns(10);
		
		JLabel label_4 = new JLabel("\u8BF7\u8F93\u5165\u6536\u8D39\u9879\u76EE1\u7684\u6570\u91CF");
		panel_1.add(label_4);
		
		fee_num1 = new JTextField();
		panel_1.add(fee_num1);
		fee_num1.setColumns(10);
		
		JLabel label_8 = new JLabel("\u8BF7\u8F93\u5165\u6536\u8D39\u9879\u76EE2");
		panel_1.add(label_8);
		
		fee_na2 = new JTextField();
		fee_na2.setColumns(10);
		panel_1.add(fee_na2);
		
		JLabel label_7 = new JLabel("\u8BF7\u8F93\u5165\u6536\u8D39\u9879\u76EE2\u7684\u6570\u91CF");
		panel_1.add(label_7);
		
		fee_num2 = new JTextField();
		fee_num2.setColumns(10);
		panel_1.add(fee_num2);
		
		JLabel label_13 = new JLabel("\u8BF7\u8F93\u5165\u6536\u8D39\u9879\u76EE3");
		panel_1.add(label_13);
		
		fee_na3 = new JTextField();
		fee_na3.setColumns(10);
		panel_1.add(fee_na3);
		
		JLabel label_14 = new JLabel("\u8BF7\u8F93\u5165\u6536\u8D39\u9879\u76EE3\u7684\u6570\u91CF");
		panel_1.add(label_14);
		
		fee_num3 = new JTextField();
		fee_num3.setColumns(10);
		panel_1.add(fee_num3);
		
		JButton button_1 = new JButton("\u67E5\u770B\u75C5\u4EBA\u60C5\u51B5");
		panel_1.add(button_1);
		ButtonHandler0 btnHandler1=new ButtonHandler0();
		button_1.addActionListener(btnHandler1);
		
		
		
		
		
		JButton button = new JButton("\u786E\u5B9A\u53D1\u9001");
		panel_1.add(button);
	    ButtonHandler1 btnHandler=new ButtonHandler1();
		button.addActionListener(btnHandler);
		
		
		
		
	}
	
	class ButtonHandler0 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JFrame frm1;
		    frm1=new JFrame();
			   JLabel lb1,lb2,lb22,lb3,lb33,lb4,lb44,lb5,lb55;
			   JPanel j1,j2,j3;
			    
				j1=new JPanel();
				j2=new JPanel();
				j3=new JPanel();
				
				frm1.getContentPane().add(j1, BorderLayout.NORTH);
				frm1.getContentPane().add(j2, BorderLayout.CENTER);
				j2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				lb1=new JLabel("���˵���Ϣ��  ");  
				j1.add(lb1);
				
				 lb22=new JLabel("  �������֣�  ");
				    j2.add(lb22);
				
			    lb2=new JLabel(c1.getPi().getName());
			    j2.add(lb2);
			    
			    
			    lb33=new JLabel(" ���˵绰���룺 ")	;
			    j2.add(lb33);
			    lb3=new JLabel(c1.getPi().getTel())	;
			    j2.add(lb3);
			    
			    lb44=new JLabel(" �������䣺 ");
			    j2.add(lb44);
			    
			    lb4=new JLabel(String.valueOf(c1.getPi().getYears()));
			    j2.add(lb4);
			    
			    lb55=new JLabel(" ���˵��Ա� ")	;
			    j2.add(lb55);
			    if(c1.getPi().isSex()){
			    lb3=new JLabel("��")	;
			    j2.add(lb3);}
			    else {
			    	 lb3=new JLabel("Ů");
					    j2.add(lb3);
			    }
			    
				
				
			    
			    
			    
			    
			    frm1.setBounds(600, 400, 200, 90);//���ó����С
				frm1.setVisible(true);//��ʾ
		}
		
	}
	
	
	
	
	
	class ButtonHandler1 implements ActionListener{
    //���Ͱ�ť���¼�������
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("jinru");
			JFrame frm2;
		    frm2=new JFrame();
			   JLabel lb1;
			   JPanel j1;
			    
				j1=new JPanel();
				frm2.getContentPane().add(j1, BorderLayout.NORTH);
				
				lb1=new JLabel("�Ѿ��������շѶ˺�ҩ����");  
			
			    j1.add(lb1);
			    frm2.setBounds(600, 400, 200, 90);//���ó����С
				  frm2.setVisible(true);//��ʾ
		}
		
	}
	
	


}
