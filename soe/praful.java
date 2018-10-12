import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class RegexMatches {

   // private static final String REGEX = "\\bcat\\b";
   // private static final String INPUT = "cat cat cat cattie cat";

   public static void main( String args[] ) {
      String myWholeFile = null;

      try {
         File file = new File("IIT2016082_input.txt");
         FileReader fileReader = new FileReader(file);
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         StringBuffer stringBuffer = new StringBuffer();
         String line;

         while ((line = bufferedReader.readLine()) != null) {
            stringBuffer.append(line);
            stringBuffer.append("\n");
         }
         fileReader.close();
         System.out.println("Contents of file:");
         myWholeFile = stringBuffer.toString();
         System.out.println(stringBuffer.toString());
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      int i;
      ArrayList<String> datatypes = new ArrayList<String>(5);
      datatypes.add("int");
      datatypes.add("float");
      datatypes.add("double");      
      datatypes.add("char");
      
      ArrayList<String> loop = new ArrayList<String>(5);
      loop.add("for");
      loop.add("while");

      ArrayList<String> condition = new ArrayList<String>(5);
      condition.add("if");
      condition.add("else if");
      condition.add("else");

      System.out.println("question 1");
      for (i = 0; i < 4; i++)
      {
         System.out.println();
         System.out.println(datatypes.get(i) + " " + "datatype");
         String find = datatypes.get(i);
         Pattern p = Pattern.compile(find);
         Matcher m = p.matcher(myWholeFile);   // get a matcher object
         int count = 0;

         while(m.find()) {
            count++;
            // System.out.println("Match number "+count);
            // System.out.println("start(): "+m.start());
            // System.out.println("end(): "+m.end());

         }
         System.out.println(datatypes.get(i)+ " "+ "count "+ count);
      }

      for (i = 0; i < 4; i++)
      {
         System.out.println();
         System.out.println(datatypes.get(i) + " " + "Initials");
         String find = "(" + datatypes.get(i) + ")(\\s)([a-zA-Z]+)(\\s)*(=){1}(\\s)(.*)(;){1}";
         Pattern p = Pattern.compile(find);
         Matcher m = p.matcher(myWholeFile);   // get a matcher object
         int count = 0;

         while(m.find()) {
            count++;
            // System.out.println("Match number "+count  );
            // System.out.println("start(): "+m.start());
            // System.out.println("end(): "+m.end());

         }

         System.out.println(datatypes.get(i) + " variables " + " count " + count );
      }

      for (i = 0; i < 4; i++)
      {
         System.out.println();
         System.out.println(datatypes.get(i) + " " + "unInitials");
         String find = "(" + datatypes.get(i) + ")(\\s)([a-zA-Z]+)(;){1}";
         Pattern p = Pattern.compile(find);
         Matcher m = p.matcher(myWholeFile);   // get a matcher object
         int count = 0;

         while(m.find()) {
            count++;
            // System.out.println("Match number "+count  );
            // System.out.println("start(): "+m.start());
            // System.out.println("end(): "+m.end());

         }

         System.out.println(datatypes.get(i) + " variables " + " count " + count );
      }

      for (i = 0; i < 4; i++)
      {
         System.out.println();
         System.out.println(datatypes.get(i) + " " + "variables");
         String find = "(" + datatypes.get(i) + ")(\\s)([a-zA-Z]+)(\\s)*(.*)(;){1}";
         Pattern p = Pattern.compile(find);
         Matcher m = p.matcher(myWholeFile);   // get a matcher object
         int count = 0;

         while(m.find()) {
            count++;
            // System.out.println("Match number "+count  );
            // System.out.println("start(): "+m.start());
            // System.out.println("end(): "+m.end());

         }

         System.out.println(datatypes.get(i) + " variables " + " count " + count );
      }

      for (i = 0; i < 2; i++)
      {
         System.out.println();
         System.out.println(loop.get(i) + " " +"loop" + " matcher");
         String find = "("+ loop.get(i) + ")(..)";
         Pattern p = Pattern.compile(find);
         Matcher m = p.matcher(myWholeFile);   // get a matcher object
         int count = 0;

         while(m.find()) {
            count++;
            // System.out.println("Match number "+count );
            // System.out.println("start(): "+m.start());
            // System.out.println("end(): "+m.end());

         }
         System.out.println(loop.get(i) + " loop " + " count " + count );
      }


      for (i = 0; i < 2; i++)
      {
         System.out.println();
         System.out.println(condition.get(i) + " "+ "condition");
         String find = "("+ condition.get(i) + ")(..)";
         Pattern p = Pattern.compile(find);
         Matcher m = p.matcher(myWholeFile);   // get a matcher object
         int count = 0;

         while(m.find()) {
            count++;
            // System.out.println("Match number "+count );
            // System.out.println("start(): "+m.start());
            // System.out.println("end(): "+m.end());

         }

         System.out.println(condition.get(i) + " condition " + " count " + count );
      }

      for (i = 2; i <= 2; i++)
      {
         System.out.println();
         System.out.println(condition.get(i) + " "+ "condition");
         String find = condition.get(i);
         Pattern p = Pattern.compile(find);
         Matcher m = p.matcher(myWholeFile);   // get a matcher object
         int count = 0;

         while(m.find()) {
            count++;
            // System.out.println("Match number "+count );
            // System.out.println("start(): "+m.start());
            // System.out.println("end(): "+m.end());

         }

         System.out.println(condition.get(i) + " condition " + " count " + count );
      }

      for (i = 0; i < 4; i++)
      {
         System.out.println();
         System.out.println(datatypes.get(i) + "function matcher");
         String find = "(" + datatypes.get(i) + ")(\\s)[a-zA-Z]+({1}([a-zA-Z]+)){1}";
         Pattern p = Pattern.compile(find);
         Matcher m = p.matcher(myWholeFile);   // get a matcher object
         int count = 0;

         while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
            System.out.println("return Type" + ":" +datatypes.get(i));
         }
      }

      

      

      


   }
}