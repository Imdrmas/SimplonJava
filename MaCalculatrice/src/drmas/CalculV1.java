package drmas;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculV1 {
	
	MoveRect mainPanel=new MoveRect();	
	JFrame mafenetre = new JFrame("Ma Calulatrice");

	JLabel lbl1=new JLabel("Number 1");
	JLabel lbl2=new JLabel("Number 2");
	JLabel lblRes=new JLabel("Result");
	
	JTextField txt1=new JTextField(10);
	JTextField txt2=new JTextField(10);
	
	JButton btn1=new JButton("+");
	JButton btn2=new JButton("-");
	JButton btn3=new JButton("*");
	JButton btn4=new JButton("/");
	
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();
	
	public void graphique() {
		
		lbl1.setFont(lbl1.getFont().deriveFont(40.0f));
		mafenetre.getContentPane().add(lbl1);
		mafenetre.pack();
		
		lbl2.setFont(lbl2.getFont().deriveFont(40.0f));
		mafenetre.getContentPane().add(lbl2);
		mafenetre.pack();

		
		/*
		this.panel1.add(lbl1);
		panel1.add(txt1);
		panel1.add(lbl2);
		panel1.add(txt2);
		
		panel2.add(btn1);
		panel2.add(btn2);
		panel2.add(btn3);
		panel2.add(btn4);
		
		panel3.add(lblRes);
		
		mafenetre.add(btn1,BorderLayout.NORTH);
		mafenetre.add(btn2,BorderLayout.CENTER);
		mafenetre.add(btn3,BorderLayout.SOUTH);
		mafenetre.add(btn4,BorderLayout.EAST);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RunCalcu c=new RunCalcu();
				String val1= txt1.getText();
				String val2= txt2.getText();
				
				int iVal1 = Integer.parseInt(val1);
				int iVal2 = Integer.parseInt(val2);
				int res = c.addition(iVal1, iVal2);
				
				lblRes.setText("Resultat="+res);
				
				
			}
			
		});
		*/
		
		mafenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mafenetre.getContentPane().add(mainPanel);
		mafenetre.pack();
		mafenetre.setLocationByPlatform(true);
		mafenetre.setVisible(true);
	}
	
	public static void main(String[] args) {
		CalculV1 VA = new CalculV1();
		VA.graphique();
	}

}
