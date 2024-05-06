package co.edu.uniquindio.poo;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interfaz extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private final JButton loginButton;

    private JTextField titularField;
    private JTextField numeroCuentaField;
    private JTextField saldoField;
    private JTextField estadoField;
    private JButton crearCuentaButton;

    private JTextArea descripcionTransaccionArea;
    private JButton realizarTransaccionButton;

    /**
     * Constructor de la clase Interfaz.
     * Configura la interfaz gráfica y los componentes.
     */
    public Interfaz(){
        // Configuración de la ventana principal
        this.setSize(400, 400);
        this.setTitle("Bancolombia");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Establecer el color de fondo a amarillo
        getContentPane().setBackground(Color.YELLOW);

        // Panel para el inicio de sesión
        JPanel loginPanel = new JPanel();
        loginPanel.setOpaque(false);
        loginPanel.setLayout(new GridBagLayout());
        GridBagConstraints loginGbc = new GridBagConstraints();
        loginGbc.gridx = 0;
        loginGbc.gridy = 0;
        loginGbc.gridwidth = 2;
        loginGbc.fill = GridBagConstraints.HORIZONTAL;
        loginGbc.insets = new Insets(10, 10, 30, 10);

        // Componentes para el inicio de sesión
        JLabel usernameLabel = new JLabel("Usuario:");
        usernameLabel.setForeground(Color.BLACK);
        usernameField = new JTextField(15);
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setForeground(Color.BLACK);
        passwordField = new JPasswordField(15);
        loginButton = new JButton("Iniciar Sesión");
        loginButton.setBackground(new Color(51, 153, 255));
        loginButton.setForeground(Color.white);
        loginButton.setFocusPainted(false);

        // Acción para el botón de inicio de sesión
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (verificarCredenciales(username, password)) {
                loginPanel.removeAll();
                loginPanel.revalidate();
                loginPanel.repaint();
                mostrarCrearCuenta();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña son incorrectos", "Error de ingreso", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Agregar componentes al panel de inicio de sesión
        loginPanel.add(usernameLabel, loginGbc);
        loginGbc.gridy++;
        loginPanel.add(usernameField, loginGbc);
        loginGbc.gridy++;
        loginPanel.add(passwordLabel, loginGbc);
        loginGbc.gridy++;
        loginPanel.add(passwordField, loginGbc);
        loginGbc.gridy++;
        loginPanel.add(loginButton, loginGbc);

        // Agregar panel de inicio de sesión a la ventana principal
        this.add(loginPanel);
    }

    /**
     * Verifica las credenciales de inicio de sesión.
     * @param username Nombre de usuario.
     * @param password Contraseña.
     * @return true si las credenciales son válidas, false de lo contrario.
     */
    private boolean verificarCredenciales(String username, String password) {
        // Verificar las credenciales con tu lógica de autenticación
        return username.equals("anyelo") && password.equals("anyelo");
    }

    /**
     * Muestra el panel para crear una nueva cuenta bancaria.
     */
    private void mostrarCrearCuenta() {
        JPanel crearCuentaPanel = new JPanel();
        crearCuentaPanel.setOpaque(false);
        crearCuentaPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Componentes para crear una nueva cuenta
        JLabel titularLabel = new JLabel("Titular:");
        titularLabel.setForeground(Color.BLACK);
        titularField = new JTextField(15);
        JLabel numeroCuentaLabel = new JLabel("Número de Cuenta:");
        numeroCuentaLabel.setForeground(Color.BLACK);
        numeroCuentaField = new JTextField(15);
        JLabel saldoLabel = new JLabel("Saldo:");
        saldoLabel.setForeground(Color.BLACK);
        saldoField = new JTextField(15);
        JLabel estadoLabel = new JLabel("Estado:");
        estadoLabel.setForeground(Color.BLACK);
        estadoField = new JTextField(15);
        estadoField.setEditable(false);
        crearCuentaButton = new JButton("Crear Cuenta");
        crearCuentaButton.setBackground(new Color(51, 153, 255));
        crearCuentaButton.setForeground(Color.WHITE);
        crearCuentaButton.setFocusPainted(false);

        // Acción para el botón de crear cuenta
        crearCuentaButton.addActionListener(e -> {
            String titular = titularField.getText();
            String numeroCuenta = numeroCuentaField.getText();
            double saldo = Double.parseDouble(saldoField.getText());
            boolean estado = saldo > 0;

            estadoField.setText(estado ? "Activo" : "Inactivo");

            JOptionPane.showMessageDialog(this, "Cuenta creada:\nTitular: " + titular + "\nNúmero de Cuenta: " + numeroCuenta + "\nSaldo: " + saldo + "\nEstado: " + (estado ? "Activo" : "Inactivo"), "Cuenta Creada", JOptionPane.INFORMATION_MESSAGE);
            mostrarTransaccion();
        });

        // Agregar componentes al panel de crear cuenta
        crearCuentaPanel.add(titularLabel, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(titularField, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(numeroCuentaLabel, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(numeroCuentaField, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(saldoLabel, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(saldoField, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(estadoLabel, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(estadoField, gbc);
        gbc.gridy++;
        crearCuentaPanel.add(crearCuentaButton, gbc);

        // Actualizar la ventana principal con el panel de crear cuenta
        this.getContentPane().removeAll();
        this.getContentPane().add(crearCuentaPanel);
        this.revalidate();
        this.repaint();
    }

    /**
     * Muestra el panel para realizar una transacción.
     */
    private void mostrarTransaccion() {
        JPanel transaccionPanel = new JPanel();
        transaccionPanel.setOpaque(false);
        transaccionPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Componentes para realizar una transacción
        JLabel descripcionLabel = new JLabel("Descripción:");
        descripcionLabel.setForeground(Color.BLACK);
        descripcionTransaccionArea = new JTextArea(5, 20);
        descripcionTransaccionArea.setLineWrap(true);
        descripcionTransaccionArea.setWrapStyleWord(true);
        realizarTransaccionButton = new JButton("Realizar Transacción");
        realizarTransaccionButton.setBackground(new Color(51, 153, 255));
        realizarTransaccionButton.setForeground(Color.WHITE);
        realizarTransaccionButton.setFocusPainted(false);

        // Acción para el botón de realizar transacción
        realizarTransaccionButton.addActionListener(e -> {
            String descripcion = descripcionTransaccionArea.getText();
            // Aquí puedes implementar la lógica para realizar la transacción
            JOptionPane.showMessageDialog(this, "Transacción realizada con éxito:\nDescripción: " + descripcion, "Transacción Exitosa", JOptionPane.INFORMATION_MESSAGE);
        });

        // Agregar componentes al panel de realizar transacción
        gbc.gridwidth = 2;
        transaccionPanel.add(descripcionLabel, gbc);
        gbc.gridy++;
        gbc.gridwidth = 1;
        transaccionPanel.add(descripcionTransaccionArea, gbc);
        gbc.gridy++;
        transaccionPanel.add(realizarTransaccionButton, gbc);

        // Actualizar la ventana principal con el panel de realizar transacción
        this.getContentPane().removeAll();
        this.getContentPane().add(transaccionPanel);
        this.revalidate();
        this.repaint();
    }


}
