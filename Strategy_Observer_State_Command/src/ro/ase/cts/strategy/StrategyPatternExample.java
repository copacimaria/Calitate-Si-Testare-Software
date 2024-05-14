package ro.ase.cts.strategy;

public class StrategyPatternExample {
    public static void main(String[] args){
        TextEditor editor=new TextEditor(new UppercaseFormatter());

        String text= "Hello World";
        System.out.println("Original Text: "+text);
        System.out.println("Uppercase: "+editor.formatText(text));

        editor.setFormatter(new LowercaseFormatter());
        System.out.println("Lowercase: "+editor.formatText(text));

        editor.setFormatter(new CamelCaseFormatter());
        System.out.println("Camel case: "+editor.formatText(text));

    }
}
