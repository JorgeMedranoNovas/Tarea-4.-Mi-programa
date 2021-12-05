package Venta;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ConexionBD.Metodos_sql;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class registro extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField texNumero;
	private JTextField textCorreo;
	private JPasswordField passContra;
	private JTextField textUsauario;
	private JPasswordField passwordField;
	Metodos_sql metodos = new Metodos_sql();
	Logeo lg = new Logeo();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro frame = new registro();
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
	public registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 395);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblNewLabel.setBounds(43, 52, 92, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(43, 98, 92, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero de telefono");
		lblNewLabel_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_2.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(43, 149, 114, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Correo electronico");
		lblNewLabel_2_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_2_1.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(43, 204, 92, 27);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Contrace\u00F1a");
		lblNewLabel_2_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_2_2.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(43, 261, 92, 27);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Confirmar contrace\u00F1a");
		lblNewLabel_2_3.setForeground(new Color(255, 250, 250));
		lblNewLabel_2_3.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblNewLabel_2_3.setBounds(43, 308, 123, 27);
		contentPane.add(lblNewLabel_2_3);
		
		textNombre = new JTextField();
		textNombre.setBounds(121, 55, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setColumns(10);
		textApellido.setBounds(121, 101, 86, 20);
		contentPane.add(textApellido);
		
		texNumero = new JTextField();
		texNumero.setColumns(10);
		texNumero.setBounds(154, 152, 114, 20);
		contentPane.add(texNumero);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(161, 207, 107, 20);
		contentPane.add(textCorreo);
		
		passContra = new JPasswordField();
		passContra.setBounds(145, 264, 123, 20);
		contentPane.add(passContra);
		
		JButton btnRegistral = new JButton("Registral ");
		btnRegistral.setFont(new Font("Onyx", Font.PLAIN, 16));
		btnRegistral.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				String i =passContra.getText();
				String v = passwordField.getText();
              String s="",s1="",s2="",s3="",s4="",s5="",s6="";
              
              if(textUsauario.getText().equals("")) {
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
		        }if(texNumero.getText().equals("")) {
		        	s4 = ",Numero de telefono";
		        }if(textCorreo.getText().equals("")) {
		        	s5 = ",Correo Eletronico";
		        	
		        }if(passwordField.getText().equals("")) {
		        	s6 = ",Confirmacion de contraseña";
		        }if(textUsauario.getText().equals("")|| passContra.getText().equals("")|| textNombre.getText().equals("")|| textApellido.getText().equals("") || texNumero.getText().equals("") || (textCorreo.getText().equals("") || passwordField.getText().equals(""))){
		 			JOptionPane.showMessageDialog(null, "No debes dejar campos vacios, pro fabor rellene los siguientes campo: "+s+""+s1+""+s2+""+s3+""+s4+""+s5+""+s6+"." );
		        
		        
		        }else {
            	if(i.equals(v)) {
        			
    				metodos.guardar(textUsauario.getText(),passContra.getText(),textNombre.getText(),textApellido.getText(),texNumero.getText(),textCorreo.getText(),passwordField.getText());
    				JOptionPane.showMessageDialog(contentPane, "Bienvenido");
    				
    				lg.setVisible(true);
    				dispose();
 
    			}else {
    				JOptionPane.showMessageDialog(contentPane, "la contrasena no coisiden");
    				
    			}	
 
            }		
 			
				//prin.car(1);           	
				
					
					
							
			
			}
			});
		btnRegistral.setBounds(438, 115, 89, 23);
		contentPane.add(btnRegistral);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.setFont(new Font("Onyx", Font.PLAIN, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			lg.setVisible(true);
			dispose();
			}
		});
		btnNewButton_1.setBounds(438, 248, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Usuario");
		lblNewLabel_3.setForeground(new Color(255, 250, 250));
		lblNewLabel_3.setFont(new Font("Onyx", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(43, 11, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textUsauario = new JTextField();
		textUsauario.setBounds(121, 8, 86, 20);
		contentPane.add(textUsauario);
		textUsauario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(176, 311, 128, 20);
		contentPane.add(passwordField);
	}

	
}
