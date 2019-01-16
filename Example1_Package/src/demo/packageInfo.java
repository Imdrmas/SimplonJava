package demo;




import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class packageInfo {
	
	public static void main(String[] args) {
		
		MaFenetre maFenetre = new MaFenetre();
		maFenetre.afficher();
		maFenetre.afficher("Hello La Promo Simplon Java");
		
	}

}


class MaFenetre{
	JFrame jFrame = null;
	public MaFenetre () {
		jFrame = new JFrame();
		jFrame.setTitle("Mon Application");
		jFrame.getContentPane().setBackground(Color.BLUE);
		jFrame.addWindowListener(new WindowAdapter() {
			/*
			class monAutreClass{
				public void afficher(String message) {
					System.out.println(message);
				}
			}
			*/	
			@SuppressWarnings("unused")
			public void widowCloseing(WindowEvent ev) {
				System.exit(0);
			}
		});
		jFrame.setSize(1300, 1000);
	}
	public void afficher() {
		jFrame.setVisible(true);
		JLabel jLabel = new JLabel("   Bienvenue dans ma première applcation !");
		jLabel.setFont(new Font("arile", Font.BOLD, 50));
		jLabel.setForeground(Color.white);

				
		jFrame.add(jLabel);

	}
	
	public void afficher(String message) {
		System.out.println(message);
	}
	
}
