package zulfa.test;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class I18nTest {

	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle bundle=null;
		String sno=null,lsname=null,lsadd=null,cap1=null,cap2=null,cap3=null,cap4=null;
		JFrame frame=null;
		JLabel lno=null,lname=null,ladd=null;
		JTextField tno=null,tname=null,tadd=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		//create locale object
		locale=new Locale(args[0],args[1]);
	//locate the properties file
		bundle=ResourceBundle.getBundle("zulfa/commons/App",locale);
	
	//string labels by submitting keys
	sno=bundle.getString("sno.label");
	lsname=bundle.getString("sname.label");
	lsadd=bundle.getString("sadd.label");
	cap1=bundle.getString("btn1.label");
	cap2=bundle.getString("btn2.label");
	cap3=bundle.getString("btn3.label");
	cap4=bundle.getString("btn4.label");
	
	//create JFrame
	frame=new JFrame();
	frame.setLayout(new FlowLayout());
	frame.setSize(300,300);
	frame.setBackground(Color.DARK_GRAY);
	frame.setTitle("I18nTest App");
	lno=new JLabel();
	frame.add(lno);
	tno=new JTextField(10);
	frame.add(tno);
	
	lname=new JLabel();
	frame.add(lname);
	tname=new JTextField(10);
	frame.add(tname);
	
	ladd=new JLabel();
	frame.add(ladd);
	tadd=new JTextField(10);
	frame.add(tadd);
	
	btn1=new JButton(cap1);
	btn2=new JButton(cap2);
	btn3=new JButton(cap3);
	btn4=new JButton(cap4);
	
	frame.setVisible(true);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	
	
	}//main

}
