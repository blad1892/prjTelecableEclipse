package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import img.LogoInicio;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class VentanaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContracena;
	private static VentanaLogin frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				VentInicio vent=new VentInicio();
				vent.dispose();
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param modal 
	 * @param ventLogin 
	 * @param modal 
	 * @param ventLogin 
	 */
	public VentanaLogin() {
		
		setTitle("Iniciar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 120, 564, 406);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel logo = new LogoInicio("fondoTelecable.png");
		logo.setBounds(58, 55, 432, 107);
		contentPane.add(logo);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel.setBounds(153, 211, 81, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrace\u00F1a:");
		lblNewLabel_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(153, 247, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		txtUsuario.setBounds(214, 209, 155, 17);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContracena = new JPasswordField();
		txtContracena.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 16));
		txtContracena.setBounds(239, 245, 175, 17);
		contentPane.add(txtContracena);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIniciar.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		btnIniciar.setBounds(342, 296, 99, 36);
		contentPane.add(btnIniciar);
		
		JLabel lblRegistrarce = new JLabel("Registrarce");
		
		
		lblRegistrarce.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				VentanaRegistroUsuario ventRegistro=new VentanaRegistroUsuario(frame,true);
				ventRegistro.setVisible(true);
			}
			
		});
			
		lblRegistrarce.setForeground(new Color(0, 0, 139));
		lblRegistrarce.setBackground(new Color(0, 0, 255));
		lblRegistrarce.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblRegistrarce.setBounds(142, 302, 92, 25);
		contentPane.add(lblRegistrarce);
	}

	
}
