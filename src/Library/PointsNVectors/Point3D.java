/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.PointsNVectors;
import java.lang.Math.*;
/**
 *
 * @author mrh30
 */
public class Point3D {

    public double x, y, z;
    
    // constructor
    public Point3D(double X, double Y, double Z) {
        this.x = X;
        this.y = Y;
        this.z = Z;
    }

    public double distance(Point3D p) {
        return Math.sqrt(((this.x - p.x)*(this.x - p.x)) + ((this.y - p.y)*(this.y - p.y)) +((this.z - p.z)*(this.z - p.z)));
    }

    public String toString() {/* Make it look nice to save your debugging time! */
       
        return new String("Point (x,y,z) = [" + this.x+"  "+this.y+"  "+this.z); 
    }
    public Vector3D vector(Point3D p){
    /* return the vector that is between this point and p.*/
        Vector3D v = new Vector3D(p.x-this.x , p.y-this.y, p.z-this.z);
        return v;
    }
}
