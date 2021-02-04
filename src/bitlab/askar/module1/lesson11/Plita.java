package bitlab.askar.module1.lesson11;

public class Plita implements CanCook, Comparable{

    int weight;
    int  volume;

    public void cook(){
    }

    @Override
    public int compareTo(Object o) {
        Plita plita  = (Plita)o;

        if (this.weight > plita.weight) return 1;
        if (this.weight == plita.weight) return 0;
        return -1;

    }

    @Override
    public boolean equals(Object obj) {
        Plita plita = (Plita)obj;

        if (this.weight == plita.weight && this.volume == plita.volume){
            return  true;
        }
        return false;
    }
}
