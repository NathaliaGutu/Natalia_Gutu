public class Box3Metode {
    String name;
    String colour;
    int weight;

    public int getWeightInt (int weight){
        return weight;
    }

    public void feed (String name, String colour){
        System.out.println(name+colour);
    }

    public String getName() {
        return name;
    }

    public int charInt (char c){
        return c;
    }
}
