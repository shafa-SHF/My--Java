package phoneApp;

import javax.swing.*;
import java.awt.*;

public class ContactGUI extends JFrame {

    DefaultListModel<Contact> model;
    JList<Contact> list;
    JTextField txtName, txtPhone;

    public ContactGUI() {

        setTitle("Contact Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        model = new DefaultListModel<>();
        list = new JList<>(model);

        add(new JScrollPane(list), BorderLayout.CENTER);

        JPanel panelInput = new JPanel(new GridLayout(2,2));

        panelInput.add(new JLabel("Name"));
        txtName = new JTextField();
        panelInput.add(txtName);

        panelInput.add(new JLabel("Phone"));
        txtPhone = new JTextField();
        panelInput.add(txtPhone);

        add(panelInput, BorderLayout.NORTH);

        JPanel panelButton = new JPanel();

        JButton btnAdd = new JButton("Add");
        JButton btnEdit = new JButton("Edit");
        JButton btnDelete = new JButton("Delete");

        panelButton.add(btnAdd);
        panelButton.add(btnEdit);
        panelButton.add(btnDelete);

        add(panelButton, BorderLayout.SOUTH);

        // Add
        btnAdd.addActionListener(e -> {
            model.addElement(
                new Contact(
                    txtName.getText(),
                    txtPhone.getText()
                )
            );
        });

        // Edit
        btnEdit.addActionListener(e -> {
            int index = list.getSelectedIndex();

            if(index != -1){
                Contact c = model.get(index);

                c.setName(txtName.getText());
                c.setPhone(txtPhone.getText());

                list.repaint();
            }
        });

        // Delete
        btnDelete.addActionListener(e -> {
            int index = list.getSelectedIndex();

            if(index != -1){
                model.remove(index);
            }
        });

        // Display selected data
        list.addListSelectionListener(e -> {
            Contact c = list.getSelectedValue();

            if(c != null){
                txtName.setText(c.getName());
                txtPhone.setText(c.getPhone());
            }
        });

        setVisible(true);
    }
}
