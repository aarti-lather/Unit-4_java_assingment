package unit5c3.ques1;

public class SocialMedia {
    Strategy s;
    public void setSocialmediaStrategy(Strategy s){
        this.s=s;

    }
    public void connect(String name){
        s.print(name);


    }


}
