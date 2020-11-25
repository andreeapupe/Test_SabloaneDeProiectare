import java.util.ArrayList;

public class Panel implements  Sensor{
    protected String sectionTitle;
    protected ArrayList<Sensor> content = new ArrayList<>();

    public Panel(String sectionTitle){
        this.sectionTitle=sectionTitle;
    }

    public int add(Sensor elm){
        content.add(elm);
        return content.indexOf(elm);
    }

    public Sensor getSensor(int index){
        return content.get(index);
    }

    public void print(){
        System.out.println("Panel: "+this.sectionTitle);
        for(Sensor i : content){
            i.print();
        }
        System.out.println("-------------End of "+sectionTitle);
    }
}