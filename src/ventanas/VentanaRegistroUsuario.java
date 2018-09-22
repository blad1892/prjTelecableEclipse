package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;

public class VentanaRegistroUsuario extends JFrame{
	private JTextField txtNombreUsuario;
	private JPasswordField txtContracena;
	private JPasswordField txtConfContracena;
    private static VentanaLogin ventanLogin;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistroUsuario frame = new VentanaRegistroUsuario(ventanLogin,true);
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
	
	
	public VentanaRegistroUsuario(VentanaLogin ventLogin,boolean modal) {
//	    super(ventLogin,modal);
		setBackground(UIManager.getColor("CheckBox.background"));
		getContentPane().setBackground(new Color(245, 245, 245));
		setBounds(350, 120, 498, 267);
		setTitle("Registro");
		getContentPane().setForeground(SystemColor.controlLtHighlight);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Confirmar Contrace\u00F1a:");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNewLabel.setBounds(86, 138, 146, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resgistro");
		lblNewLabel_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(186, 32, 89, 30);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		lblNombre.setBounds(86, 77, 59, 14);
		getContentPane().add(lblNombre);
		
		JButton btnRegistrar = new JButton("Registrarse");
		btnRegistrar.setBackground(new Color(0, 128, 0));
		btnRegistrar.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		btnRegistrar.setBounds(281, 178, 114, 24);
		getContentPane().add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(new Color(0, 0, 0));
		btnCancelar.setBackground(new Color(204, 0, 0));
		btnCancelar.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		btnCancelar.setBounds(101, 178, 104, 23);
		getContentPane().add(btnCancelar);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 14));
		txtNombreUsuario.setBounds(145, 73, 170, 20);
		txtNombreUsuario.setFocusable(true);
		getContentPane().add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		txtContracena = new JPasswordField();
		txtContracena.setBounds(166, 107, 162, 20);
		getContentPane().add(txtContracena);
		
		txtConfContracena = new JPasswordField();
		txtConfContracena.setBounds(233, 132, 162, 20);
		getContentPane().add(txtConfContracena);
		
		JLabel label = new JLabel("Contrace\u00F1a:");
		label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 14));
		label.setBounds(86, 113, 89, 14);
		getContentPane().add(label);
		
		
		
  	}
}
