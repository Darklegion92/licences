package views;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.Coordinador;

public class ventanaPrincipal extends JFrame implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCompany;
	private JTextField txtLicense;
	private JTextField txtRemoval;
	private JTextField txtSerialDD;
	private JTextField txtSerialLicense;
	private JLabel lblCompany;
	private JLabel lblLicense;
	private JLabel lblRemoval;
	private JLabel lblSerialDD;
	private JLabel lblSerialLicense;
	private JButton btnGuardar;
	private JButton btnSalir;
	//private DatosVo misDatos;

	private Coordinador miCoordinador;

	/**
	 * Launch the application.
	 * 
	 * public static void main(String[] args) { try { vistaDatos dialog = new
	 * vistaDatos(); dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	 * dialog.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
	 */

	/**
	 * Create the dialog.
	 */
	public ventanaPrincipal () {
		setUndecorated(true);
		setBounds(100, 100, 314, 450);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		{
			lblCompany = new JLabel("Empresa(4): ");
			lblCompany.setHorizontalAlignment(SwingConstants.CENTER);
		}
		{
			txtCompany = new JTextField();
			txtCompany.setColumns(10);
		}
		{
			lblLicense = new JLabel("Licencia(15): ");
			lblLicense.setHorizontalAlignment(SwingConstants.CENTER);
		}
		{
			txtLicense = new JTextField();
			txtLicense.setColumns(10);
		}
		{
			lblRemoval = new JLabel("Remoción(9): ");
			lblRemoval.setHorizontalAlignment(SwingConstants.CENTER);
		}
		{
			txtRemoval = new JTextField();
			txtRemoval.setColumns(10);
			
		}
		{
			lblSerialDD = new JLabel("Serial(8): ");
			lblSerialDD.setHorizontalAlignment(SwingConstants.CENTER);
		}
		{
			txtSerialDD = new JTextField();
			txtSerialDD.setColumns(10);
			
		}
		
		{
			lblSerialLicense = new JLabel("Serial Licencia: ");
			lblSerialLicense.setHorizontalAlignment(SwingConstants.CENTER);
		}
		{
			txtSerialLicense = new JTextField();
			txtSerialLicense.setColumns(10);
			
		}

		btnGuardar = new JButton("GUARDAR");
		btnGuardar.addMouseListener(this);

		btnSalir = new JButton("SALIR");
		btnSalir.addMouseListener(this);
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				gl_contentPanel.createSequentialGroup().addGap(51).addGroup(gl_contentPanel
						.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCompany, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(lblLicense, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(lblRemoval, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(lblSerialDD, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(lblSerialLicense, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
						.addComponent(btnGuardar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(txtCompany, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(txtLicense, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(txtRemoval, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(txtSerialLicense, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(btnSalir, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
						.addComponent(txtSerialDD, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 193,
								Short.MAX_VALUE))
						.addGap(69)));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPanel
				.createSequentialGroup().addGap(30)
				.addComponent(lblCompany, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(txtCompany, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addComponent(lblLicense, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(txtLicense, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(lblRemoval, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(txtRemoval, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(lblSerialDD, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(txtSerialDD, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addComponent(lblSerialLicense, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(txtSerialLicense, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addPreferredGap(ComponentPlacement.UNRELATED).addGap(20).addComponent(btnGuardar)
				.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnSalir).addContainerGap()));
		contentPanel.setLayout(gl_contentPanel);
	}

	public Coordinador getMiCoordinador() {
		return miCoordinador;
	}

	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnSalir) {
			System.exit(0);
		}
		if (e.getSource() == btnGuardar) {
			if (!txtCompany.getText().isEmpty() && !txtLicense.getText().isEmpty() && !txtRemoval.getText().isEmpty() && !txtSerialDD.getText().isEmpty()) {
				
				String key = txtCompany.getText() + txtLicense.getText() + "50173C" + txtRemoval.getText() + txtSerialDD.getText();
				JOptionPane.showMessageDialog(this, "Su licencia ha sido generada ");
				txtSerialLicense.setText(this.miCoordinador.encryptar(key));

			}else {
				JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
			}
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/*public DatosVo getMisDatos() {
		return misDatos;
	}

	public void setMisDatos(DatosVo misDatos) {
		this.misDatos = misDatos;
	}*/

}
