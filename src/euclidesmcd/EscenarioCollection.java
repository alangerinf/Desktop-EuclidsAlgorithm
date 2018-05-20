/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidesmcd;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class EscenarioCollection {
    
    private List <Escenario> collection = new ArrayList<Escenario>();
    
    public List<Escenario> getCollection(){
        return collection;
    }
    public void  addEscenario(Escenario esc){
        collection.add(esc);
    }

    
}
