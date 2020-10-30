package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controlador.controlador;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import vista.*;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private controlador controlador;
	
	public VentanaPrincipal(controlador cont) {
		controlador = cont;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
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
		  setJMenuBar(menuBar);
		  
		  cargarlocatario.addActionListener(new ActionListener() {
			  	public void actionPerformed(ActionEvent e) {
			  		interfazCargarLocatario frame = new interfazCargarLocatario(controlador);
					frame.setVisible(true);
					dispose();
			  	}
		  });
		  cargarlocador.addActionListener(new ActionListener() {
			  	public void actionPerformed(ActionEvent e) {
			  		interfazCargarLocador frame = new interfazCargarLocador(controlador);
					frame.setVisible(true);
					dispose();
			  	}
		  });
	}
}
