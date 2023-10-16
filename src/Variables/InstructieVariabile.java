package Variables.src;

public class InstructieVariabile {
    public static long CurrentWorldPopulation;
    public static int CarsProducedThisYear;
    public static char FirstLetterInAlphabet;
    public static boolean JavaIsAmazing;
    public static float Pi;
    public long getCWP(){return CurrentWorldPopulation;}
    public int getCPTY(){return CarsProducedThisYear;}
    public char getFLIA(){return FirstLetterInAlphabet;}
    public boolean getJIA(){return JavaIsAmazing;}
    public float getP(){return Pi;}
    public static void CheamaMetoda() {
        System.out.println("CurrentWorldPopulation - " + CurrentWorldPopulation);
        System.out.println("CarsProducedThisYear - " + CarsProducedThisYear);
        System.out.println("FirstLetterInAlphabet - " + FirstLetterInAlphabet);
        System.out.println("JavaIsAmazing - " + JavaIsAmazing);
        System.out.println("Pi - " + Pi);
    }



}