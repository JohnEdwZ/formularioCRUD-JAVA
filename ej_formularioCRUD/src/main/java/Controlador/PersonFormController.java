package Controlador;

import Modelo.PersonModel;
import Vista.PersonFormView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonFormController {
    private PersonFormView view;
    private PersonModel model;

    public PersonFormController(PersonFormView view, PersonModel model) {
        this.view = view;
        this.model = model;

        view.setSaveButtonListener(new SaveButtonListener());
    }

    class SaveButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String firstName = view.getFirstName();
            String lastName = view.getLastName();

            // Lógica para guardar en la base de datos (usar el modelo para las operaciones CRUD)
            // Ejemplo básico:
            model.addPerson(firstName, lastName);

            // Actualizar la vista si es necesario (ej. limpiar campos)
            view.clearFields();
        }
    }
}
