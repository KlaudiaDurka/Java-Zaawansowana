package udemy.wyjatki;

public class DzieleniePrzezZero {

    /*
    try{
        INSTRUKCJE KTORE POTENCJALNIE MOGA SPOWODOWAC BLAD
        }
    catch(nazwaZwroconegoWyjatku nazwaZmiennej){
        INSTRYKCJE OBSLUGUJACE ZLAPANY WYJATEK
        }
     */

    public static void main(String[] args) {

        int a = 10;
        try{
            if (a == 10){
                throw new NaszWyjatek("a jest równe 10, grzeszysz");
            }

            System.out.println(5/0);
        } catch (Exception ex){

            System.out.println(ex.getMessage());
        }


        try{

            System.out.println(5/0);
        } catch (ArithmeticException ex){

            System.out.println("Powstał wyjątek: " + ex.getMessage());
        }

        finally {
            System.out.println("COS CO ZAWSZE ZOSTANIE WYKONANE");
        }
    }

    static class NaszWyjatek extends Exception{

        public NaszWyjatek(String string){
            super(string);
        }
    }
}
