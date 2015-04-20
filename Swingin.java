/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingin;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JFrame; //provides basic window features
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane; //displays dialog messages
import javax.swing.JTextField;

/**
 *
 * @author Niems
 */
public class Swingin extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    private static final String file = "File";
    private static final String exit = "Exit";
    
    private static JMenuBar menubar;
    private static JMenu menu_file;
    private static JMenuItem menu_item;
    
    public Swingin(){
        super("Swing Test");
        setLayout(new FlowLayout());
        
        Swingin.menubar = new JMenuBar();
        
        Swingin.menu_file = new JMenu(file);
        
        
        
        JMenu level_1 = new JMenu("Level 1");
        JMenuItem level_item = new JMenuItem("Blank");
        level_1.add(level_item);
        
        level_item = new JMenuItem("Level 2");
        level_1.add(level_item);
        
        Swingin.menu_file.add(level_1);
        
        Swingin.menu_item = new JMenuItem("Exit");
        Swingin.menu_item.setMnemonic('x');
        Swingin.menu_item.addActionListener(Swingin.this);
        Swingin.menu_file.add(Swingin.menu_item);
        
        menubar.add(Swingin.menu_file);
        this.setJMenuBar(menubar);
    }
    
    public static void main (String[] args) {
        Swingin window = new Swingin();
        
        int num1 = 0, num2 = 0;
        String temp;
        
        try{
            //window properties
            window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            window.setSize(500,350);
            window.setVisible(true);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "You broke it   D:", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch(command){
            case exit:
                System.exit(0);
                break;
        }
    }
}
