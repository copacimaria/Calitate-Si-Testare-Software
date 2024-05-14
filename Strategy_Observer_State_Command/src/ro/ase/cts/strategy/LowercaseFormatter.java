package ro.ase.cts.strategy;

public class LowercaseFormatter implements TextFormatter{
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
