import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentRecordSystem {

	private JFrame frame;
	private JTextField stdName;
	private JTextField stdRollNo;
	private JTextField stdSection;
	private JTextField stdProgram;
	private JTextField stdYear;
	private JTextField stdThesis;
	private JTextField stdSupervisor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecordSystem window = new StudentRecordSystem();
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
	public StudentRecordSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Record System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(162, 11, 195, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setBounds(79, 68, 131, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Roll Number");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(130, 106, 80, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Section");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(130, 137, 80, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		stdName = new JTextField();
		stdName.setBounds(240, 65, 117, 20);
		frame.getContentPane().add(stdName);
		stdName.setColumns(10);
		
		stdRollNo = new JTextField();
		stdRollNo.setColumns(10);
		stdRollNo.setBounds(240, 103, 117, 20);
		frame.getContentPane().add(stdRollNo);
		
		stdSection = new JTextField();
		stdSection.setColumns(10);
		stdSection.setBounds(240, 134, 117, 20);
		frame.getContentPane().add(stdSection);
		
		JLabel lblNewLabel_2 = new JLabel("UnderGraduate Students");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 188, 171, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Graduate Students");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(302, 188, 171, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Program Name");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 234, 94, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Year");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(10, 259, 94, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		stdProgram = new JTextField();
		stdProgram.setBounds(114, 231, 96, 20);
		frame.getContentPane().add(stdProgram);
		stdProgram.setColumns(10);
		
		stdYear = new JTextField();
		stdYear.setColumns(10);
		stdYear.setBounds(114, 259, 96, 20);
		frame.getContentPane().add(stdYear);
		
		JLabel lblNewLabel_3_2 = new JLabel("Thesis Title");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(263, 231, 94, 14);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Supervisor");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setBounds(263, 259, 94, 14);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		stdThesis = new JTextField();
		stdThesis.setBounds(350, 231, 107, 20);
		frame.getContentPane().add(stdThesis);
		stdThesis.setColumns(10);
		
		stdSupervisor = new JTextField();
		stdSupervisor.setColumns(10);
		stdSupervisor.setBounds(350, 256, 107, 20);
		frame.getContentPane().add(stdSupervisor);
		
		
		//Adding A Graduate Student Record To File
		JButton addUndergraduate = new JButton("Add Student ");
		addUndergraduate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = stdName.getText().toString();
				int rollNo = Integer.parseInt(stdRollNo.getText().toString());
				String section = stdSection.getText().toString();
				String program = stdProgram.getText().toString();
				int year = Integer.parseInt(stdYear.getText().toString());
				
				//Instantiating an undergraduate stuent object
				UndergraduateStudent student = new UndergraduateStudent(name, rollNo, section, program, year);
				String studentRecord = student.toString();
				
				writeRecordToFile(studentRecord);
			}
		});
		
		addUndergraduate.setBounds(58, 323, 123, 23);
		frame.getContentPane().add(addUndergraduate);
		
		JButton addGraduate = new JButton("Add Student ");
		addGraduate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = stdName.getText().toString();
				int rollNo = Integer.parseInt(stdRollNo.getText().toString());
				String section = stdSection.getText().toString();
				String thesis = stdThesis.getText().toString();
				String supervisor = stdSupervisor.getText().toString();
				
				//Instantiating an undergraduate stuent object
				GraduateStudent student = new GraduateStudent(name, rollNo, section, thesis, supervisor);
				String studentRecord = student.toString();
				
				writeRecordToFile(studentRecord);
			}
		});
		
		addGraduate.setBounds(328, 323, 123, 23);
		frame.getContentPane().add(addGraduate);
	}
	
	public void writeRecordToFile(String record)
	{
		  try {
	            FileWriter writer = new FileWriter("D://RecordsFile.csv", true);
	            writer.write(record);
	            
	            JOptionPane.showMessageDialog(frame,"Student Record has been stored in csv file.");  
	           
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
