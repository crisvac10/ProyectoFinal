package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaAñadir  extends JFrame{
	private ImageIcon ImagenBienvenida;
	private JLabel bienvenida;
	private int ancho; 
	private int alto;
	
	public VentanaAñadir() {
		setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo.png")).getImage());
		setTitle("Añadir Usuario");
		ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setLayout(null);
		setSize(533, 460);
		setLocation((int) (ancho / 3.2), (int) (alto / 4.5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
