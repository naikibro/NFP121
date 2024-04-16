package gui;

import javax.swing.*;

import entreprise.Entreprise;
import users.Admin;
import users.Member;
import java.awt.*;
import java.awt.event.*;

public class UserAdminGUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField nameField, titleField;
    private JTextArea outputArea;
    private Entreprise entreprise;
    
    public UserAdminGUI() {
        
    	super("User and Admin Management");
        
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Entreprise title
        JPanel entreprisePanel = new JPanel();
        Entreprise entreprise = new Entreprise("Naiki entreprise", 1, null);
        entreprisePanel.add(new JLabel("Mon entreprise : " + entreprise.name));
        
        // Input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.add(new JLabel("Ajouter un Member à l'entreprise"));
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Title :"));
        titleField = new JTextField();
        inputPanel.add(titleField);

        // Output area
        outputArea = new JTextArea(5, 20);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Panel for input and output
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(inputPanel, BorderLayout.NORTH);
        centerPanel.add(scrollPane, BorderLayout.CENTER);

        // Adding panels to the frame
        add(entreprisePanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel();
        JButton addMemberButton = new JButton("Add Member");
        JButton addAdminButton = new JButton("Add Admin");
        buttonPanel.add(addAdminButton);
        buttonPanel.add(addMemberButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Event listeners
        addAdminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String title = titleField.getText();
                System.out.println("Adding admin: " + name + " with title " + title); // Debugging line
                if (!name.isEmpty() && !title.isEmpty()) {
                    Admin newAdmin = new Admin(name, title);
                    outputArea.append("\n"+newAdmin.present());
                }
            }
        });
        
        addMemberButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                System.out.println("Adding member: " + name);
                if (!name.isEmpty()) {
                    Member newMember = new Member(name);
                    outputArea.append("\n"+newMember.present());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UserAdminGUI().setVisible(true);
            }
        });
    }
}
