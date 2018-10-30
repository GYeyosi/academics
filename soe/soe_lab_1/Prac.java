/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

import java.util.ArrayList;
import java.util.regex.*;

public class Prac {
    
  
    public static void main(String[] args) {
        String line = "int x,y,z;";
        String pattern = "(int)(\\s+)(.*);";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        int count=0;
        if(m.find()){
            String s = m.group(0);
            //ArrayList<String> l = new ArrayList<String>();
            String l[];
            l=s.split(",");
            System.out.println(l.length);
        }
        
        
//        Pattern p1 = Pattern.compile("a*b");
//      String INPUT;
//      // get a matcher object
//      Matcher m1 = p1.matcher("aaaabfoooaaababgoo"); 
//      INPUT = m1.replaceAll("-");
//      System.out.println(INPUT);
        
        
    }
    
}
