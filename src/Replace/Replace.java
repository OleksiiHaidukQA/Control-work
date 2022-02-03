package Replace;

public class Replace {
    public void replace() {
        String stringWithRandomChars = "Hello control work. Try to replace";

        String finalString = stringWithRandomChars
                .replace("a", "@")
                .replace("o", "0");

        System.out.println(finalString);

    }
}