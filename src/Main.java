public class Main
{
    public static void main(String[] args)
    {

        Cat bob = new Cat("Bob");

      /* A. uncomment code below first
            then study my code and see how colors work! */

        bob.introduce();

        try {
          bob.animate();
        } catch (Exception e) { }
    }
}