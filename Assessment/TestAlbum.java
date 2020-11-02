package Assessment;

import javax.swing.*;

public class TestAlbum{
    public static void main(String args)
        {
           Song s1 = new Song("Track number" + int.getTrackID());

           //Arrays

            trackID = JOptionPane.showInputDialog(null,"Which track number would you like to play?","Input", null);

            JOptionPane.showMessageDialog(null,"Now playing track - details are as follows: \n\n" + s1 );

        }
}