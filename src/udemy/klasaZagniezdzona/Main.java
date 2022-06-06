package udemy.klasaZagniezdzona;

public class Main {

    public static void main(String[] args) {

        A zewnetrzna = new A();

        A.B tmp = zewnetrzna.new B();

    }

    static class A{

        A(){

            System.out.println("Jestem z klasy zewnętrznej");
        }

        class B{

            B(){

                System.out.println("Jestem z klasy zagniezdzonej");
            }

            void cos(){

                test = 5;
            }

            private int tmp;
        }

        private int test;
    }
}
