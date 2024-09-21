package org.example.shapes;

public abstract class Shape {
    public String name;
    public final void setColor (String color){
        System.out.println("Setting colors: " +color);
    }

    public abstract void play();

    @Override
    public String toString() {
        return "This object name "+name ;
    }
}
