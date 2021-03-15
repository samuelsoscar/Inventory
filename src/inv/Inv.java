package inv;

import GUI.Login;
import GUI.MenuPrincipal;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import javax.swing.UIManager;
import org.jvnet.substance.SubstanceLookAndFeel;

public class Inv {
    
    public static void main(String[] args) throws Exception {
        
    // JFrame.setDefaultLookAndFeelDecorated(true);
    SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.SaharaSkin");

      // UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
       
      /* Login login = new Login();
       login.setVisible(true);
       login.setLocationRelativeTo(null);
       */
       MenuPrincipal screen = new MenuPrincipal();
       screen.setVisible(true);
       screen.setLocationRelativeTo(null);
       
           
       
    }
    
}
