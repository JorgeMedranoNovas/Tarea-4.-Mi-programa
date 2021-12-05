package Venta;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ConexionBD.Metodos_sql;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class EliminarUsu extends JFrame {
 
	private JPanel contentPane;
	private JTextField txtEliminar;
	principal prin = new principal();	
	Metodos_sql mosw = new Metodos_sql();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarUsu frame = new EliminarUsu();
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
	
	public EliminarUsu() {
		setBackground(new Color(0, 0, 0));
		setForeground(new Color(0, 191, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 224, 298);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(148, 0, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
      		
		txtEliminar = new JTextField();
		txtEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		txtEliminar.setFont(new Font("Onyx", Font.PLAIN, 16));
		txtEliminar.setText("Eliminar ");
		txtEliminar.setBounds(41, 84, 119, 24);
		contentPane.add(txtEliminar);
		txtEliminar.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Onyx", Font.PLAIN, 16));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mosw.eliminal(txtEliminar.getText());
			    prin.setVisible(true);
 				dispose();
				//System.out.println(prin.h);
			}
		});
		btnEliminar.setBounds(41, 135, 119, 34);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Onyx", Font.PLAIN, 16));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prin.setVisible(true);
 				dispose();	
			}
		});
		btnSalir.setBounds(41, 201, 119, 34);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Onyx", Font.PLAIN, 26));
		lblNewLabel.setBounds(49, 39, 94, 20);
		contentPane.add(lblNewLabel);
	}

}
