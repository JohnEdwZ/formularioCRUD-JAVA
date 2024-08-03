package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PersonFormView extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JButton saveButton;

    public PersonFormView() {
        super("Registro de Personas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel firstNameLabel = new JLabel("Nombre:");
        JLabel lastNameLabel = new JLabel("Apellido:");
        firstNameField = new JTextField(20);
        lastNameField = new JTextField(20);
        saveButton = new JButton("Guardar");

        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(new JLabel()); // filler
        add(saveButton);

        pack();
        setLocationRelativeTo(null); // Centrar ventana
        setVisible(true);
    }

    public String getFirstName() {
        return firstNameField.getText();
    }

    public String getLastName() {
        return lastNameField.getText();
    }

    public void setSaveButtonListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }

    // Métodos para actualizar la vista según operaciones CRUD

    // Ejemplo:
    public void clearFields() {
        firstNameField.setText("");
        lastNameField.setText("");
    }
}

