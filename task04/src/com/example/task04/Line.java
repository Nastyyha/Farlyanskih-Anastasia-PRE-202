package com.example.task04;

import com.example.task04.Point;

public class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        if (p1 == null || p2 == null) {
            throw new IllegalArgumentException("Точки не могут быть null");
        }
        this.p1 = p1;
        this.p2 = p2;

    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public boolean isCollinearLine(Point p) {
        double s1 = p1.distance(p);
        double s2 = p2.distance(p);
        double totalDistance = p1.distance(p2);
        double epsilon = 1e-10;

        return Math.abs((s1 + s2) - totalDistance) < epsilon;
    }

    public String toString() {
        return p1 + " - " + p2;
    }

}

