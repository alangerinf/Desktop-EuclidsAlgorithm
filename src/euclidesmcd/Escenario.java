/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidesmcd;

import java.sql.Struct;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Escenario {
    
    
    private String name;
    
    private List<long[]> casos = new ArrayList<long[]>();
    
    private List<Integer> ite = new ArrayList<Integer>();
    
    public void addCaso(long A,long B){
        long x[] = new long[2];
            x[0] = A;
            x[1] = B;
        getCasos().add(x);
    }

    /**
     * @param casos the casos to set
     */
    public void setCasos(List<long[]> casos) {
        this.casos = casos;
    }

    /**
     * @return the ite
     */
    public List<Integer> getIte() {
        return ite;
    }

    /**
     * @param ite the ite to set
     */
    public void setIte(List<Integer> ite) {
        this.ite = ite;
    }

    /**
     * @return the casos
     */
    public List<long[]> getCasos() {
        return casos;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}
