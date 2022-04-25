package unit5c3.ques1;

public class Demo {
    public static void main(String[] args) {
// any social media strategy.
        SocialMedia context = new SocialMedia();
// Setting Facebook strategy.
        context.setSocialmediaStrategy(new facebook());
        context.connect("AArti");
// Setting Twitter strategy.
        context.setSocialmediaStrategy(new Twitter());
        context.connect("Aarti");
// Setting GooglePlus strategy.
        context.setSocialmediaStrategy(new Google());
        context.connect("Lokesh");
// Setting Orkut strategy.
        context.setSocialmediaStrategy(new Orkut());
        context.connect("Aarti");
    }

}


