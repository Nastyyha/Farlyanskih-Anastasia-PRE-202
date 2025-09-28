package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p0 = new Point(2,4);
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        Line line = new Line(p1, p2);

        System.out.println(line.toString());
        System.out.println(line);
        System.out.println(line.isCollinearLine(p0));

    }
}
