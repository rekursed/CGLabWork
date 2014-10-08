/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package base;
import Library.FacesNObjects.*;
import Library.PointsNVectors.*;
import java.io.FileNotFoundException;
/**
 *
 * @author mrh30
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vector3D v = new Vector3D(1,2,3);
        Vector3D u = new Vector3D(4,5,6);
        
        System.out.println(v.dotProduct(u));
        String file = "res/cube.dat";
        GObject obj = new GObject("res/cube.dat");
        System.out.print(obj.toString());
    }
    
}
