public class Main {
    public static void main(String[] args) {

        Scotch scotch = new Scotch("Macallan");
        Irish irish = new Irish("Jamison");
        System.out.println(scotch.name);
        System.out.println(irish.name);

        //Concrete method
        scotch.pour();
        irish.pour();

        //Abstract method
        scotch.withIce();
        irish.withIce();
    }
}