/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.AnimationScene;

import Library.FacesNObjects.GObject;
import Library.FacesNObjects.Matrix;
import java.awt.*;

/**
 *
 * @author mrh30
 */
public class Scene {

    private GObject[] obj;

    public Scene(String[] fileName) {
        GObject[] OBJ = new GObject[fileName.length];
        int i = 0;
        for (String file : fileName) {
            OBJ[i++] = new GObject(file);
        }
        this.obj = OBJ;
    }

    public void transform(Matrix m) {
//        System.out.println("-------------------------");
        int u, v = obj.length;
        for (int i = 0; i < v; i++) {
            u = obj[i].vertex.length;
            for (int j = 0; j < u; j++) {
                Matrix x = new Matrix();
                x.m[0][0] = obj[i].vertex[j].x;
                x.m[1][0] = obj[i].vertex[j].y;
                x.m[2][0] = obj[i].vertex[j].z;
                x.m[3][0] = 1;
                Matrix res = m.multiply(x);
                obj[i].vertex[j].x = res.m[0][0];
                obj[i].vertex[j].y = res.m[1][0];
                obj[i].vertex[j].z = res.m[2][0];

//                for (int p = 0; p < 4; p++) {
//                    for (int q = 0; q < 4; q++) {
//                        System.out.print(x.m[p][q] + " ");
//                    }
//                    System.out.println();
//
//                }
//                System.out.println("+++++++++++++++++++++++++++++");
//                for (int p = 0; p < 4; p++) {
//                    for (int q = 0; q < 4; q++) {
//                        System.out.print(res.m[p][q] + " ");
//                    }
//                    System.out.println();
//
//                }
//                System.out.println(j + " " + obj[i].vertex[j].toString());
            }
        }
    }

    //wait until next lab for Camera
    //public void draw(Camera c, Graphics g){}
    public String toString() {/* Make it look nice to save your debugging time! */

        return "abc";
    }

}
