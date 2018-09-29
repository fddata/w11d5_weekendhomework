import java.util.ArrayList;

public class Hangar {

    private ArrayList<Plane> planes;
    private String name


    public Hangar(String name){

        this.planes = new ArrayList<>();
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void addPlaneToHangar(Plane plane){
        this.planes.add(plane);
    }
}
