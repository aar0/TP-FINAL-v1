package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.controlador;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTable;

public class interfazCargarLocatario extends JFrame {

	private JPanel contentPane;
	private controlador controlador;
	private JTextField textField;
	private JMenuBar menuBar;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	public interfazCargarLocatario(controlador cont) {
		controlador = cont;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 302);
		
		menuBar = new JMenuBar();
		JMenuItem inicio=new JMenuItem("Volver");
		JMenu persona=new JMenu("Persona");
		JMenu contrato=new JMenu("Contrato");
		JMenu locador=new JMenu("Locador");
		JMenu locatario=new JMenu("Locatario");
		JMenu garante=new JMenu("Garante");
			//LOCADOR
		  JMenuItem cargarlocador =new JMenuItem("Cargar");
		  JMenuItem listarlocador =new JMenuItem("Listar");
		  JMenuItem actualizarlocador =new JMenuItem("Actualizar");
		  JMenuItem eliminarlocador =new JMenuItem("Eliminar");
		  	//LOCATARIO
		  JMenuItem cargarlocatario =new JMenuItem("Cargar");
		  JMenuItem listarlocatario =new JMenuItem("Listar");
		  JMenuItem actualizarlocatario =new JMenuItem("Actualizar");
		  JMenuItem eliminarlocatario =new JMenuItem("Eliminar");
		  	//GARANTE
		  JMenuItem cargargarante =new JMenuItem("Cargar");
		  JMenuItem listargarante =new JMenuItem("Listar");
		  JMenuItem actualizargarante =new JMenuItem("Actualizar");
		  JMenuItem eliminargarante =new JMenuItem("Eliminar");
		  	//CONTRATO
		  JMenuItem alquiler =new JMenuItem("Cargar Alquiler");
		  JMenuItem venta =new JMenuItem("Cargar Venta");
		  
		  menuBar.add(persona);
		  menuBar.add(contrato);
		  persona.add(locador);
		  	locador.add(cargarlocador);
		  		cargarlocador.setEnabled(false);
		  	locador.add(listarlocador);
		  	locador.add(actualizarlocador);
		  	locador.add(eliminarlocador);
		  persona.add(locatario);
		  	locatario.add(cargarlocatario);
		  	locatario.add(listarlocatario);
		  	locatario.add(actualizarlocatario);
		  	locatario.add(eliminarlocatario);
		  persona.add(garante);
			garante.add(cargargarante);
			garante.add(listargarante);
			garante.add(actualizargarante);
			garante.add(eliminargarante);
		  contrato.add(alquiler);
		  contrato.add(venta);
		  menuBar.add(inicio);
		setJMenuBar(menuBar);
		
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPrincipal frame = new VentanaPrincipal(cont);
				frame.setVisible(true);
				dispose();
			}
		}); 
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(139, 40, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre y Apellido:");
		lblNewLabel.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblNewLabel.setBounds(10, 40, 134, 15);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 69, 96, 19);
		contentPane.add(textField_1);
		
		JLabel lblDni = new JLabel("D.N.I:");
		lblDni.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblDni.setBounds(10, 69, 71, 15);
		contentPane.add(lblDni);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(326, 69, 96, 19);
		contentPane.add(textField_2);
		
		JLabel lblEstadocivil = new JLabel("EstadoCivil:");
		lblEstadocivil.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblEstadocivil.setBounds(10, 99, 96, 15);
		contentPane.add(lblEstadocivil);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(139, 128, 96, 19);
		contentPane.add(textField_3);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblDomicilio.setBounds(10, 128, 71, 15);
		contentPane.add(lblDomicilio);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblTelefono.setBounds(10, 159, 71, 15);
		contentPane.add(lblTelefono);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(139, 159, 96, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(139, 188, 96, 19);
		contentPane.add(textField_5);
		
		JLabel lblMail = new JLabel("Mail:");
		lblMail.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblMail.setBounds(10, 188, 71, 15);
		contentPane.add(lblMail);
		
		JLabel lblIngresos = new JLabel("Ingresos:");
		lblIngresos.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblIngresos.setBounds(245, 69, 71, 15);
		contentPane.add(lblIngresos);
		
		JLabel lblActividadDedicada = new JLabel("Actividad Dedicada:");
		lblActividadDedicada.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblActividadDedicada.setBounds(245, 41, 141, 15);
		contentPane.add(lblActividadDedicada);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "Soltero", "Casado", "Viudo", "Divorciado", "Separado"}));
		comboBox.setBounds(139, 101, 96, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "Relacion De Dependencia", "Trabajador Independiente"}));
		comboBox_1.setBounds(381, 39, 164, 21);
		contentPane.add(comboBox_1);
		
		JLabel lblCrearLocatario = new JLabel("CREAR LOCATARIO");
		lblCrearLocatario.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		lblCrearLocatario.setBounds(211, 10, 154, 15);
		contentPane.add(lblCrearLocatario);
		
		JLabel lblCrearUsuario = new JLabel("CREAR USUARIO ");
		lblCrearUsuario.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		lblCrearUsuario.setBounds(316, 128, 154, 15);
		contentPane.add(lblCrearUsuario);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblUsuario.setBounds(245, 156, 134, 15);
		contentPane.add(lblUsuario);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(336, 158, 156, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(336, 188, 156, 19);
		contentPane.add(textField_7);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblContrasea.setBounds(245, 185, 91, 19);
		contentPane.add(lblContrasea);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setFont(new Font("Arial Black", Font.ITALIC, 12));
		chckbxNewCheckBox.setBounds(366, 97, 28, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblEstudiante = new JLabel("Estudiante:");
		lblEstudiante.setFont(new Font("Arial Black", Font.ITALIC, 12));
		lblEstudiante.setBounds(245, 102, 110, 15);
		contentPane.add(lblEstudiante);
	}
}
