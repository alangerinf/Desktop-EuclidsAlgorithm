/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidesmcd;

/**
 *
 * @author root
 */
public class Controler {
    
    public static EscenarioCollection escCol = new EscenarioCollection();
    
    Controler(){
        Escenario esc1  = new Escenario();
            esc1.setName("Escenario 1");
            esc1.addCaso(88888888888888888l, 444444444444444444l);
            esc1.addCaso(454514616516684l, 464646846464l);
            esc1.addCaso(454514616516684l, 464646846464l);
        Escenario esc2  = new Escenario();
            esc2.setName("Escenario 2");    
            esc2.addCaso(88888888888888888l, 444444444444444444l);
            esc2.addCaso(454514616516684l, 464646846464l);
            esc2.addCaso(454514616516684l, 464646846464l);
        Escenario esc3  = new Escenario();
            esc3.setName("Escenario 3");    
            esc3.addCaso(88888888888888888l, 444444444444444444l);
            esc3.addCaso(454514616516684l, 464646846464l);
            esc3.addCaso(454514616516684l, 464646846464l);
        escCol.addEscenario(esc1);
        escCol.addEscenario(esc2);
        escCol.addEscenario(esc3);
                
        
    }
}
