package extends1.ex;

public class Movie extends Item{
    private String director; // 감독
    private String actor; //배우

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("-감독:" + director + ", 배우:" + actor);
    }
}
