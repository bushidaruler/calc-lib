package pl.gov.coi.example.calc;
//some info here
//some more info

/**
 * @author <a href="mailto:krzysztof.suszynski@coi.gov.pl">Krzysztof Suszynski</a>
 * @since 17.11.16
 */
public class Calc {
    private final Addrer addrer;

    public Calc() {
        this(new Addrer42());
    }

    public Calc(Addrer addrer) {
        this.addrer = addrer;
    }

    public int add(int a, int b) {
        return addrer.add(a, b);
    }
    public int substract(int a, int b) {
        return a - b;
    }
}
