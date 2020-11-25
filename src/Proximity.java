public class Proximity implements Sensor{

    private String name;

    public Proximity(String name) {
        this.name = name;
    }

    public void print(){

        System.out.println("Proximity sensor named: " + this.name);
    }
}