
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//idb = new InfDB("C:\\db\\MIBDB.FDB");
/**
 *
 * @author Max
 */
public class Start {
     private static InfDB idb;
    
    public static void main(String[] args) {
        try {
          String aktuellMap = System.getProperty("user.dir");
          
          String sokVag = aktuellMap + ("\\db\\MIBDB.FDB");
          System.out.println(sokVag); // kollar från vilken map den tar
          idb = new InfDB(sokVag);
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "något gick fel");
        }

        new StartMeny(idb).setVisible(true);
    }
}
