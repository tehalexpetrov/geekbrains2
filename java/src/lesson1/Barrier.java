package lesson1;

public abstract class Barrier {

    private String name;

    public Barrier(String name){
        this.name = name;
    }

    protected abstract boolean isAction(Limitations limitations);

    public String getName(){
            return name;
    }
}
