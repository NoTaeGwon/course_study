import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import javax.swing.table.*;
import javax.swing.border.*;

public class example extends JFrame {
	JFrame LoadingFrame;
	JPanel LoadingPanel;
	JPanel panel;
	JLabel LoadingLB;
	
	example(){
		UIManager.put("swing.boldMetal", Boolean.FALSE);
		LoadingFrame = new JFrame();
		LoadingFrame.setTitle("Now Starcraft Loading...");
		LoadingFrame.setBounds(250,120,700,700);
		LoadingFrame.setResizable(false);
		LoadingPanel = new JPanel(){ImageIcon i = new ImageIcon("img/A.jpg");	
    		public void paintComponent(Graphics g) {
    			g.drawImage(i.getImage(), 0, 0, 700, 700, null);
    		}
		};
		LoadingLB = new JLabel();
		LoadingLB.setOpaque(false);
		LoadingLB.setFont(new Font("Dialog.plain", 0, 14));
		LoadingLB.setHorizontalAlignment(SwingConstants.CENTER);
		LoadingLB.setForeground(new Color(200,200,238));
		LoadingLB.setBounds(310,570,60,15);
		LoadingPanel.add(LoadingLB);
		
		
		
		LoadingPanel.setLayout(null);
		LoadingFrame.getContentPane().add(LoadingPanel, BorderLayout.CENTER);
		LoadingFrame.setVisible(true);
		for(int i =0;i<4;i++){
			LoadingLB.setText("Loading");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LoadingLB.setText("");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		LoadingFrame.setVisible(false);
		setTitle("TribeSelection");
		setBounds(314, 202, 389, 382);
		this.setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = new JPanel(){ImageIcon i = new ImageIcon("img/2.png");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 389, 382, null);
			}
		};
		panel.setLayout(null);


		getContentPane().add(panel, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		example start = new example();
		start.setVisible(true);
	}
}