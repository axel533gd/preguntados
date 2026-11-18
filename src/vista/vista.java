package src.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import src.modelo.Gestionjugadores;
import src.modelo.Jugadores;
// [USER_IMPORTS_START]
//  ESCRIBE TUS IMPORTS AQUI (Ej: import java.io.*;)
    // ----------------------------------------------------
// [USER_IMPORTS_END]

public class vista extends JFrame {

    private Gestionjugadores gestion;

    private JLabel label3;
    private JButton btn6;
    private JLabel label8;
    private JLabel label9;
    private JTextField txtField10;
    private JTextField txtField11;
    private JTextField txtField12;

// [USER_DECLS_START]
//  DECLARA TUS VARIABLES AQUI (Ej: private int contador;)
    // ----------------------------------------------------
// [USER_DECLS_END]

    public vista() {
        this.gestion = new Gestionjugadores();
        setTitle("Mi Formulario");
        setSize(500, 410);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        initComponents();
        initEvents();
    }

    private void initComponents() {
        label3 = new JLabel("Nombre:");
        label3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        label3.setBounds(57, 37, 81, 23);
        btn6 = new JButton("Registrarse");
        btn6.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btn6.setBounds(172, 241, 148, 26);
        label8 = new JLabel("Email:");
        label8.setFont(new Font("Tahoma", Font.PLAIN, 11));
        label8.setBounds(58, 75, 80, 20);
        label9 = new JLabel("País:");
        label9.setFont(new Font("Tahoma", Font.PLAIN, 11));
        label9.setBounds(60, 116, 80, 20);
        txtField10 = new JTextField();
        txtField10.setFont(new Font("Tahoma", Font.PLAIN, 11));
        txtField10.setBounds(149, 37, 170, 23);
        txtField11 = new JTextField();
        txtField11.setFont(new Font("Tahoma", Font.PLAIN, 11));
        txtField11.setBounds(149, 76, 168, 19);
        txtField12 = new JTextField();
        txtField12.setFont(new Font("Tahoma", Font.PLAIN, 11));
        txtField12.setBounds(150, 116, 170, 25);
        getContentPane().add(label3);
        getContentPane().add(btn6);
        getContentPane().add(label8);
        getContentPane().add(label9);
        getContentPane().add(txtField10);
        getContentPane().add(txtField11);
        getContentPane().add(txtField12);
    }

    private void initEvents() {
        // [USER_ACTION_START:btn6]
        btn6.addActionListener(e -> {
            // TODO: accion de btn6
            String nombre = txtField10.getText();
            String email = txtField11.getText();
            String pais = txtField12.getText();
            Jugadores jugador = new Jugadores(0, nombre, email, pais, java.time.LocalDateTime.now());
        });
        // [USER_ACTION_END:btn6]

    }

// [USER_METHODS_START]
//  AGREGA TUS METODOS PERSONALIZADOS AQUI
    // ----------------------------------------------------
    public void actualizarTabla() {
        // TODO: recargar datos en la(s) tabla(s)
    }

    public void limpiarFormulario() {
        // TODO: limpiar campos del formulario
    }
// [USER_METHODS_END]
}
