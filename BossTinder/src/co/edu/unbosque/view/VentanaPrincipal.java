package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {
	private ImageIcon ImagenBienvenida;
	private JLabel bienvenida, usuario, contraseña;
	private JButton bt_crearUsuario, bt_salir;
	private int ancho;
	private int alto;

	public VentanaPrincipal() {
		setIconImage(new ImageIcon(getClass().getResource("/Imagen/logo.png")).getImage());
		setTitle("BosqueSW");
		ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setLayout(null);
		setSize(533, 460);
		setLocation((int) (ancho / 3.2), (int) (alto / 4.5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}
