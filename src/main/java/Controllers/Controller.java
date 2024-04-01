/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Main_Model;
import Models.Playlist;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Views.Main_Window;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author nando
 */
public class Controller {
    
    // GLOBAL VARIABLE DECLARATION
    private final Main_Window theView;
    private final Main_Model theModel;
    private Playlist _Playlist = new Playlist();
    //private final Ideal_Gas_Model theModel;
    
    public Controller(Main_Window view,Main_Model model){
        this.theView=view;
        this.theModel=model;
        
        this.theView.Import_Song_Button_Listener(new Calculate_Button_Listener());
    }
    
    
    public class Calculate_Button_Listener implements ActionListener {
         
        @Override
        public void actionPerformed(ActionEvent e) {
            String command;
            
            try{
                command = e.getActionCommand();
                
                if(command.equals("Import Song")){
                    _Playlist.Add_Song(theModel.addSong(theView));
                    theView.Set_Song_Table_Model(_Playlist.Get_Table_Model());
                }
            }
            catch (Exception exm) {
                System.out.println(exm.getMessage());
            }
        }
    }
}
