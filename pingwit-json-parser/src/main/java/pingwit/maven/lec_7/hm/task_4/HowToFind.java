package pingwit.lec_7.hm.task_4;

public class HowToFind {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds add123add add.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        text = text.toLowerCase();
        String[] searchWorlds = {"alert", "add", "good", "plan"};
        // через split неплохой варинт, но используя indexOf() не нужно создавать массив
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for (String searchWorld : searchWorlds) {
            int count = 0;
            for (String word : words) {
                if (searchWorld.equals(word)) {
                    count++;
                }
            }
            System.out.println("Word " + searchWorld + " found " + count + " time(s)");
        }
    }
}
/* for (String searchWorld : searchWorlds) {
    int index =0;
        do text.indexOf(searchWorld, index);
        while
    }
    System.out.println("Word " + searchWorld + " found " + count + " time(s)");
} */

