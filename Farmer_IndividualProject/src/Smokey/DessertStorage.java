/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Smokey;

/**
 *
 * @author sr115
 */
public class DessertStorage {
    
    public DessertStorage()
    {}
    
    private String dessertName;//Stores the name of the Dessert
    private String ingredients;//Stores the ingredients
    private String directions;
    private String timeToPrep;
    private String timeToReady;
    private String servings;
    
    
    //-------------------SETTERS---------------------------------------------------------
    
   public void setServing(String serves)
   {this.servings = serves;}
    
    public void setName(String name)
   {this.dessertName = name;}
   
   public void setIngredients(String ingred)
   {this.ingredients = ingred;}
   
   public void setDirections(String direct)
   {this.directions = direct;}
   
   public void setPrep(String prep)
   {this.timeToPrep = prep;}
   
   public void setReady(String ready)
   {this.timeToReady = ready;}
   
   
   //---------------------------GETTERS-------------------------------------------------------
   
    public String getServings()
    {return servings;}
    
    public String getName()
    {return dessertName;}
    
    public String getIngredients()
    {return ingredients;}
    
    public String getDirections()
    {return directions;}
    
    public String getPrepTime()
    {return timeToPrep;}
    
    public String getReady()
    {return timeToReady;}
    
}
