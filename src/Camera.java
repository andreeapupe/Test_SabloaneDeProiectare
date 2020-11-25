public class Camera implements Sensor {
    private String name;
    private String detect;

    public Camera(String name,String detect) {
        this.name = name;
        this.detect = detect;
    }

    public void print(){

        System.out.println("Proximity sensor with name: " + this.name+" can detect: "+this.detect);
    }
}