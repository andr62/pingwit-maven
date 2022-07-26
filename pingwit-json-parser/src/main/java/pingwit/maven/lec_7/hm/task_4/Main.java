package pingwit.lec_7.hm.task_4;

public class Main {
    public static void main(String[] args) {
        int sumOfAlert = 0;
        int sumOfAdd = 0;
        int sumOfGood = 0;
        int sumOfPlan = 0;
        String string = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "add \n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        string = string.toLowerCase().replace(".", " ").replace("\n", " ").replace(",", "");
        String[] split = string.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("alert")) {
                sumOfAlert++;
            }
            if (split[i].equals("add")) {
                sumOfAdd++;
            }
            if (split[i].equals("good")) {
                sumOfGood++;
            }
            if (split[i].equals("plan")) {
                sumOfPlan++;
            }
        }
        System.out.println("Слово alert встречается " + sumOfAlert + " раз");
        System.out.println("Слово add встречается " + sumOfAdd + " раз");
        System.out.println("Слово good встречается " + sumOfGood + " раз");
        System.out.println("Слово plan встречается " + sumOfPlan + " раз");
    }
}
