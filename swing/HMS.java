import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HMS extends JFrame {

    private Connection connection;

    public HMS() {
        super("Hospital Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel dobLabel = new JLabel("Date of Birth (YYYY-MM-DD):");
        JTextField dobField = new JTextField();
        JLabel genderLabel = new JLabel("Gender:");
        JTextField genderField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();

        JButton addPatientButton = new JButton("Add Patient");
        JButton addDoctorButton = new JButton("Add Doctor");
        JButton scheduleAppointmentButton = new JButton("Schedule Appointment");
        JButton viewAppointmentsButton = new JButton("View Appointments");
        JButton viewPatientHistoryButton = new JButton("View Patient History");
        JButton updatePatientInfoButton = new JButton("Update Patient Information");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(dobLabel);
        panel.add(dobField);
        panel.add(genderLabel);
        panel.add(genderField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(addPatientButton);
        panel.add(addDoctorButton);
        panel.add(scheduleAppointmentButton);
        panel.add(viewAppointmentsButton);
        panel.add(viewPatientHistoryButton);
        panel.add(updatePatientInfoButton);

        add(panel);
        setVisible(true);

        // Connect to the database
        connectToDatabase();

        addPatientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String dob = dobField.getText();
                String gender = genderField.getText();
                String address = addressField.getText();
                addPatient(name, dob, gender, address);
            }
        });

        // Add action listeners for other buttons
        // Similar to the above button
    }

    private void connectToDatabase() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/hospital";
            String user = "yourusername";
            String password = "yourpassword";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database.");

            // Create tables if they don't exist
            createTables();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTables() {
        try {
            Statement statement = connection.createStatement();
            String createPatientsTable = "CREATE TABLE IF NOT EXISTS patients (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255)," +
                    "dob DATE," +
                    "gender VARCHAR(10)," +
                    "address TEXT)";
            statement.executeUpdate(createPatientsTable);

            // Create tables for doctors, appointments, and bills similarly
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void addPatient(String name, String dob, String gender, String address) {
        try {
            String query = "INSERT INTO patients (name, dob, gender, address) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setDate(2, Date.valueOf(dob));
            preparedStatement.setString(3, gender);
            preparedStatement.setString(4, address);
            preparedStatement.executeUpdate();
            System.out.println("Patient added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add methods for adding doctor, scheduling appointment, viewing appointments,
    // viewing patient history, updating patient info

    public static void main(String[] args) {
        new HMS();
    }
}
