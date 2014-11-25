/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.ParallelProjection;

import Library.PointsNVectors.Point3D;
import Library.PointsNVectors.Vector3D;

public class Camera
{
  public Vector3D getVPN(){/*return a vector that points towards the viewer. Used for face orientation*/}

  protected Point3D cameraTransform(final Point3D p){}

  protected Point3D projectionTransform(final Point3D p){} 

  private final Point3D viewportTransform(final Point3D p){}

  public final Point3D project(final Point3D p){
    Point3D temp=cameraTransform(p);
    temp=projectionTransform(temp);
    return viewportTransform(temp);
  }

  public Camera(double xmin_, double xmax_, double ymin_, double ymax_){}

  public void setViewport(int width, int height){/*calculate ax, bx, ay, by*/}

  public String toString(){/* Make it look nice to save your debugging time! */}

  private double xmin, xmax, ymin, ymax;
  private double fcp, bcp;  //NOT USED: front & back clippling planes
  private double ax, bx, ay, by;
}

