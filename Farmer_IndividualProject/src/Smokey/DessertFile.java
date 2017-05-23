package Smokey;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sr115
 */
public class DessertFile {
    
    List<DessertStorage> theList = new ArrayList<>();
    String choice;
    
    public DessertFile()
    {}
    
    public boolean ReadFile()
    {
        DessertStorage storage;       
        boolean success = true;
        
        String[] fields;
        String something;  
        String name;
        String gred;
        String direct;
        String prepTime;
        String readTime;
        String serves;
        
        try {
            
            //creates object of file specified
            File dessertFile = new File("src/Smokey/Dessert.txt");
            
            if(dessertFile.exists())
            {
           
                Scanner scan = new Scanner(dessertFile);
                
                //scanning the file and storing all the information in the list as objects
                while(scan.hasNext())
                {
                    something = scan.nextLine();
                    storage = new DessertStorage();
                    fields = something.split("\\|");
                    
                    name = fields[0];
                    gred = fields[1];
                    direct = fields[2];
                    prepTime = fields[3];
                    readTime = fields[4];
                    serves = fields[5];
                    
                    storage.setName(name);
                    storage.setIngredients(gred);
                    storage.setDirections(direct);
                    storage.setPrep(prepTime);
                    storage.setReady(readTime);
                    storage.setServing(serves);
                    
//                    storage.setName(fields[0]);
//                    storage.setIngredients(fields[1]);
//                    storage.setDirections(fields[2]);
//                    storage.setPrep(fields[3]);
//                    storage.setReady(fields[4]);
                    
                    theList.add(storage);
                      
                }//End of while loop
                
                scan.close();
            
            }//End of if statement
            
        }//End of try
        catch (FileNotFoundException ex)
        {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "File Could Not Be Found\n" + "         -DessertFile", "Error", JOptionPane.ERROR_MESSAGE);      
            success = false;
            return success;
        }//End of Catch
        
        catch (Exception ex)
        {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Something Went Wrong!!\n" + "         -DesserFilet\n\n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
            success = false;
            return success;
        }//End of Catch
       
        return success;
    }//end of readFile
    
    
    
    
     //--------GETTERS----------
    
        public String getServings(int index)
        { return theList.get(index).getServings(); }
        
        public String getName(int index)
        { return theList.get(index).getName(); }

        public String getIngredients(int index)
        { return theList.get(index).getIngredients(); }

        public String getDirections(int index)
        { return theList.get(index).getDirections(); }

        public String getPrepTime(int index)
        { return theList.get(index).getPrepTime(); }
        
        public String getReadyTime(int index)
        { return theList.get(index).getReady(); }
        
        public int getNumber()
        { return theList.size();}
        
        
        
}//end of Class
