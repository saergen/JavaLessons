package lesson1;

public class Town {

    private static final String CONSTANCE = "Capital";
    private String name;
    private int foundation;
    private double population;

    public Town(String name, int foundation,double population){
        this.name = name;
        this.foundation = foundation;
        this.population=population;
    }
    public Town(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFoundation(int foundation) {
        this.foundation = foundation;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getFoundation() {
        return foundation;
    }

    public double getPopulation() {
        return population;
    }

    public static String getCONSTANCE() {
        return CONSTANCE;
    }
}
