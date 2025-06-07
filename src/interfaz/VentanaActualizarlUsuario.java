package interfaz;

import javax.swing.*;
import logica.Usuario;
import logica.Bicicleta;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logica.Sistema;

public class VentanaActualizarlUsuario extends JFrame {
    private JComboBox<Usuario> comboUsuarios;
    private JTextArea textInfo;
    private JButton btnViaje, btnCambiarCambio, btnActualizar, btnInflar,
            btnRevsiarBici;

    public VentanaActualizarlUsuario() {
        setTitle("Control de Bicicletas por Usuario");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // esto fue hecho por mi 100000% real no fake
        JPanel panelSuperior = new JPanel();
         comboUsuarios = new JComboBox<>(Sistema.getUsuarios().toArray(new Usuario[0]));
        panelSuperior.add(new JLabel("Usuario:"));
        panelSuperior.add(comboUsuarios);

        add(panelSuperior, BorderLayout.NORTH);

        // Área de información
        textInfo = new JTextArea();
        textInfo.setEditable(false);
        JScrollPane scroll = new JScrollPane(textInfo);
        add(scroll, BorderLayout.CENTER);

        // Panel de botones
        JPanel panelBotones = new JPanel(new GridLayout(2, 2, 10, 10));
        btnViaje = new JButton("Registrar Viaje");
        btnCambiarCambio = new JButton("Cambiar Cambios");
        btnInflar = new JButton("Inflar Neumáticos");
        btnActualizar = new JButton("Actualizar Info");

        panelBotones.add(btnViaje);
        panelBotones.add(btnCambiarCambio);
        panelBotones.add(btnInflar);
        panelBotones.add(btnActualizar);
                
            
            
        add(panelBotones, BorderLayout.SOUTH);

        // Acciones
        btnActualizar.addActionListener(e -> mostrarInfo());

        btnViaje.addActionListener(e -> {
            Usuario u = getUsuarioSeleccionado();
            if (u != null && u.getBici() != null) {
                String kmStr = JOptionPane.showInputDialog("Kilómetros recorridos:");
                String tiempoStr = JOptionPane.showInputDialog("Tiempo (horas):");

                try {
                    double km = Double.parseDouble(kmStr);
                    double tiempo = Double.parseDouble(tiempoStr);
                    u.getBici().registrarViaje(km, tiempo);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Valores inválidos.");
                }
                mostrarInfo();
            }
        });

        btnCambiarCambio.addActionListener(e -> {
            Usuario u = getUsuarioSeleccionado();
            if (u != null && u.getBici() != null) {
                String nuevoCambio = JOptionPane.showInputDialog("Nuevo cambio (1-7):");
                try {
                    int cambio = Integer.parseInt(nuevoCambio);
                    u.getBici().setCambiosActuales(cambio);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Número inválido.");
                }
                mostrarInfo();
            }
        });

        btnInflar.addActionListener(e -> {
            Usuario u = getUsuarioSeleccionado();
            if (u != null && u.getBici() != null) {
                String psiStr = JOptionPane.showInputDialog("Nueva presión (0-70 PSI):");
                try {
                    double psi = Double.parseDouble(psiStr);
                    u.getBici().setPresionNeumaticos(psi);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Número inválido.");
                }
                mostrarInfo();
            }
        });

        // Mostra la info inicial
        mostrarInfo();
    }

    private Usuario getUsuarioSeleccionado() {
        return (Usuario) comboUsuarios.getSelectedItem();
    }

    private void mostrarInfo() {
        Usuario u = getUsuarioSeleccionado();
        if (u != null && u.getBici() != null) {
            Bicicleta bici = u.getBici();
            String info = "Usuario: " + u.getNombre() + "\n" +
                          "Bicicleta: " + bici.getModelo() + " (" + bici.getModo() + ")\n" +
                          "Distancia recorrida: " + bici.getDistanciaRecorrida() + " km\n" +
                          "Velocidad promedio: " + bici.getVelocidadPromedio() + " km/h\n" +
                          "Cambios actuales: " + bici.getCambiosActuales() + "\n" +
                          "Presión neumáticos: " + bici.getPresionNeumaticos() + " PSI\n" +
                          "¿Necesita inflado?: " + (bici.necesitaInflado() ? "Sí" : "No") + "\n" +
                          "¿Toca service?: " + (bici.tocaPrimerService() ? "Sí" : "No");

            textInfo.setText(info);
        } else {
            textInfo.setText("El usuario no tiene bicicleta asignada.");
        }
    }
}
