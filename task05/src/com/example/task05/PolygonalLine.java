package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] point;
    private int countPoint;
    public PolygonalLine(){
        this.point = new Point[0];
        this.countPoint =0;
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        if (points == null) {
            this.point = new Point[0];
            this.countPoint = 0;
            return;
        }
        this.point = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            if (points[i] != null) {
            this.point[i] = new Point(points[i].getX(), points[i].getY());
            } else {
                this.point[i] = null;
            }


        }
        countPoint = points.length;
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        if (point == null) return;


        Point[] newPoints = new Point[countPoint + 1];
        for (int i = 0; i < countPoint; i++) {
            newPoints[i] = point[i];
        }
        newPoints[countPoint] = new Point(x,y);


        point = newPoints;
        countPoint++;
    }
    public void addPoint(Point point) {
        if (point == null) return;
        addPoint(point.getX(), point.getY());
    }
    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        if (countPoint < 2) return 0.0;

        double length = 0.0;
        for (int i = 0; i < countPoint - 1; i++) {
            length += point[i].getLength(point[i + 1]);
        }
        return length;

    }

}
