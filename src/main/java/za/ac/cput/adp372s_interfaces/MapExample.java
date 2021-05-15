/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * author: AJ Mitchell
 * student nr.: 219024979
 * date: 12/05/2021
 * project description: using java collections
 */
package za.ac.cput.adp372s_interfaces;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapExample {
    private HashMap<Integer,String> brandsMap = new HashMap<Integer,String>();
    
    public HashMap<Integer,String> getMap(){
        return this.brandsMap;
    }
    
    public void add (Integer num, String brand){
        brandsMap.put(num,brand);
    }
    
    public void remove(Integer num){
        brandsMap.remove(num);
    }
    
    public boolean find(String brand){
        return brandsMap.containsValue(brand);
    }
}
