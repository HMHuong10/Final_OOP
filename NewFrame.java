import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class NewFrame implements ActionListener {
    public static void main(String args[]){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            NewFrame khung=new NewFrame();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private JFrame  frame;
    private JPanel  Features,Settings;
    private JPanel  BaDepartments,MasDepartment;
    private JButton ICT,MST,FST,Space,Energy;
    private JButton Courses,Bachelor,Master,Supporting;
    private JButton AddCourse,Delcourse,Options;
    private JLabel  Logo;



    NewFrame(){

        Features   =new JPanel(new GridLayout(6,1));
        Courses    =new JButton("Courses");
        Bachelor   =new JButton("Bachelor");
        BaDepartments=new JPanel(new GridLayout(5,2));
        BaDepartments.setVisible(false);
        Master     =new JButton("Master");
        Supporting =new JButton("Supporting");
        Features.add(Courses);
        Features.add(Bachelor);
        Features.add(BaDepartments);
        Features.add(Master);
        Features.add(Supporting);

        ICT  =new JButton("ICT");
        MST  =new JButton("MST");
        FST  =new JButton("FST");
        Space=new JButton("Space");
        Energy=new JButton("Energy");
        BaDepartments.add(ICT);
        BaDepartments.add(MST);
        BaDepartments.add(FST);
        BaDepartments.add(Space);
        BaDepartments.add(Energy);




        Settings   =new JPanel(new GridLayout(1,4));
        Logo       =new JLabel("Logo USTH here");
        AddCourse  =new JButton("Add a course");
        Delcourse  =new JButton("Delete a course");
        Options    =new JButton("Options");
        Settings.add(Logo);
        Settings.add(AddCourse);
        Settings.add(Delcourse);
        Settings.add(Options);








        frame=new JFrame("Courses Management");
        frame.setForeground(Color.WHITE);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(100,100);
        frame.setSize(300,270);
        frame.setLayout(new BorderLayout());

        frame.add(Features,BorderLayout.WEST);
        frame.add(Settings,BorderLayout.NORTH);


        frame.setVisible(true);
        frame.pack();
    }

    public void actionPerformed(ActionEvent event){

    }
}
