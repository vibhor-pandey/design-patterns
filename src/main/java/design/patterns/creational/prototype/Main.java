package design.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SpaceCraft apollo11 = new NasaApollo("Apollo-11", 24500, 200);
        SpaceCraft chandrayaan1 = new Chandrayaan("Chandrayaan-1", 25500, 160);

        //Prototyping
        SpaceCraft chandrayaan2 = chandrayaan1.clone();
        SpaceCraft apollo12 = apollo11.clone();
        chandrayaan2.setName("Chandrayaan-2");
        apollo12.setName("Apollo-12");

        System.out.println(apollo11.boost());
        System.out.println("------------");
        System.out.println(chandrayaan1.boost());
        System.out.println("------------");
        System.out.println(apollo12.boost());
        System.out.println("------------");
        System.out.println(chandrayaan2.boost());
    }
}
