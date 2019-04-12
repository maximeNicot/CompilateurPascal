public class Donnee {


    public int adresse;



    public Type type;

    public Donnee(int adresse, Type type){
        this.adresse= adresse;
        this.type=type;
    }
    public Type getType() {
        return type;
    }
    public int getAdresse() {
        return adresse;
    }
}
