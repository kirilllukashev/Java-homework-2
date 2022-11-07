package org_2;

public class Main {
    public static void main(String[] args){
        ComputerImpl desktop = new Desktop("intel i5", "8gb", "ssd 250gb", "GeForce GTX 1060");
        ComputerImpl laptop = new Laptop("intel i5", "8gb",  "ssd 250gb", "BENQ", "Defender Spark");
        ComputerImpl netbook = new Netbook("intel i5", "8gb", "ssd 250gb", "BENQ", "Defender Spark");
        ComputerImpl nettop = new Nettop("intel i5", "8gb", "ssd 250gb");
        ComputerImpl monoblock = new Monoblock("intel i5", "8gb", "ssd 250gb", "BENQ");
        ComputerImpl server = new ServerComputer("intel i5", "8gb", "ssd 250gb");
        ComputerImpl[] computer = new ComputerImpl[]{desktop, laptop, netbook, monoblock, nettop, server};
        for (ComputerImpl x : computer) {
            System.out.println(x.turnOn());
            System.out.println(x.turnOff());
            System.out.println(x.connect());
        }
    }
}
