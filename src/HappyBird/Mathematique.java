package HappyBird;

import java.math.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author debaerdm
 */
public class Mathematique {
    
    private Coordonnee pb1;
    private Coordonnee pb2;
    private Coordonnee pb3;
    //(1-t)*xa + txa;
    
    // AB = (1-t)xa + txb;
    //    = (1-t)xa + tyb;
    public Mathematique(Coordonnee pb1, Coordonnee pb2, Coordonnee pb3) {
        this.pb1 = pb1;
        this.pb2 = pb2;
        this.pb3 = pb3;
    }
    
    
    public Coordonnee calculerPoint(double t){
        double coordX = formulBezier(formulBezier(pb1.getX(), pb2.getX(), t), formulBezier(pb2.getX(), pb3.getX(), t), t);
        double coordY = formulBezier(formulBezier(pb1.getY(), pb2.getY(), t), formulBezier(pb2.getY(), pb3.getY(), t), t);
        return new Coordonnee(coordX, coordY);
    }
    
    public double formulBezier(double point1, double point2, double t){
        return (1-t)*point1 + t*point2;
    }
}
