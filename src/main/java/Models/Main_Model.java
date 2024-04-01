/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import Views.Main_Window;
import javax.swing.JFileChooser;
import java.io.File;

//import Models.Song;

/**
 *
 * @author nando
 */
public class Main_Model {
    
    
    
    public void removeSong(Song song) {
        //TODO implement a method to remove current song from library
        // stops the current song
        // saves that song as a temp
        // begins the playing of the next song
        // removes the temp song from library
        // updates the gui

    }
    
    public Song addSong(Main_Window view) {
        //TODO implement a method to add a new song to the library
        // opens a file browser where the user will select the song file
        JFileChooser Song_File_Dialog = new JFileChooser();
        Song_File_Dialog.setDialogTitle("Choose Song File");
        Song_File_Dialog.setCurrentDirectory(new File(System.getProperty("user.home")));
        int Song_File_Dialog_Result = Song_File_Dialog.showOpenDialog(view);
        if (Song_File_Dialog_Result == JFileChooser.APPROVE_OPTION) {
            File Song_File_Dialog_Selected_File = Song_File_Dialog.getSelectedFile();
            
            // opens a file browser where the user will select the artwork
            JFileChooser Song_Art_File_Dialog = new JFileChooser();
            Song_Art_File_Dialog.setDialogTitle("Choose Song File");
            Song_Art_File_Dialog.setCurrentDirectory(new File(System.getProperty("user.home")));
            int Song_Art_File_Dialog_Result = Song_Art_File_Dialog.showOpenDialog(view);
            if (Song_Art_File_Dialog_Result == JFileChooser.APPROVE_OPTION) {
                File Song_Art_File_Dialog_Selected_File = Song_Art_File_Dialog.getSelectedFile();
                // decodes the file to store relevant data as an instance of class Song
                // saves the file to the same instance of class Song
                Song tempSong = new Song(Song_File_Dialog_Selected_File,Song_Art_File_Dialog_Selected_File);
                return tempSong;
                //this._Playlist.Add_Song(tempSong);
                
                // updates the gui
                //DefaultTableModel model = (DefaultTableModel) view.Song_Table.getModel();

            }
            return null;
            
        }
        return null;
        

    }
    
    public void play(CurrentSong song) {
        //TODO implement method to play current song
        // finds the current position from the current song
        // plays that song from that position
        // updates the gui
        
    }
    
    public void pause(CurrentSong song) {
        //TODO implement method to pause a song
        // gets the current song
        // saves the position in the song
        // stops the song
        // updates the gui
        
    }
    
    public void stop(CurrentSong song) {
        //TODO implement method to stop a song
        // gets the current song
        // no longer plays the song
        // updates the gui
        
    }
    
    public void next(CurrentSong song) {
        //TODO implement method to go to the next song in playlist
        // gets the current song
        // stops the song
        // finds the next song from current song (stored in the class)
        // sets next song to current song
        // plays the song
        // updates the gui
        
    }
    
    public void previous(CurrentSong song) {
        //TODO implement method to go to the previous song in playlist
        // gets the current song
        // stops the song
        // finds the previous song from current song (stored in the class)
        // sets next song to current song
        // plays the song
        // updates the gui
        
    }
    
    public void setVolume(int volume) {
        //TODO implement method to set volume
        // gets the value from the slider's position
        // updates volume of playback
        
    }
    
    public void seek(int position) {
        //TODO implement method to set position in song
        // gets the value from the slider's position
        // updates the CurrentSong's position (stored in the class)
        // updates the gui
    }
    
    public void selectSong() {
        //TODO implement method to select song from table
        // takes index value from Input_Song_Choice
        // ensures that that value is logical and in range
        // stops current song
        // sets song with index value to current song
        // plays that song
        // updates the gui
    }
    
    public CurrentSong getCurrentSong() {
        CurrentSong current_song = new CurrentSong();
        //TODO implement method to get the current song
        // returns the instances of current song class
        
        return current_song;
    }
    
    public CurrentSong updateCurrentSong(Song song) {
        CurrentSong current_song = new CurrentSong();
        //TODO implement method to take the input song and establish that as
        //     the new current song
        // updates the gui
        return current_song;
    }   
    
    public void updateView() {
        //TODO implement method to update the gui in its entirety
       
    }
    
    public void loadArtwork(Song song){
        //TODO implement method to load the current song's artwork to the 
        //     appropriate place on the gui
        
    }
    
    public void updateProgress(int progress) {
        //TODO implement method to update the progress bar with the current
        //     song's position
        
    }
    
    public void handleError(int error_number) {
        //TODO implement error handling methods here
    
    }
    
    public void clearPlaylist() {
        //TODO implement method to remove every song from the playlist
    }
    
    public void savePlaylist() {
        //TODO implement method to save playlist to be reopened next session
    }
    
    public void saveCurrentSong() {
        //TODO implement method to save current song to be reopened next session
    
    }
    
    public void saveCurrentPosition() {
        //TODO implement method to save current's songs position to be reopened
        //     next session
        
    }
    
    public void playFromLastSession() {
        //TODO implement method to load the last song and its position as the 
        //     current song and position
        
    }
    
    public void exitNotify() {
        //TODO implement method to save playlist, song, and position and close
        //     the application
        
    }
}
