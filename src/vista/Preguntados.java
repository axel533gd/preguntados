package src.vista;

import javax.swing.*;
import java.awt.*;
import src.modelo.Gestionjuego;
import src.modelo.Preguntas;



// [USER_IMPORTS_START]
//  ESCRIBE TUS IMPORTS AQUI (Ej: import java.io.*;)
    // ----------------------------------------------------
// [USER_IMPORTS_END]

public class Preguntados extends JFrame {

    private JLabel Pregunta;
    private JButton Opcion1;
    private JButton Opcion3;
    private JButton Opcion4;
    private JButton Opcion2;

// [USER_DECLS_START]
//  DECLARA TUS VARIABLES AQUI (Ej: private int contador;)
    // ----------------------------------------------------
    Gestionjuego gestionJuego = new Gestionjuego();
// [USER_DECLS_END]

    public Preguntados() {

        setTitle("Preguntados");
        setSize(500, 410);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        initComponents();
        initEvents();
        mostrarPregunta();
    }

    private void initComponents() {
        Pregunta = new JLabel("Label");
        Pregunta.setFont(new Font("Tahoma", Font.PLAIN, 11));
        Pregunta.setBounds(99, 14, 305, 86);
        Opcion1 = new JButton("Aceptar");
        Opcion1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        Opcion1.setBounds(14, 76, 226, 110);
        Opcion3 = new JButton("Aceptar");
        Opcion3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        Opcion3.setBounds(18, 217, 217, 139);
        Opcion4 = new JButton("Aceptar");
        Opcion4.setFont(new Font("Tahoma", Font.PLAIN, 11));
        Opcion4.setBounds(252, 217, 227, 149);
        Opcion2 = new JButton("Aceptar");
        Opcion2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        Opcion2.setBounds(251, 76, 234, 120);
        getContentPane().add(Pregunta);
        getContentPane().add(Opcion1);
        getContentPane().add(Opcion3);
        getContentPane().add(Opcion4);
        getContentPane().add(Opcion2);
    }

    private void initEvents() {
        // [USER_ACTION_START:Opcion1]
        Opcion1.addActionListener(e -> {
            // TODO: accion de Opcion1
            if(gestionJuego.verificarRespuesta(gestionJuego.preguntaactual.getRespuestas().get(0))) {
                JOptionPane.showMessageDialog(this, "¡Respuesta correcta!");
                mostrarPregunta();
            } else {
                JOptionPane.showMessageDialog(this, "Respuesta incorrecta.");
            }
            
        });
        // [USER_ACTION_END:Opcion1]

        // [USER_ACTION_START:Opcion3]
        Opcion3.addActionListener(e -> {
            // TODO: accion de Opcion3
            if(gestionJuego.verificarRespuesta(gestionJuego.preguntaactual.getRespuestas().get(2))) {
                JOptionPane.showMessageDialog(this, "¡Respuesta correcta!");
                mostrarPregunta();
            } else {
                JOptionPane.showMessageDialog(this, "Respuesta incorrecta.");
            }
        });
        // [USER_ACTION_END:Opcion3]

        // [USER_ACTION_START:Opcion4]
        Opcion4.addActionListener(e -> {
            // TODO: accion de Opcion4
            if(gestionJuego.verificarRespuesta(gestionJuego.preguntaactual.getRespuestas().get(3))) {
                JOptionPane.showMessageDialog(this, "¡Respuesta correcta!");
                mostrarPregunta();
            } else {
                JOptionPane.showMessageDialog(this, "Respuesta incorrecta.");
            }
        });
        // [USER_ACTION_END:Opcion4]

        // [USER_ACTION_START:Opcion2]
        Opcion2.addActionListener(e -> {
            // TODO: accion de Opcion2
            if(gestionJuego.verificarRespuesta(gestionJuego.preguntaactual.getRespuestas().get(1))) {
                JOptionPane.showMessageDialog(this, "¡Respuesta correcta!");
                mostrarPregunta();
            } else {
                JOptionPane.showMessageDialog(this, "Respuesta incorrecta.");
            }
        });
        // [USER_ACTION_END:Opcion2]

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

    
public void mostrarPregunta() {

    Preguntas pregunta = gestionJuego.obtenerPreguntaAleatoria();
    Pregunta.setText(pregunta.getEnunciado());
    Opcion1.setText(pregunta.getRespuestas().get(0).getRespuesta());
    Opcion2.setText(pregunta.getRespuestas().get(1).getRespuesta());
    Opcion3.setText(pregunta.getRespuestas().get(2).getRespuesta());
    Opcion4.setText(pregunta.getRespuestas().get(3).getRespuesta());
}


// [USER_METHODS_END]



}