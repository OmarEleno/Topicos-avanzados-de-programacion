package gUILayer;
/*Hacer un package gUIlayer hacer un javaProject EjGridBagLayout
 29 de agosto 2025
 * GridBagLayout. A traves de gridX y gridY, podemos indicar la posicion horizontal y vertical.
 * Tambien esta gridwidth (ancho) y gridHight (el alto), son el numero de filas que ocupara el componente.
 * fill es para indicar si se hace del tamaño de la celda a lo ancho o alto o ambos.
 * insets, pone margenes alrededor del componente.
 */

import java.awt.GraphicsConfiguration;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;

public class Principal2 extends JFrame implements ActionListener{

    private JTextField nombre = new JTextField();
    private JTextField apellido = new JTextField();
    private JTextField correo = new JTextField();
    private JPasswordField contra= new JPasswordField();
    private JPasswordField contra2= new JPasswordField();
    private JButton boton= new JButton("Registrar");


    public Principal2(String title)throws HeadlessException{
        super(title);
        setSize(900, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        InitComponents();
    }

    private void InitComponents(){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(nombre,gbc);
        
    }

    public void actionPerformed(ActionEvent e){
        System.out.println("Hola");
    }
    
}