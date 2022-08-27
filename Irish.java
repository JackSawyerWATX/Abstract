public class Irish extends Whiskey{

    Irish(String name) {
        super(name);
    }

    @Override
    public void withIce() {
        System.out.println("In a shot glass with a pint of Guinness.");
        System.out.println("In a tumbler mixed with soda water.");
    }
}
