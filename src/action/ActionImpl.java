package action;

public class ActionImpl implements ActionImp {

    @Override
    public void execute(String url) {
        System.out.println("Execute: " + url);
    }
}
