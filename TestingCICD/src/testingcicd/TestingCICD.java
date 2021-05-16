/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingcicd;
//File name TestingCICD.java
public class TestingCICD
{ // member variables or instance variables or attributes
   private int width;
   private int height;
   private int depth;

// methods
   public void setDimension (int w, int h, int d)
   {
       width = w;
       height = h;
       depth = d;
   }

   public int volume () 
   {
       return width* height* depth;
   }

   public static void main(String args[])
   {
      TestingCICD obj1 = new TestingCICD ();
      obj1.setDimension(3,6,10);
      System.out.println("Volume: "+obj1.volume());
    }
}
