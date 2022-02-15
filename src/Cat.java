public class Cat {

    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";

    private final String MOUSE_EMOJI = "\uD83D\uDC01";
    private final String CAT_EMOJI = "\uD83D\uDC08";
    private final String CAT_HAPPY_EMOJI = "\uD83D\uDE38";
    private final String YARN_BALL_EMOJI = "\uD83E\uDDF6";

    private String name;

    public Cat(String name)
    {
        this.name = name;
    }

    public void introduce()
    {
        System.out.println(BLUE_BRIGHT + "Meow," + BLACK + " I am a cat" + PURPLE + " and my name is " + name);
    }

    public void animate() throws InterruptedException
    {
        System.out.print(WHITE);
        System.out.println(MOUSE_EMOJI + "            " + YARN_BALL_EMOJI + "       " + BLACK + CAT_EMOJI);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.println(MOUSE_EMOJI + "            " + YARN_BALL_EMOJI + "    " + BLACK + CAT_EMOJI);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.println(MOUSE_EMOJI + "            " + YARN_BALL_EMOJI + " " + BLACK + CAT_EMOJI);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.println(MOUSE_EMOJI + "            " + YARN_BALL_EMOJI + BLACK + CAT_EMOJI);
        Thread.sleep(500);

        System.out.println(PURPLE + name + ": a yarn ball!");
        Thread.sleep(1000);

        System.out.print(WHITE);
        System.out.println(MOUSE_EMOJI + "           " + BLACK + CAT_EMOJI);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.println(MOUSE_EMOJI + "         " + BLACK + CAT_EMOJI);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.println(MOUSE_EMOJI + "      " + BLACK + CAT_EMOJI);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.println(MOUSE_EMOJI + "   " + BLACK + CAT_EMOJI);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.println(MOUSE_EMOJI + BLACK + CAT_EMOJI);
        Thread.sleep(500);

        System.out.print(WHITE);
        System.out.println(MOUSE_EMOJI + "" + BLACK + CAT_EMOJI);
        System.out.println(PURPLE + CAT_HAPPY_EMOJI + ": Haha I gotchu!" + WHITE);
    }
}

