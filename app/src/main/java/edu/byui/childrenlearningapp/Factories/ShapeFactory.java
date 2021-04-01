package edu.byui.childrenlearningapp.Factories;

import android.content.Context;

import java.util.ArrayList;

import edu.byui.childrenlearningapp.Models.A_Shape;
import edu.byui.childrenlearningapp.Models.Shape;
import edu.byui.childrenlearningapp.R;

public class ShapeFactory {
    public static A_Shape getShape(String shapeName, Context context, boolean iscorrect){
        String shapeNameLower = shapeName.toLowerCase();
        switch (shapeNameLower){
            case "circle":
                return new Shape(shapeName,context, R.raw.shapes_circle,iscorrect,R.drawable.shapes_circle);
            case "diamond":
                return new Shape(shapeName,context, R.raw.shapes_diamond,iscorrect,R.drawable.shapes_diamond);
            case "heart":
                return new Shape(shapeName,context, R.raw.shapes_heart,iscorrect,R.drawable.shapes_heart);
            case "hexagon":
                return new Shape(shapeName,context, R.raw.shapes_hexagon,iscorrect,R.drawable.shapes_hexagon);
            case "oval":
                return new Shape(shapeName,context, R.raw.shapes_oval,iscorrect,R.drawable.shapes_oval);
            case "pentagon":
                return new Shape(shapeName,context, R.raw.shapes_pentagon,iscorrect,R.drawable.shapes_pentagon);
            case "rectangle":
                return new Shape(shapeName,context, R.raw.shapes_rectangle,iscorrect,R.drawable.shapes_rectangle);
            case "square":
                return new Shape(shapeName,context, R.raw.shapes_square,iscorrect,R.drawable.shapes_square);
            case "star":
                return new Shape(shapeName,context, R.raw.shapes_star,iscorrect,R.drawable.shapes_star);
            case "triangle":
                return new Shape(shapeName,context, R.raw.shapes_triangle,iscorrect,R.drawable.shapes_triangle);
            default:
                return null;
        }
    }

    public static ArrayList<String> getAllPossibleShapes(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Circle");
        list.add("Diamond");
        list.add("Heart");
        list.add("Hexagon");
        list.add("Oval");
        list.add("Pentagon");
        list.add("Rectangle");
        list.add("Square");
        list.add("Star");
        list.add("Triangle");
        return list;

    }
}
