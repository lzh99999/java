public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a").append(true);
        System.out.println(stringBuilder);

        String string = "a";
        System.out.println(string.charAt(0));
        System.out.println(string.replace("a","ccc"));
        System.out.println( string.length());
        System.out.println(string.compareToIgnoreCase("A"));
    }
}
