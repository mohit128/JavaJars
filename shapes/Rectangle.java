package com.example.shapes;

public class Rectangle extends Shape {
    float l, b;

    public Rectangle(float l, float b) {
        this.l = l;
        this.b = b;
    }

   public float area() {
        return l * b;
    }
}

