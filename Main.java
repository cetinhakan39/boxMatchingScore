public class Main {

    public static void main(String[] args) {
	Fighter F1=new Fighter("Hazbullah",10,85,90,0);
    Fighter F2=new Fighter("Ciso",10,85,85,100);

    Match match=new Match(F1,F2,80,100);
    match.start();

    }
}
