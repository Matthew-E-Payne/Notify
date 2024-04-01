/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
//import Models.Song;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author bubba
 */
public class Playlist {
    private ArrayList<Song> _Playlist = new ArrayList<>();
    public void Add_Song(Song Input_Song){
        if(Input_Song != null){
            _Playlist.add(Input_Song);
        }
    }
    
    public DefaultTableModel Get_Table_Model(){
        DefaultTableModel tempModel = new DefaultTableModel();
        tempModel.addColumn("#");
        tempModel.addColumn("Title");
        tempModel.addColumn("Duration");
        
        int Index=0;
        for(Song current_song : _Playlist){
            String Title = current_song.Get_Song_Title();
            String Duration = current_song.Get_Duration();
            tempModel.addRow(new Object[]{Index, Title, Duration});
            Index++;
        }
        return tempModel;
    }
    
}
