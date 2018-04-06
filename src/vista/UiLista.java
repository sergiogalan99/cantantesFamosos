package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JList;

public class UiLista extends JFrame {

	protected JPanel contentPane;
	protected JTextField textCantante;
	protected JTextField textCancion;
	protected JButton btnIntroducir;
	protected JScrollPane scrollPane;
	protected JList listCantante;

	// El bridge solo ve los metodo y no los componentes
	public JTextField getTextCantante() {
		return textCantante;
	}

	public JTextField getTextCancion() {
		return textCancion;
	}

	public UiLista() {
		setMinimumSize(new Dimension(500, 500));
		setBackground(SystemColor.inactiveCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));

		btnIntroducir = new JButton("Introducir");
		btnIntroducir.setForeground(new Color(255, 255, 255));
		btnIntroducir.setBackground(new Color(0, 0, 128));
		panel.add(btnIntroducir, BorderLayout.NORTH);
		btnIntroducir.setFont(new Font("Arial Black", Font.BOLD, 15));

		JPanel panel_6 = new JPanel();
		contentPane.add(panel_6, BorderLayout.NORTH);
		panel_6.setLayout(new BorderLayout(0, 0));

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(10, 0, 10, 0));
		panel_7.setBackground(new Color(128, 128, 128));
		panel_6.add(panel_7, BorderLayout.NORTH);

		JLabel lblListaDeCantantes = new JLabel("LISTA DE CANTANTES");
		panel_7.add(lblListaDeCantantes);
		lblListaDeCantantes.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeCantantes.setBackground(SystemColor.inactiveCaption);
		lblListaDeCantantes.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblListaDeCantantes.setForeground(new Color(255, 255, 255));

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		panel_6.add(panel_8, BorderLayout.SOUTH);

		JLabel lblCantante = new JLabel("Cantante");
		panel_8.add(lblCantante);
		lblCantante.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCantante.setHorizontalAlignment(SwingConstants.CENTER);

		textCantante = new JTextField();
		panel_8.add(textCantante);
		textCantante.setColumns(10);

		JLabel lblCancion = new JLabel("Cancion");
		panel_8.add(lblCancion);
		lblCancion.setBackground(SystemColor.inactiveCaption);
		lblCancion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCancion.setHorizontalAlignment(SwingConstants.CENTER);

		textCancion = new JTextField();
		panel_8.add(textCancion);
		textCancion.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		
		listCantante = new JList();
		scrollPane.setViewportView(listCantante);
	}
}
