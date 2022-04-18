//Q2. Explain the Liscov’s Substitution principle with an example. Show how the code will look
//        like before and after applying this principle. Write error free Java programs with correct
//        syntax, don’t write pseudo code.



//answer:- its applies to inheritance in such a way that drived classes must be completely susstitutable for thier bse class.
//        in other words, if class A is a substitute of class B, then we should be able to replace B with A without interrupting
//        the behaviour of the program .

        package evaluation2.lsp;

    public abstract class Lsp1_SocialMedia {

        public abstract  void ChatWithFriend();

        public abstract  void sendphoto();

        public abstract  void gruupvideoCall();

        public abstract  void PublishPost();

}
