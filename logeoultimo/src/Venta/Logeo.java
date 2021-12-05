package Venta;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Mantenimiento.getionUsu;
import clsprocye.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Logeo extends JFrame {

	private JPanel contentPane;
	private JTextField textusuario;
	private JPasswordField passContra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logeo frame = new Logeo();
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
	public Logeo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(148, 0, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Onyx", Font.PLAIN, 26));
		lblNewLabel.setBounds(31, 40, 76, 35);
		contentPane.add(lblNewLabel);
		
		textusuario = new JTextField();
		textusuario.setBounds(96, 43, 153, 28);
		contentPane.add(textusuario);
		textusuario.setColumns(10);
		
		passContra = new JPasswordField();
		passContra.setBounds(114, 112, 175, 33);
		contentPane.add(passContra);
		
		JLabel lblNewLabel_1 = new JLabel("Contrace\u00F1a");
		lblNewLabel_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1.setFont(new Font("Onyx", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(30, 112, 117, 35);
		contentPane.add(lblNewLabel_1);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Onyx", Font.PLAIN, 16));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Enter();
			}
		});
		btnEnter.setBounds(47, 209, 89, 23);
		contentPane.add(btnEnter);
		
		JButton btnNewButton = new JButton("Registral");
		btnNewButton.setFont(new Font("Onyx", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro reg = new registro();
				reg.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(160, 209, 89, 23);
		contentPane.add(btnNewButton);
	}

	protected void Enter() {
		String usuario = textusuario.getText();
		String Contraseña = String.valueOf(passContra.getPassword());
		getionUsu gestionUsuario = new getionUsu();
		
		Usuario usuario2 = new Usuario();
		usuario2.setUsuario(usuario);
		usuario2.setContraseña(Contraseña);
		principal prin = new principal();
		
		Usuario usu = gestionUsuario.obtenerUsuario(usuario2);
		
		if (usu != null) {
			JOptionPane.showMessageDialog(contentPane, "Bienvenido");
			prin.setVisible(true);
			this.dispose();
			
		 }else {
			 JOptionPane.showMessageDialog(contentPane,"Debe ingresar su usuario \r\n"
			 		+ "y contraseña, si no está registrado debe registrarse." ,"Error", JOptionPane.ERROR_MESSAGE);
		 }	
		

	}
}
