package unit5c3.ques1;

public class facebook implements Strategy {
    @Override
    public void print(String name) {
        System.out.println(name+" "+"Connected via Facebook");

    }
}