
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.*;
public class studentManagementSystem{

	studentManagementSystem()
	{
		JFrame fr = new JFrame("Student Management System");
		JLabel name = new JLabel("Student Name : ");
		name.setBounds(50,50,100,30);
		JTextField tf1 = new JTextField();
		tf1.setBounds(200,50,150,30);
		JLabel id = new JLabel("Student Roll No : ");
		id.setBounds(50,100,100,30);
		JTextField tf2 = new JTextField();
		tf2.setBounds(200,100,150,30);
		JLabel grade = new JLabel("Student Grade : ");
		grade.setBounds(50,150,100,30);
		JTextField tf3 = new JTextField();
		tf3.setBounds(200,150,150,30);
		JLabel gender = new JLabel("Student Gender");
		gender.setBounds(50,200,100,30);
		JRadioButton r1=new JRadioButton("Male");    
		JRadioButton r2=new JRadioButton("Female");
		r1.setBounds(200,200,100,30);
		r2.setBounds(300,200,100,30);
		JLabel dob = new JLabel("Student DOB : ");
		dob.setBounds(50,250,100,30);
		JTextField tf4 = new JTextField();
		tf4.setBounds(200,250,150,30);
		JLabel phone = new JLabel("Student PHONE : ");
		phone.setBounds(50,300,100,30);
		JTextField tf5 = new JTextField();
		tf5.setBounds(200,300,150,30);
		JButton addbtn = new JButton("Add Student");
		addbtn.setBounds(50,350,150,30);
		JButton resetbtn = new JButton("Reset");
		resetbtn.setBounds(200,350,150,30);
		JTextField searchbar = new JTextField();
		searchbar.setBounds(50,400,200,30);
		JButton searchbtn = new JButton("Search");
		searchbtn.setBounds(250,400,100,30);
		
		JTextArea box = new JTextArea();
		box.setBounds(50,500,600,300);
		box.setLayout(new FlowLayout());
		box.insert("Student Details..",0);
		box.setFont(new Font("Serif",Font.PLAIN,20));
		addbtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				String Name = tf1.getText();
				String rollno = tf2.getText();
				String Grade = tf3.getText().toUpperCase();
				
				String DOB = tf4.getText();
				String Phone = tf5.getText();
				
				try {
				FileWriter fw = new FileWriter("Student Details.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(" ");
				bw.newLine();
				bw.append("Name : " + Name);
				bw.newLine();
				bw.append("Roll No : " + rollno);
				bw.newLine();
				bw.append("Grade : " + Grade);
				bw.newLine();
				if(r1.isSelected())
				{
					String Gender = "Male";
					bw.append("Gender : " + Gender);
					bw.newLine();
				}
				if(r2.isSelected())
				{
					String Gender = "Female";
					bw.append("Gender : " + Gender);
					bw.newLine();
				}
				bw.append("DOB : " + DOB);
				bw.newLine();
				bw.append("Phone : " + Phone);
				bw.newLine();
				bw.close();
				box.setLineWrap(true);
				box.setWrapStyleWord(true);
				box.append(" ");
				box.append("Name : " + Name + " ");
				box.append("Roll No : " + rollno + " ");
				box.append("Grade : " + Grade + " ");
				box.append("DOB : " + DOB + " ");
				box.append("Phone : " + Phone + " ");
				box.append(" ");
				}
				catch(Exception E)
				{
					System.out.println("Some Error Occured" + E);
				}
			}
		
		});
		
		resetbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
			}
	});
		
		fr.add(name);
		fr.add(tf1);
		fr.add(id);
		fr.add(tf2);
		fr.add(grade);
		fr.add(tf3);
		fr.add(gender);
		fr.add(r1);
		fr.add(r2);
		fr.add(dob);
		fr.add(tf4);
		fr.add(phone);
		fr.add(tf5);
		fr.add(addbtn);
		fr.add(resetbtn);
		fr.add(searchbar);
		fr.add(searchbtn);
		fr.add(box);
		
		fr.setLayout(null);
		fr.setSize(1200,800);
		fr.setTitle("Student Management System.");
		fr.setVisible(true);
	}
	
	public static void main(String[] args) {
		new studentManagementSystem();
	}

}
