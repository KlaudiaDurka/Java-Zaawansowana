package action;

public class LambdaExpressionExample {

    public static void main(String[] args) {
        //implementacja klasowa
        ActionImp action = new ActionImp() {
            @Override
            public void execute(String url) {

            }
        };
        //action.execute("www.onet.pl");
        executeAction(action);

        //implementacja anonimowa
        //obiekt żyje w ramach metody main
        ActionImp action1 = new ActionImp() {
            @Override
            public void execute(String url) {
                System.out.println("Execute in anonymous way: " + url);
            }
        };
        //action1.execute("www.onet.pl");
        //action1.execute("www.wp.pl");
        executeAction(action1);

        //obiekt żyje w ramach metody executeAction
        executeAction(new ActionImp() {
            @Override
            public void execute(String url) {
                System.out.println("Execute in anonymous way v3: " + url);
            }
        });
    }

    public static void executeAction(ActionImp action) {
        action.execute("www.onet.pl");
    }
}
