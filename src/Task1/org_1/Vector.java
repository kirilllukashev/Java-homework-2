package org_1;

import java.lang.Math;

public class Vector
{
    double x, y, z;
    public Vector(double x_, double y_, double z_) {
        this.x = x_;
        this.y = y_;
        this.z = z_;
    }

    // Длина вектора. Корень из суммы квадратов
    double length(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        double res_x = y * vector.z - z * vector.y;
        double res_y = z * vector.x - x * vector.z;
        double res_z = x * vector.y - y * vector.x;
        return new Vector(res_x, res_y, res_z);
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return scalarProduct(vector) / vector.length() / this.length();
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        double res_x = this.x + vector.x;
        double res_y = this.y + vector.y;
        double res_z = this.z + vector.z;
        return new Vector(res_x, res_y, res_z);
    }

    // Разность двух векторов
    Vector subtract(Vector vector){
        double res_x = this.x - vector.x;
        double res_y = this.y - vector.y;
        double res_z = this.z - vector.z;
        return new Vector(res_x, res_y, res_z);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        final int mod = (int)1e9 + 7;
        long result = 0;
        char[] x = Double.toString(this.x).toCharArray();
        char[] y = Double.toString(this.y).toCharArray();
        char[] z = Double.toString(this.z).toCharArray();
        for (int i = 0; i < x.length; i++) {
            result = (result * prime + (int)(x[i])) % mod;
        }
        for (int i = 0; i < y.length; i++) {
            result = (result * prime + (int)(y[i])) % mod;
        }
        for (int i = 0; i < z.length; i++) {
            result = (result * prime + (int)(z[i])) % mod;
        }
        return (int)result;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Vector other = (Vector) obj;
        if (x != other.x) return false;
        if (y != other.y) return false;
        if (z != other.z) return false;
        return true;
    }
}
