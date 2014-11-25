/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Library.AnimationScene.Scene;
import Library.FacesNObjects.GObject;
import Library.FacesNObjects.Matrix;
import Library.PointsNVectors.*;

/**
 *
 * @author mrh30
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Vector3D v = new Vector3D(1, 2, 3);
        Vector3D u = new Vector3D(4, 5, 6);

        String[] file = {"res/cube.dat"};
//        GObject obj = new GObject("res/cube.dat");
//        System.out.print(obj.toString());
        Scene s = new Scene(file);
        Matrix m = new Matrix();
        m.m[0][0] = 1;
        m.m[0][1] = 2;
        m.m[1][0] = 3;
        m.m[1][1] = 4;
        for (int p = 0; p < 4; p++) {
            for (int q = 0; q < 4; q++) {
                System.out.print(m.m[p][q] + " ");
            }
            System.out.println();

        }

        s.transform(m);
    }

    public static Vector3D faceNormal(Point3D p1, Point3D p2, Point3D p3) {
        /*
         Suppose we have 3 vertices of a polygon in counterclockwise order viewing from its front: p1, p2 and p3.
         Then vectors v1=p2-p1 and v2=p3-p1 are two vectors in the plane of the polygon, 
         and the vector n=v1*v2 (cross product) is the surface normal of the plane and the polygon
        
         */
        Vector3D v1 = new Vector3D(p2.x - p1.x, p2.y - p1.y, p2.z - p1.z);
        Vector3D v2 = new Vector3D(p3.x - p1.x, p3.y - p1.y, p3.z - p1.z);
        Vector3D res = v1.crossProduct(v2);
        return res;
    }

    public static boolean isFrontFace(Point3D p1, Point3D p2, Point3D p3, Vector3D vpn) {
        Vector3D n = faceNormal(p1, p2, p3);
        boolean res = vpn.dotProduct(n) > 0 ? true : false;
        return res;
    }

}
