public class Main {
    public static void main(String[] args) {
        Panel cap1 = new Panel("Panel1");
        Panel cap2 = new Panel("Panel2");
        Panel cap3 = new Panel("Panel3");
        Camera p1 = new Camera("Camera 1","people");
        Camera p2 = new Camera("Camera 2","distance");
        Camera p3 = new Camera("Camera 3","sign");
        Camera p4 = new Camera("Camera 4","road");
        Proximity h1 = new Proximity("Proximity1");
        Lidar c1 = new Lidar("Lidar 1");
        Temperature t1 = new Temperature("Temperature 1");
        cap1.add(p1);
        cap1.add(p2);
        cap1.add(p3);
        cap2.add(cap1);
        cap2.add(cap3);
        cap3.add(h1);
        cap2.add(c1);
        cap2.add(p4);
        cap2.add(t1);

        cap2.print();



    }
}