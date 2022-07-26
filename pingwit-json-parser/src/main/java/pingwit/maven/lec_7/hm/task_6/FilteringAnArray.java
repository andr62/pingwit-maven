package pingwit.lec_7.hm.task_6;


import java.util.Locale;

public class FilteringAnArray {
    public static void main(String[] args) {
        String text = """
                While major gameplay components are already in place and functioning,
                players help is needed to add some of the smaller features and content.
                Of course polishing the overall experience is important at the same time.
                Game has been extensively tested in closed group, but it is always important to hear fresh suggestions
                from larger crowd that come from various gaming backgrounds.
                Plan is to make the game as good as possible but without compromising the core idea.""";

        text = text.toLowerCase(Locale.ROOT);

        String anArrayFromAText[] = text.split(" ");

        for (int i = 0; i < anArrayFromAText.length; i++) {
            if (anArrayFromAText[i].startsWith("w")) {
                System.out.println(anArrayFromAText[i]);
            }
        }
    }
}