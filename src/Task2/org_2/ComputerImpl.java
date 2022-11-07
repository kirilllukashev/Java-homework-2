package org_2;

public abstract class ComputerImpl
{
    String processor, RAM, hard;

    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+toString();
    }

    public String turnOff() {
        return "Turn on "+getClass().getSimpleName()+" "+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+toString();
    }

    public String toString() {
        return "Процессор: " + processor + "\n" +
                "Оперативная память: " + RAM + "\n" +
                "Жесткий диск: " + hard + "\n";
    }
}
