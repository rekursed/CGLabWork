package Library.PointsNVectors;

import static java.lang.Math.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrh30
 */
public class Vector3D implements Cloneable {

    public double x, y, z;

    public Vector3D(double X, double Y, double Z) {
        this.x = X;
        this.y = Y;
        this.z = Z;
    }

    public String toString() {/* Make it look nice to save your debugging time! */
        return new String("Vector (x,y,z) = [ " + this.x+"  "+this.y+"  "+this.z+" ]");
    }
    public Vector3D clone() throws CloneNotSupportedException {
        return new Vector3D(this.x, this.y, this.z);
    }

    public double L2norm() {
        return sqrt((this.x * this.x) + (this.y * this.y) + (this.z * this.z));
    }

    public double dotProduct(Vector3D v) {
        return ((this.x * v.x) + (this.y * v.y) + (this.z * v.z));
    }

    public Vector3D crossProduct(Vector3D v) {
        Vector3D res = new Vector3D(0, 0, 0);
        res.x = (this.y * v.z - this.z * v.y);
        res.y = (this.z * v.x - this.x * v.z);
        res.z = (this.x * v.y - this.y * v.x);

        return res;
    }

    public void normalize() {
        double length = this.L2norm();
        if (length > 0) {
            this.x = this.x / length;
            this.y = this.y / length;
            this.z = this.z / length;
        }
    }

}
