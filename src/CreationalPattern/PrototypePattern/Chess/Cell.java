package CreationalPattern.PrototypePattern.Chess;

import java.util.concurrent.TimeUnit;

public class Cell implements Cloneable{
    private String color;
    private String coordinate;

    public Cell(String color){
        this.color = color;
        try{
            //more time to create an cell
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    @Override
//    public String toString() {
//        return "Cell{" +
//                "color='" + color + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Cell{" +
                "color='" + color + '\'' +
                ", coordinate='" + coordinate + '\'' +
                '}';
    }

    @Override
    protected Cell clone(){
        try{
            return (Cell) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }
}
