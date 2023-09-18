public class song {
    String name;
    double durata;
    public song(String nume,double durata){
        this.name=name;
        this.durata=durata;
    }
    public song(){

    }
    public String getName(){
        return name;
    }
    public double getDurata(){
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }
    @Override
    public String toString(){
        return "Song{" + "titlu"+ getName()+" "+ getDurata()+'}';
    }
}
