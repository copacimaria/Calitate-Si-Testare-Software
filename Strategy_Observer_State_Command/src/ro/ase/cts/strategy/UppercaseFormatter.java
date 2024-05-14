package ro.ase.cts.strategy;

public class UppercaseFormatter implements TextFormatter{

    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
