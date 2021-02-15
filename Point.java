package Wuzi;

import java.awt.*;
import java.io.Serializable;

/**
 * This class represents the points
 * Author:Group 5
 * CS 151 Final Project
 */
public class Point implements Serializable {

    /**
     *
     */
    private int x;//the x coordinate 
    private int y;//the y coordinate
    private Color color;//the color of chess white or black
    public static int DIAMETER = 30;//the diameter

    /**
     * construct the point 
     * @param x the value of x coordinate
     * @param y the value of y coordinate
     * @param color the color of chess
     */
    public Point(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     * Get the x coordinate
     *
     * @return x the value of x coordinate
     */
    public int getX() {
        return x;
    }


    /**
     * Get the y coordinate
     *
     * @return y the value of the vertical coordinate of chess
     */
    public int getY() {
        return y;
    }

    /**
     * get the color of chess
     * @return the color of chess
     */
    public Color getColor() {
        return color;
    }
}
