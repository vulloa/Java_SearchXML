/**
 * Created by ulloav on 5/25/2016.
 */

import javax.swing.*;

public class searchGUI extends JFrame {
    /*
        Creates the GUI
        Text Entry to Search term
        Option for user selection of directory
        Area that displays user entry of search and directory
        Results box, List Box
        Exit Button
     */

    //  GUI objects
    JPanel searchPanel;
    JPanel searchDetailsPanel;
    JPanel ResultsPanel;

    JLabel searchTermLabel;
    JLabel searchFolderLabel;

    //  constructor
    public searchGUI()  {
        setTitle("Search BAM Archives");
        setSize(300,500);   // width, height
        //setLocation(0,0);
    }



}
