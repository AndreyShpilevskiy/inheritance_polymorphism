public class Horse extends Animal {
    public Horse() {}
    public Horse( String name ) { this.name = name; }

    public String toString() {
        return "*** In Horse: " + this.name;
    }
}