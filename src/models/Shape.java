package models;

import java.util.ArrayList;
import java.util.Arrays;
public class Shape {
    private ArrayList<Point> points = new ArrayList<>();

    public ArrayList<Point> getPoints(){
        return points;
    }

    public void addPoint(Point point){
        points.add(point);
    }

    private double[] getSides(){
        double[] sides = new double[points.size()];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = points.get(i).getDistance(points.get((i + 1) % sides.length));
        }
        return sides;
    }

    public double calculatePerimeter(){
        double perim = 0;
        for (int i = 0; i < points.size(); i++) {
            perim += points.get(i).getDistance(points.get((i + 1) % points.size()));
        }
        return perim;
    }
    public double getLongestSide(){
        double max = 0;
        for (int i = 0; i < points.size(); i++) {
            double side = points.get(i).getDistance(points.get((i + 1) % points.size()));
            if(side > max){
                max = side;
            }
        }
        return max;
    }

    public double getAverageSide(){
        return calculatePerimeter() / points.size();
    }

}
