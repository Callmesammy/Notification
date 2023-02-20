
package Component;

import java.awt.Color;
import java.awt.Graphics; dg vu
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;
hf

public class Bell extends JButton{

    private BufferedImage image;
    private Color color; 
    public Bell() {
        setUI(new Basicbell());
    }
    
    
    
    public class Basicbell extends BasicButtonUI{

        @Override
        protected void paintIcon(Graphics g, JComponent c, Rectangle iconRect) {
            super.paintIcon(g, c, iconRect); 
        }
        
        
        
    }
}
