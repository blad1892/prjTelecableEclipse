package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import img.LogoInicio;
import repositorio.ConexionDB;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;

public class VentInicio extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
//					Window frame = new VentInicio();
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}		
		});
	}
	

	public VentInicio() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 190, 973, 200);
		contentPane = new LogoInicio("fondoTelecable.png");
		contentPane.setSize(new Dimension(3008, 840));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.setUndecorated(true);
        
        this.setBackground(new Color(0,0,0,0));
        
        //Ventana1.this.setOpacity(0.6f);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("V 1.0");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
		lblNewLabel.setBounds(810, 165, 65, 24);
		contentPane.add(lblNewLabel);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
