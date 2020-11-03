package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Controlador;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import controlador.Controlador;
import javax.swing.JButton;
public class interfazCargarLocador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private Controlador controlador;
	
	public interfazCargarLocador(Controlador cont) {
		controlador = cont;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 321);
		this.setLocationRelativeTo(null);//ejecuta en el centro
		JMenuBar menuBar = new JMenuBar();
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
		cargarlocatario.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		interfazCargarLocatario frame = new interfazCargarLocatario(controlador);
				frame.setVisible(true);
				dispose();
		  	}
	  });
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nombre y Apellido:");
		label.setFont(new Font("Arial Black", Font.ITALIC, 12));
		label.setBounds(10, 40, 134, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(154, 36, 96, 19);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(154, 65, 96, 19);
		contentPane.add(textField_1);
		
		JLabel label_1 = new JLabel("D.N.I:");
		label_1.setFont(new Font("Arial Black", Font.ITALIC, 12));
		label_1.setBounds(10, 69, 71, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("EstadoCivil:");
		label_2.setFont(new Font("Arial Black", Font.ITALIC, 12));
		label_2.setBounds(10, 99, 96, 15);
		contentPane.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-Seleccione-", "Soltero", "Casado", "Viudo", "Divorciado", "Separado"}));
		comboBox.setBounds(154, 97, 96, 21);
		contentPane.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(154, 124, 96, 19);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("Domicilio:");
		label_3.setFont(new Font("Arial Black", Font.ITALIC, 12));
		label_3.setBounds(10, 128, 71, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Telefono:");
		label_4.setFont(new Font("Arial Black", Font.ITALIC, 12));
		label_4.setBounds(10, 159, 71, 15);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Mail:");
		label_5.setFont(new Font("Arial Black", Font.ITALIC, 12));
		label_5.setBounds(10, 188, 71, 15);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(154, 184, 96, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(154, 155, 96, 19);
		contentPane.add(textField_4);
		
		JLabel lblCrearLocador = new JLabel("CREAR LOCADOR");
		lblCrearLocador.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15));
		lblCrearLocador.setBounds(56, 10, 154, 15);
		contentPane.add(lblCrearLocador);
		
		JButton btnNewButton = new JButton("Cargar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.agregar();
			}
		});
		btnNewButton.setBounds(96, 227, 85, 21);
		contentPane.add(btnNewButton);
	}

}
