class Elephant {};
class Monkey {};
class Wolf {};

public class Crate<T> {
    private T contents;
    public Crate(T contents) {
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public static void main(String[] args) {

        Elephant elephant = new Elephant();
        Monkey monkey = new Monkey();
        Wolf wolf = new Wolf();

        Crate<Elephant> crateForElephant = new Crate<>(elephant);
        Crate<Monkey> crateForMonkey = new Crate<>(monkey);
        Crate<Wolf> crateForWolf = new Crate<>(wolf);

        Elephant e = crateForElephant.getContents();
        Monkey m = crateForMonkey.getContents();
        Wolf w = crateForWolf.getContents();
    }
}