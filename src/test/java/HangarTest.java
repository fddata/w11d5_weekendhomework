import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HangarTest {

    Hangar hangar;
    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void before(){
        hangar = new Hangar("Hangar1");
        plane1 = new Plane(PlaneType.AIRBUS, "Airline1");
        plane2 = new Plane(PlaneType.BOEING737, "Airline2");
        plane3 = new Plane(PlaneType.BIPLANE, "Airline3");
    }



    @Test
    public void canAddPlaneToHangar(){
        hangar.addPlaneToHangar(plane1);
        assertEquals(1, hangar.getPlanes().size());
    }

    @Test
    public void canGetPlaneFromHangar(){
        hangar.addPlaneToHangar(plane1);
        assertNotNull(hangar.getPlane(plane1));

    }
}