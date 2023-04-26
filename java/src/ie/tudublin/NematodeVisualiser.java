package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet {
    
    // loadNematode() method that would load the csv file and populate an arraylist of nematode objects
        // load the csv file
        public void loadNematodes() {
            Table t = loadTable("nematodes.csv", "header");
            for(TableRow r:t.rows())
            {
                Nematodes n = new Nematodes(r);
                nematodes.add(n);
            }
        }
	
	
        // create an arraylist of nematode objects
        ArrayList<Nematodes> nematodes = new ArrayList<Nematodes>();
        // populate the arraylist with nematode objects
        
    

}
