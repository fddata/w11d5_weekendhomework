public enum PlaneType {

    BOEING737(5),
    AIRBUS(4),
    BIPLANE(2);

    //    think of 'final' as constant
    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }


    public int getCapacity() {
        return capacity;
    }
}