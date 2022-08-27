abstract class Whiskey {
    
    String name;

    public Whiskey(String name){
        this.name=name;
    }

    //Abtract method
    public abstract void withIce();

    //Abstract classes can have concrete methods
    public void pour(){
        System.out.println("I would like some " + name + " in a glass, please.");
    }
}
