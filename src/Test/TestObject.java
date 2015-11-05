/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Test;

import javax.swing.Timer;

import HappyBird.Controller.CollisionControler;
import HappyBird.Controller.PositionControler;
import HappyBird.Object.Coordonnee;
import HappyBird.Object.Obstacle;
import HappyBird.Object.Oiseau;
import HappyBird.model.Courbe;
import HappyBird.model.PlateauModel;
import HappyBird.view.ElementView;
import HappyBird.view.HappyView;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author debaerdm
 */
public class TestObject {
    
  public PlateauModel plateauModel;
  public PositionControler position;
  public CollisionControler collision;
  public HappyView happyView;
 
  @Before
  public void test() {
    plateauModel = new PlateauModel();
    position = new PositionControler(plateauModel);
    collision = new CollisionControler(plateauModel);
    happyView = new HappyView("Test", plateauModel, collision, position);
    collision.addView(happyView);
  }
  
  @Test
  public void timerStop(){
    plateauModel.setOiseauPosition(761.00,200.00);
    plateauModel.addObstacles(new Obstacle(780.00, 200.00));
    plateauModel.addObstacles(new Obstacle(740.00, 200.00));
    plateauModel.setFlyTimer(new Timer(5000, null));
    plateauModel.startFly();
    if(collision.collision()) plateauModel.stopFly();
    assertFalse(plateauModel.getFlyTimer().isRunning());
  }
  
  
    /*@Test
    public void testBezierTroisParametre() throws PointCourbeException{
      Courbe bezierTroisParametre = new Courbe();
      for (double i = 0.0; i < 3.0; i++) {
        bezierTroisParametre.setListPoint(new Coordonnee(i+1.0, i+2.0)); //(1;2)(2;3)(3;4)
       }
      Assert.assertEquals(bezierTroisParametre.calculerPoint(1).getX(), 3.0, 1);
      Assert.assertEquals(bezierTroisParametre.calculerPoint(1).getY(), 4.0, 1);
      Assert.assertEquals(bezierTroisParametre.calculerPoint(0.4).getX(), 1.8, 1);
      Assert.assertEquals(bezierTroisParametre.calculerPoint(0.4).getY(), 2.8, 1); // Calcul fait a la main.
    }
    
    @Test
    public void testBezierDeuxParametre() throws PointCourbeException{
      Courbe bezierDeuxParametre = new Courbe();
      for (double i = 0.0; i < 2.0; i++) {
        bezierDeuxParametre.setListPoint(new Coordonnee(i+1.0, i+2.0)); //(1;2)(2;3)
       }
      Assert.assertEquals(bezierDeuxParametre.calculerPoint(1).getX(), 2.0, 1);
      Assert.assertEquals(bezierDeuxParametre.calculerPoint(1).getY(), 3.0, 1);
      Assert.assertEquals(bezierDeuxParametre.calculerPoint(0.2).getX(), 1.2, 1);
      Assert.assertEquals(bezierDeuxParametre.calculerPoint(0.2).getY(), 2.2, 1);
    }
    
    @Test
    public void testBezierUnParametre() throws PointCourbeException{
      Courbe bezierUnParametre = new Courbe();
      bezierUnParametre.setListPoint(new Coordonnee(1.0, 2.0));;
      Assert.assertEquals(bezierUnParametre.calculerPoint(0).getX(), 1.0, 1);
      Assert.assertEquals(bezierUnParametre.calculerPoint(0).getY(), 2.0, 1);
    }
    
    @Test
    public void testBezierVoid() throws PointCourbeException{
      Courbe bezierVoid = new Courbe();
      Assert.assertEquals(bezierVoid.calculerPoint(0).getX(), 0.0, 1);
      Assert.assertEquals(bezierVoid.calculerPoint(0).getY(), 0.0, 1);
    }
    
    @Test
    public void testBezierError() throws PointCourbeException{
      Courbe bezierError = new Courbe();
      for (double i = 0.0; i < 4.0; i++) {
        bezierError.setListPoint(new Coordonnee(i+1.0, i+2.0)); //(1;2)(2;3)(3;4)(4;5)
       }
      try {
        System.err.println("Trop de point !!");
      }catch(IllegalArgumentException aExp){
        assert(aExp.getMessage().contains("Trop de points !"));
      }
    }*/
}