public class Dog extends Animal {
    public Dog() {}
    public Dog( String name ) { this.name = name; }

    public String toString(){
        return "*** In Dog: " + this.name;
    }
}