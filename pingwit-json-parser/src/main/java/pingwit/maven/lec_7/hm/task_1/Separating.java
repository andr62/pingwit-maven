package pingwit.lec_7.hm.task_1;

public class Separating {
    public static void main(String[] args) {
        String text = "engineering";
        String engine = text.substring(0, 6);
        String ring = text.substring(7);

        System.out.println("The starting word to separate: " + text);
        System.out.println("The first word: " + engine);
        System.out.println("The second word: " + ring);

    }
}
