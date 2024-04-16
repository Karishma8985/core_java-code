import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;

public class videoupload extends JFrame {
    public videoupload() {
            setLayout(new BorderLayout());
    
            //file you want to play
            URL mediaURL = Player mediaPlayer = Manager.createRealizedPlayer(mediaURL);
            //get components for video and playback controls
            Component video = mediaPlayer.getVisualComponent();
            Component controls = mediaPlayer.getControlPanelComponent();
            add(video,BorderLayout.CENTER);
            add(controls,BorderLayout.SOUTH);
        }
}}
