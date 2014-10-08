/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.FacesNObjects;

import Library.PointsNVectors.Point3D;
import java.util.Scanner;
import java.io.*;
import java.awt.Color;

/**
 *
 * @author mrh30
 */
public class GObject {

    public Point3D[] vertex;
    public Face[] face;

    public GObject(Point3D[] v, Face[] f) {
        this.vertex = v;
        this.face = f;
    }

    public GObject(String fileName) {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(fileName)));

            while (sc.hasNext()) {
                int n = sc.nextInt();  // n - Number of vertices
                Point3D[] vers = new Point3D[n];
                for (int i = 0; i < n; i++) {  /// Taking input for each vertex
                    double x = sc.nextDouble();
                    double y = sc.nextDouble();
                    double z = sc.nextDouble();
                    vers[i] = new Point3D(x, y, z);
                }
                int m = sc.nextInt();  // m - Number of faces
                Face[] faces = new Face[m];
                for (int i = 0; i < m; i++) {
                    int nv = sc.nextInt(); // nv - number of vertices in each face;
                    int[] fVers = new int[nv]; // face vertices array
                    for (int j = 0; j < nv; j++) {  // Input of each face vertex
                        fVers[j] = sc.nextInt();
                    }
                    float a = sc.nextFloat();
                    float b = sc.nextFloat();
                    float c = sc.nextFloat();
                    Color fc = new Color(a, b, c);  /// Color of face
                    faces[i] = new Face( fVers, fc);
                }
                this.vertex = vers;
                this.face = faces;

            }
        } catch (FileNotFoundException e) {
            System.out.println(e);

        }
    }

    public String toString() {/* Make it look nice to save your debugging time! */

        String str = "GObj has " + this.vertex.length + " and " + this.face.length ;
        return str;
    }
}
