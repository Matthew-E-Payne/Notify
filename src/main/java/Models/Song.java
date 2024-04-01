/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.io.File;
/**
 *
 * @author nando
 */
public class Song {
    private final File theSong;
    private final File theSongArt;
    public Song(File Song_File, File Song_Art_File){
        theSong=Song_File;
        theSongArt=Song_Art_File;
    }
    
    public String Get_Song_Title(){
        return theSong.getName();
    }
    
    public String Get_Duration(){
        return "";
    }
    
}
