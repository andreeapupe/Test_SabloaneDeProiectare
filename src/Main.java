public class Main {
    public static void main(String[] args) {
        Panel cap1 = new Panel("Panel 1");
        Panel cap2 = new Panel("Panel 2");
        Panel cap3 = new Panel("Panel 3");
        Camera p1 = new Camera("Camera 1");
        Camera p2 = new Camera("Camera 2");
        Camera p3 = new Camera("Camera 3");
        Camera p4 = new Camera("Camera 4");
        Proximity h1 = new Proximity("Proximity 1");
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
        p1.setSensorStrategy(new PeopleDetection());
        p2.setSensorStrategy(new SignDetection());
        p3.setSensorStrategy(new RoadDetection());
        cap2.print();



    }
}