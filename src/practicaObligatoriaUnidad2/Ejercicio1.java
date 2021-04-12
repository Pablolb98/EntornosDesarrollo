package practicaObligatoriaUnidad2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JButton;

public class Ejercicio1 {

	private JFrame frame;
	private JTextField jtfSumador;
	private JTextField jtfNumero1;
	private JTextField jtfNumero2;
	private JTextField jtfResultado;
	private JButton btnSumar;
	private JButton btnSalir;
	private String intAsString;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 window = new Ejercicio1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		jtfSumador = new JTextField();
		jtfSumador.setEditable(false);
		jtfSumador.setText("SUMADOR");
		GridBagConstraints gbc_jtfSumador = new GridBagConstraints();
		gbc_jtfSumador.insets = new Insets(0, 0, 5, 5);
		gbc_jtfSumador.gridx = 4;
		gbc_jtfSumador.gridy = 1;
		frame.getContentPane().add(jtfSumador, gbc_jtfSumador);
		jtfSumador.setColumns(10);

		JLabel lblNumero1 = new JLabel("Numero1");
		GridBagConstraints gbc_lblNumero1 = new GridBagConstraints();
		gbc_lblNumero1.anchor = GridBagConstraints.EAST;
		gbc_lblNumero1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero1.gridx = 3;
		gbc_lblNumero1.gridy = 3;
		frame.getContentPane().add(lblNumero1, gbc_lblNumero1);

		jtfNumero1 = new JTextField();
		GridBagConstraints gbc_jtfNumero1 = new GridBagConstraints();
		gbc_jtfNumero1.insets = new Insets(0, 0, 5, 5);
		gbc_jtfNumero1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNumero1.gridx = 4;
		gbc_jtfNumero1.gridy = 3;
		frame.getContentPane().add(jtfNumero1, gbc_jtfNumero1);
		jtfNumero1.setColumns(10);

		JLabel lblNumero2 = new JLabel("Numero2");
		GridBagConstraints gbc_lblNumero2 = new GridBagConstraints();
		gbc_lblNumero2.anchor = GridBagConstraints.EAST;
		gbc_lblNumero2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero2.gridx = 3;
		gbc_lblNumero2.gridy = 5;
		frame.getContentPane().add(lblNumero2, gbc_lblNumero2);

		jtfNumero2 = new JTextField();
		GridBagConstraints gbc_jtfNumero2 = new GridBagConstraints();
		gbc_jtfNumero2.insets = new Insets(0, 0, 5, 5);
		gbc_jtfNumero2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNumero2.gridx = 4;
		gbc_jtfNumero2.gridy = 5;
		frame.getContentPane().add(jtfNumero2, gbc_jtfNumero2);
		jtfNumero2.setColumns(10);

		JLabel lblResultado = new JLabel("Resultado");
		GridBagConstraints gbc_lblResultado = new GridBagConstraints();
		gbc_lblResultado.anchor = GridBagConstraints.EAST;
		gbc_lblResultado.insets = new Insets(0, 0, 5, 5);
		gbc_lblResultado.gridx = 3;
		gbc_lblResultado.gridy = 7;
		frame.getContentPane().add(lblResultado, gbc_lblResultado);

		jtfResultado = new JTextField();
		jtfResultado.setEditable(false);
		GridBagConstraints gbc_jtfResultado = new GridBagConstraints();
		gbc_jtfResultado.insets = new Insets(0, 0, 5, 5);
		gbc_jtfResultado.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfResultado.gridx = 4;
		gbc_jtfResultado.gridy = 7;
		frame.getContentPane().add(jtfResultado, gbc_jtfResultado);
		jtfResultado.setColumns(10);

		btnSumar = new JButton("Sumar");
		GridBagConstraints gbc_btnSumar = new GridBagConstraints();
		gbc_btnSumar.insets = new Insets(0, 0, 5, 5);
		gbc_btnSumar.gridx = 3;
		gbc_btnSumar.gridy = 9;
		frame.getContentPane().add(btnSumar, gbc_btnSumar);

		btnSalir = new JButton("Salir");
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalir.gridx = 5;
		gbc_btnSalir.gridy = 9;
		frame.getContentPane().add(btnSalir, gbc_btnSalir);

		btnSalir.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				System.exit(0);
			}

		});

		btnSumar.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);

				JTextField f1 = jtfNumero1;
				String text = f1.getText();
				int num1 = Integer.parseInt(text);

				JTextField f2 = jtfNumero2;
				String text2 = f2.getText();
				int num2 = Integer.parseInt(text2);

				int resultado = num1 + num2;

				intAsString = Integer.toString(resultado);
				jtfResultado.setText(intAsString);
			}

		});
	}

}
