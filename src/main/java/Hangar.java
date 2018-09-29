import java.util.ArrayList;

public class Hangar {

    private ArrayList<Plane> planes;


    public Hangar(){

        this.planes = new ArrayList<>();
    }


    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void addPlane(Plane plane){
        this.planes.add(plane);
    }
}
