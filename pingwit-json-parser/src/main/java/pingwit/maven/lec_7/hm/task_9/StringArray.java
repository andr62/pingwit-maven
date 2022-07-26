package pingwit.lec_7.hm.task_9;

import java.util.Locale;

public class StringArray {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds add123add add.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";

        text = text.toLowerCase(Locale.ROOT);
        String array[] = text.split(" ");

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 5) {
                System.out.println(array[i]);
            }
        }
    }
}


