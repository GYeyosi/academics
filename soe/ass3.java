/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author placements2019
 */
public class Ass3 {
    
    /**
     * @param args the command line arguments
     */
    public static String getCode(String file) throws IOException{
        String code = "";
        try (FileInputStream in = new FileInputStream(file)) {
           int c;
           while ((c = in.read()) != -1) {
               code += (char)c;
           }
        }
        return code;
    }
    public static void getFunc(String code){
        String regex="((?!((signed )*(long )*(int))|((signed |unsigned )*char)|(long *double)|float|void))\\s{1}\\w*\\(.*\\)\\s*\\{";
        String li[];
        li= code.split("(((signed )*(long )*(int))|((signed |unsigned )*char)|(long *double)|float|void)\\s{1}\\w*\\(.*\\)");
        
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(code);
        
        int i=1;
        
        while(m.find()){
           // System.out.println(code.substring(m.start(), m.end()));
            String x=code.substring(m.start(), m.end());
           //System.out.println(m.start()+" "+x.indexOf('('));
            String FunctName="Function"+x.substring(0,x.indexOf('('));
          System.out.println(FunctName);
            int funcC=0;
             Pattern pattern1 = Pattern.compile(regex);
            Matcher m1 = pattern1.matcher(code);
            
            
            
            
        }
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String code = getCode(System.getProperty("user.dir")+"/example.c");
        FileOutputStream out = new FileOutputStream(System.getProperty("user.dir")+"/output.txt");
       //System.out.println(code);
        getFunc(code);
        Pattern x= Pattern.compile("aa(?!aa)");
       System.out.println(x.matcher("aabaa").matches());
        
        
        
    }
    
}