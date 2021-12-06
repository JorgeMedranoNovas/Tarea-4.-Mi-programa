package Venta;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;

import ConexionBD.ConexionDt;
import ConexionBD.Metodos_sql;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class Actualizar extends JFrame {

	ConexionDt con = new ConexionDt();

	Connection cn; 
	Statement st;
	Resultset rs;

	
	private JPanel contentPane;
	private JTextField textUsuario;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textNumero;
	private JTextField textCorreo;
	private JPasswordField passContra;
	private JPasswordField passConf;
	private JTextField textActualizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actualizar frame = new Actualizar();
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
	public Actualizar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 334);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 250, 250));
		contentPane.setBackground(new Color(148, 0, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setBounds(24, 28, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblContrasea.setForeground(new Color(255, 250, 250));
		lblContrasea.setBounds(24, 228, 81, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblNombre.setForeground(new Color(255, 250, 250));
		lblNombre.setBounds(24, 70, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblApellido.setForeground(new Color(255, 250, 250));
		lblApellido.setBounds(24, 107, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblNumeroTelefonico = new JLabel("Numero Telefonico");
		lblNumeroTelefonico.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblNumeroTelefonico.setForeground(new Color(255, 250, 250));
		lblNumeroTelefonico.setBounds(25, 152, 108, 14);
		contentPane.add(lblNumeroTelefonico);
		
		JLabel lblConfimacionDeContrasea = new JLabel("Confimacion de contrase\u00F1a");
		lblConfimacionDeContrasea.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblConfimacionDeContrasea.setForeground(new Color(255, 250, 250));
		lblConfimacionDeContrasea.setBounds(23, 266, 147, 14);
		contentPane.add(lblConfimacionDeContrasea);
		
		JLabel lblActualizar = new JLabel("Actualizar");
		lblActualizar.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblActualizar.setForeground(new Color(255, 250, 250));
		lblActualizar.setBounds(218, 31, 68, 14);
		contentPane.add(lblActualizar);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(69, 25, 86, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(69, 67, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(69, 104, 86, 20);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		textNumero = new JTextField();
		textNumero.setBounds(122, 149, 86, 20);
		contentPane.add(textNumero);
		textNumero.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Correo Eletronico");
		lblNewLabel_1.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1.setBounds(24, 192, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(122, 189, 138, 20);
		contentPane.add(textCorreo);
		textCorreo.setColumns(10);
		
		passContra = new JPasswordField();
		passContra.setBounds(102, 225, 158, 20);
		contentPane.add(passContra);
		
		passConf = new JPasswordField();
		passConf.setBounds(163, 263, 158, 20);
		contentPane.add(passConf);
		
		textActualizar = new JTextField();
		textActualizar.setBounds(278, 28, 130, 20);
		contentPane.add(textActualizar);
		textActualizar.setColumns(10);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setFont(new Font("Onyx", Font.PLAIN, 16));
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Metodos_sql ds = new Metodos_sql();
			String i =passContra.getText();
			String v = passContra.getText();
          String s="",s1="",s2="",s3="",s4="",s5="",s6="";
          if(textActualizar.getText().equals("")) {
        	  JOptionPane.showMessageDialog(null, "inserter el usuario que quieres que se actualize");  
          }else {
          if(textUsuario.getText().equals("")) {
        	s="Usauario";  
          }
			if(passContra.getText().equals("")) {
				s1=",Contraseña";
			}
			if(textNombre.getText().equals("")) {
				s2=",Nombre";
			}
	        if(textApellido.getText().equals("")) {
	            s3 = ",Apellido"; 	
	        }if(textNumero.getText().equals("")) {
	        	s4 = ",Numero de telefono";
	        }if(textCorreo.getText().equals("")) {
	        	s5 = ",Correo Eletronico";
	        	
	        }if(passConf.getText().equals("")) {
	        	s6 = ",Confirmacion de contraseña";
	        }if(textUsuario.getText().equals("")|| passContra.getText().equals("")|| textNombre.getText().equals("")|| textApellido.getText().equals("") || textNumero.getText().equals("") || (textCorreo.getText().equals("") || passConf.getText().equals(""))){
	 			JOptionPane.showMessageDialog(null, "No debes dejar campos vacios, pro fabor rellene los siguientes campo: "+s+""+s1+""+s2+""+s3+""+s4+""+s5+""+s6+"." );
	        
	        
	        }else {
        	if(i.equals(v)) {
    			
        		ds.Actualizar(textUsuario.getText(), passContra.getText(), textNombre.getText(), textApellido.getText(), textNumero.getText(), textCorreo.getText(), passConf.getText(), textActualizar.getText());
    			principal prin = new principal();
    			prin.setVisible(true);
    			
    						JOptionPane.showMessageDialog(contentPane, "Se a Ac");
				
				dispose();

			}else {
				JOptionPane.showMessageDialog(contentPane, "la contrasena no coisiden");
				
			}	

			}
          }
          }});
		btnActualizar.setBounds(349, 106, 89, 23);
		contentPane.add(btnActualizar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Onyx", Font.PLAIN, 16));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal prin1 = new principal();
				prin1.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(349, 191, 89, 23);
		contentPane.add(btnVolver);
	}

	
	}


