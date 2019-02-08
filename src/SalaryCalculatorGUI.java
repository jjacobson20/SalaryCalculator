/**
 * JFrame Salary Calculator
 * @author jeremy
 * Period 6
 *
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

//hourly rate
//hours weeks

public class SalaryCalculatorGUI 
{
	public static void main(String[] args)
	{
		//window
		JFrame window = new JFrame();
		window.setLayout(null);
		window.setBounds(300, 300, 600, 300);
		window.setTitle("Salary Calculator");
		
		//labels
		JLabel hourRate = new JLabel();
		JLabel hoursWeek = new JLabel();
		hourRate.setBounds(50, 50, 100, 30);
		hoursWeek.setBounds(50, 90, 100, 30);
		hourRate.setText("Hourly Rate");
		hoursWeek.setText("Hours/Week");
		
		//text fields
		JTextField rateText = new JTextField();
		JTextField weekText = new JTextField();
		rateText.setBounds(150, 50, 300, 30);
		weekText.setBounds(150, 90, 300, 30);
		
		
		//checkbox
		JCheckBox fullTimeCheck = new JCheckBox();
		fullTimeCheck.setBounds(90, 140, 100, 15);
		
		//button
		JButton calculate = new JButton();
		calculate.setText("Calculate Salary");
		calculate.setBounds(50, 170, 150, 50);
		
		
		window.add(hourRate);
		window.add(hoursWeek);
		window.add(rateText);
		window.add(weekText);
		window.add(calculate);
		window.add(fullTimeCheck);
		
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}
