public class Main {
    public static void main(String[] args) {

        String firstWorld=" Hello World ";

        System.out.println(firstWorld+firstWorld.length());
        System.out.println(firstWorld.toLowerCase());
        System.out.println(firstWorld.toUpperCase());
        System.out.println(firstWorld.replaceFirst("World","CodersBay"));
        System.out.println((firstWorld+"\n").repeat(15));
        System.out.println(firstWorld.stripLeading());
    }
}