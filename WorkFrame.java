
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WorkFrame implements ActionListener {
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            WorkFrame khung = new WorkFrame();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private JFrame frame;
    private JPanel Department, Courses, CoursesInfor, Options, Feedbacks;
    private JPanel fNorth;
    private JButton department, courses, options, feedbacks;
    private JButton Math, Informatics, Physics, Chemistry, Biology, Statistics, Calculus, Quantum, Organics, Cellular;
    private JButton ICT, MST, FST, Biotech, Space, Energy;
    private JLabel Lecturer, Ects, Duration, Notation;
    private int DepX = 0, CouX = 0;

    WorkFrame() {

        Department = new JPanel(new GridLayout(10, 1));
        Courses = new JPanel(new GridLayout(15, 1));
        CoursesInfor = new JPanel(new GridLayout(4, 2));
        Options = new JPanel(new GridLayout(1, 4));
        Feedbacks = new JPanel(new GridLayout(3, 3));
        fNorth = new JPanel(new GridLayout(1, 4));

        //Add features to the fNorth
        department = new JButton("Department");
        department.setBackground(Color.CYAN);
        department.addActionListener(this);

        courses = new JButton("Courses");
        courses.setBackground(Color.CYAN);
        courses.addActionListener(this);

        options = new JButton("Options");
        options.setBackground(Color.CYAN);
        feedbacks = new JButton("Feedbacks");
        feedbacks.setBackground(Color.CYAN);

        fNorth.add(department);
        fNorth.add(courses);
        fNorth.add(options);
        fNorth.add(feedbacks);


        // Making course buttons for Courses panel
        Math = new JButton("Math");
        Math.addActionListener(this);

        Informatics = new JButton("Informatics");
        Informatics.addActionListener(this);

        Physics = new JButton("Physics");
        Physics.addActionListener(this);

        Chemistry = new JButton("Chemistry");
        Chemistry.addActionListener(this);

        Biology = new JButton("Biology");
        Biology.addActionListener(this);

        Statistics = new JButton("Statistics");
        Statistics.addActionListener(this);

        Calculus = new JButton("Calculus");
        Calculus.addActionListener(this);

        Quantum = new JButton("Quantum");
        Quantum.addActionListener(this);

        Organics = new JButton("Organics");
        Organics.addActionListener(this);

        Cellular = new JButton("Cellular");
        Cellular.addActionListener(this);

        // Add course buttons to Course panel
        Courses.add(Math);
        Courses.add(Informatics);
        Courses.add(Physics);
        Courses.add(Chemistry);
        Courses.add(Biology);
        Courses.add(Statistics);
        Courses.add(Calculus);
        Courses.add(Quantum);
        Courses.add(Organics);
        Courses.add(Cellular);

        // Making terms for CourseInfor
        Lecturer = new JLabel();
        Ects = new JLabel();
        Duration = new JLabel();
        Notation = new JLabel();

        CoursesInfor.add(new JLabel("Lecturer"));
        CoursesInfor.add(Lecturer);
        CoursesInfor.add(new JLabel("Ects"));
        CoursesInfor.add(Ects);
        CoursesInfor.add(new JLabel("Duration"));
        CoursesInfor.add(Duration);
        CoursesInfor.add(new JLabel("Notation"));
        CoursesInfor.add(Notation);

        //Making Department buttons for Department panel
        ICT = new JButton("ICT");
        ICT.addActionListener(this);

        FST = new JButton("FST");
        FST.addActionListener(this);

        MST = new JButton("MST");
        MST.addActionListener(this);

        Energy = new JButton("Energy");
        Energy.addActionListener(this);

        Space = new JButton("Space");
        Space.addActionListener(this);

        Biotech = new JButton("Biotech");
        Biotech.addActionListener(this);

        Department.add(ICT);
        Department.add(FST);
        Department.add(MST);
        Department.add(Energy);
        Department.add(Space);
        Department.add(Biotech);

        frame = new JFrame("Course Management");
        frame.setForeground(Color.WHITE);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(100, 100);
        frame.setSize(450, 270);
        frame.setLayout(new BorderLayout());
        frame.add(fNorth, BorderLayout.NORTH);
        frame.setVisible(true);
        frame.pack();


    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == department) {
            CouX = 0;
            Courses.setVisible(false);
            Department.setVisible(true);
            if (DepX == 0) {
                frame.add(Department, BorderLayout.WEST);
                frame.pack();
                DepX = 1;
            }

        }
        if (event.getSource() == courses) {
            DepX = 0;
            Department.setVisible(false);
            Courses.setVisible(true);
            if (CouX == 0) {
                frame.add(Courses, BorderLayout.WEST);
                frame.pack();
                CouX = 1;
            }
        }
        if (event.getSource() == Math) {
            Lecturer.setText("Ng Anh Tu");
            Ects.setText("5");
            Duration.setText("50h");
            Notation.setText("Very hard");
            frame.add(CoursesInfor, BorderLayout.CENTER);
            frame.pack();
        }
        if (event.getSource() == Physics) {
        }
    }

    public void display(String subject){
        Lecturer.setText(subject);
    }
}
