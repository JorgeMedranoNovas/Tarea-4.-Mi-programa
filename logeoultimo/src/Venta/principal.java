package Venta;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.protocol.Resultset;

import ConexionBD.ConexionDt;
import ConexionBD.Metodos_sql;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;

public class principal extends JFrame {

		
	ConexionDt con = new ConexionDt();
	String[] datos = new String[5];
	public int h;
		
	Connection cn; 
	Statement st;
	Resultset rs;
	DefaultTableModel Model = new DefaultTableModel(); 
	
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 413);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(148, 0, 211));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Onyx", Font.PLAIN, 16));
		btnEliminar.setForeground(new Color(0, 0, 0));
		btnEliminar.setBackground(new Color(0, 0, 128));
		btnEliminar.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				EliminarUsu eli = new EliminarUsu();
				eli.setVisible(true);
				dispose();

           }
		});
		btnEliminar.setBounds(295, 304, 125, 30);
		contentPane.add(btnEliminar);
		
		JButton btnSalir = new JButton("CERRAR SECCION");
		btnSalir.setFont(new Font("Onyx", Font.PLAIN, 16));
		btnSalir.setBackground(new Color(0, 0, 128));
		btnSalir.setForeground(new Color(0, 0, 0));
		btnSalir.setBounds(476, 304, 142, 30);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		
		System.out.println(h);		
		Model.addColumn("Usuario");
		Model.addColumn("Nombre");
		Model.addColumn("apellido");
		Model.addColumn("número_de_teléfono");
		Model.addColumn("correo_electrónico");
		
        mostrar();
		
				
		contentPane.add(btnSalir);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(86, 37, 586, 244);
		contentPane.add(scrollPane_1);
		
		table = new JTable(Model);
		scrollPane_1.setViewportView(table);
		
		JButton btnActualizar = new JButton("ACTUALIZAR");
		btnActualizar.setFont(new Font("Onyx", Font.PLAIN, 16));
		btnActualizar.setForeground(new Color(0, 0, 0));
		btnActualizar.setBackground(new Color(0, 0, 128));
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Actualizar act= new Actualizar();
				act.setVisible(true);
				dispose();
			}
		});
		btnActualizar.setBounds(133, 304, 112, 30);
		contentPane.add(btnActualizar);
		
	}
	
	public void mostrar() {
		
		Model.setRowCount(0);
		String sql = "select * from bd_Usuario";
		Connection meer = ConexionDt.getConexion();
		try {
			st =  meer.createStatement();
			ResultSet result = st.executeQuery(sql);
			while(result.next()){
			System.out.println(result.getString(1));
			datos[0] = result.getString(1);
			datos[1] = result.getString(3);
			datos[2] = result.getString(4);
			datos[3] = result.getString(5);
			datos[4] = result.getString(6);
			Model.addRow(datos);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	
	
	
}

