class Scotch extends Whiskey {

    public Scotch(String name) {
        super(name);
    }
        
        @Override
        public void withIce(){
            System.out.println("Pours " + name + " into a glass with one cube of ice.");
        }
    
    
}
