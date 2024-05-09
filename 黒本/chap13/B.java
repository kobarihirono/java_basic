package 黒本.chap13;

public class B extends A{
    public void setValue(String value) {
        super.setValue("[" + value + "]");
    }

    public void setValue(String... values) {
        setValue(test(values));
    }

    private String test(String... values) {
        StringBuilder sb = new StringBuilder();
        for (String value : values) {
            sb.append(value + " ");
        }

        return sb.toString();
    }
}
