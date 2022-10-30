package org_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Vector vector_1 = new Vector(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
        Vector vector_2 = new Vector(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
        System.out.println("Длина первого вектора: " + vector_1.length());
        System.out.println("Длина второго вектора: " + vector_2.length());
        System.out.println("Скалярное произведение: " + vector_1.scalarProduct(vector_2));
        Vector vector_cross = vector_1.crossProduct(vector_2);
        System.out.println("Векторное произведение: " + vector_cross.x + " " + vector_cross.y + " " + vector_cross.z);
        System.out.println("Косинус угла между векторами: " + vector_1.cos(vector_2));
        Vector sum = vector_1.add(vector_2);
        Vector delta = vector_1.subtract(vector_2);
        System.out.println("Вектор суммы: (" + sum.x + ", " + sum.y + ", " + sum.z + ")");
        System.out.println("Вектор разности: (" + delta.x + ", " + delta.y + ", " + delta.z + ")");
        System.out.println("Hashcode первого вектора: " + vector_1.hashCode());
        System.out.println("Hashcode второго вектора: " + vector_2.hashCode());
        System.out.println("Равен ли первый вектор второму: " + vector_1.equals(vector_2));
        System.out.println("Равен ли второй вектор первому: " + vector_2.equals(vector_1));
    }
}