public class Camera implements Sensor {
    private String name;
    private SensorStrategy detect;

    public Camera(String name) {
        this.name = name;
    }

    public void print(){

        if(detect==null) {
            System.out.println(this.name);
        }else{
            detect.render(this.name);
        }
    }


    public void setSensorStrategy(SensorStrategy sensor) {
        this.detect = sensor;

    }
}