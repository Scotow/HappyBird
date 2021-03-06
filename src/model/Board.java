package model;

import model.bird.Bird;
import model.obstacle.Obstacle;

import java.util.ArrayList;

/**
 * Created by Benjamin on 09/01/16.
 */
public class Board {

    public static final int X_SIZE = 900;
    public static final int Y_SIZE = 500;
    public static final int BIRDS_AMOUNT = 4;
    public final static int MAP_RATIO = 10;
    public final static int GROUND = 50;
    public final static double GROUND_ELASTICITY = 0.60;
    public final static int MIN_OBSTACLES_AMOUNT = 3;
    public final static int MAX_OBSTACLES_AMOUNT = 7;


    private Bird actualBird;
    private ArrayList<Bird> birds;
    private ArrayList<Obstacle> obstacles;
    private int score = 0;


    /**
     * Créer un plateau vide avec 0 points.
     */

    public Board(){
        birds = new ArrayList<>();
        obstacles = new ArrayList<>();
    }

    public void setActualBird(Bird bird){
        actualBird = bird;
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }

    public Bird getActualBird() {
        return actualBird;
    }

    public ArrayList<Obstacle> getObstacles() {
        return obstacles;
    }

    public int getScore(){
        return score;
    }

    public void addPoints(int adding){
        score += adding;
    }

}
