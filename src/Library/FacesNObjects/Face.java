/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.FacesNObjects;

import java.awt.Color;

/**
 *
 * @author mrh30
 */
public class Face {

    public int[] index;
    public Color color;

    public Face(int[] i, Color c) {
        this.index = i;
        this.color = c;
    }

    public String toString() {/* Make it look nice to save your debugging time! */
        return new String ("Face = ");
    }
}
