package zadania.klasyAnonimowe;

public class AnonimoweMain {

    public static void main(String[] args) {
        ClickListener clickListener = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Kliknięto przycisk");
            }
        };

        clickListener.onClick();
    }


}
