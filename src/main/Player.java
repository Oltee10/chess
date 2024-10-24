package src.main;

public abstract class Player {

    protected boolean color;

    public Player(boolean color){
        this.color = color;
    }

    public String getColor(){
        if (color) {
            return "Blanco";
        } else {
            return "Negro\n";
        }
    }

}