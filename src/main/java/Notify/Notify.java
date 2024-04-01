/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Notify;

import Views.Main_Window;
import Models.Main_Model;
import Controllers.Controller;

/**
 *
 * @author nando
 */
public class Notify {

    public static void main(String[] args) {
        Main_Window theView = new Main_Window();
        Main_Model theModel = new Main_Model();
        Controller theController = new Controller(theView,theModel);

        theView.setVisible(true);
    }
}
