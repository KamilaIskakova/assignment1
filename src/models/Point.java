package models;

public class Point {
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setPointX(double x){
        this.x = x;
    }
    public void setPointY(double y){
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    @Override public String toString(){
        return x + " | " + y;
    }
    public double getDistance(Point second){
        return Math.sqrt(Math.pow((this.x - second.getX()), 2) + Math.pow((this.y - second.getY()), 2));
    }
}
