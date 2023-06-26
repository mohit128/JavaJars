package com.example.shapes;

public class Circle extends Shape {
    float r;

    public Circle(float r) {
        this.r = r;
    }

    public float area() {
        return (float) (3.14 * (r * r));
    }
}
