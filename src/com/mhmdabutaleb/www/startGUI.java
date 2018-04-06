package com.mhmdabutaleb.www;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class startGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startGUI frame = new startGUI();
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
	public startGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPcInformation = new JLabel("PC INFORMATION");
		lblPcInformation.setFont(new Font("Sitka Banner", Font.BOLD, 18));
		lblPcInformation.setBounds(109, 11, 160, 23);
		contentPane.add(lblPcInformation);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "User Info", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel.setBounds(10, 45, 339, 151);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblPcUser = new JLabel("PC User :");
		lblPcUser.setBounds(10, 22, 137, 14);
		panel.add(lblPcUser);

		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setBounds(10, 47, 137, 14);
		panel.add(lblPhone);

		JLabel lblSaudiPortAuthority = new JLabel("Saudi Port Authority (SPA) :");
		lblSaudiPortAuthority.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSaudiPortAuthority.setBounds(10, 72, 137, 14);
		panel.add(lblSaudiPortAuthority);

		JLabel lblWorkPhone = new JLabel("Office  :");
		lblWorkPhone.setBounds(10, 97, 137, 14);
		panel.add(lblWorkPhone);

		JLabel lblOfficeNumber = new JLabel("Office Number :");
		lblOfficeNumber.setBounds(10, 122, 137, 14);
		panel.add(lblOfficeNumber);

		textField = new JTextField();
		textField.setBounds(157, 19, 172, 20);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(157, 44, 172, 20);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(157, 69, 172, 20);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(157, 94, 172, 20);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(157, 119, 172, 20);
		panel.add(textField_4);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Hardwear Info",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel_1.setBounds(10, 207, 339, 293);
		contentPane.add(panel_1);

		JLabel lblCpu = new JLabel("System Manufacturer :");
		lblCpu.setBounds(10, 22, 137, 14);
		panel_1.add(lblCpu);

		JLabel lblSystemModel = new JLabel("System Model :");
		lblSystemModel.setBounds(10, 47, 137, 14);
		panel_1.add(lblSystemModel);

		JLabel lblSystemType = new JLabel("System Type:");
		lblSystemType.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSystemType.setBounds(10, 72, 137, 14);
		panel_1.add(lblSystemType);

		JLabel lblCpu_1 = new JLabel("CPU  :");
		lblCpu_1.setBounds(10, 97, 137, 14);
		panel_1.add(lblCpu_1);

		JLabel lblRams = new JLabel("RAMs :");
		lblRams.setBounds(10, 122, 137, 14);
		panel_1.add(lblRams);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(157, 19, 172, 20);
		panel_1.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(157, 44, 172, 20);
		panel_1.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(157, 69, 172, 20);
		panel_1.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(157, 94, 172, 20);
		panel_1.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(157, 119, 172, 20);
		panel_1.add(textField_9);
	}
}
