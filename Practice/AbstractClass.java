abstract class Shape{
    abstract void draw();
    abstract Shape getShape();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle!");
    }

    Shape getShape() {
        return this;
    }

}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle!");
    }

    Shape getShape() {
        return this;
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape obj = shape.getShape();
        System.out.println(obj);
        Shape obj2 = new Rectangle().getShape();
        System.out.println(obj2);
    }
}
