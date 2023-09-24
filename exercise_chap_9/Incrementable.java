import java.util.Random;

public interface Incrementable {
    void increment(); 
    int getValue(); 
}

class SequentialIncrementer implements Incrementable {
    private int value;

    public SequentialIncrementer() {
        this.value = 0; 
    }

    @Override
    public void increment() {
        value++; 
    }

    @Override
    public int getValue() {
        return value;
    }
}

class RandomIncrementer implements Incrementable {
    private int value;
    private Random random;

    public RandomIncrementer() {
        random = new Random();
        value = random.nextInt();
    }

    @Override
    public void increment() {
        value = random.nextInt(); 
    }

    @Override
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        System.out.println("e9q18");
        SequentialIncrementer s1 = new SequentialIncrementer();
        s1.increment();
        s1.increment();
        s1.increment();
        System.out.println(s1.getValue());

        RandomIncrementer r1 = new RandomIncrementer();
        r1.increment();
        r1.increment();
        r1.increment();
        System.out.println(r1.getValue());
    }
}
