import com.jesus.model.ButtonAction;

public class Main {
    public static void main(String[] args) {
        ButtonAction buttonAction = (oneListenerClick, msg) -> {
            oneListenerClick.setClick(msg + " Did it!");
        };

        buttonAction.onClick(actionMsg -> {
            System.out.println("Available Button!... " + actionMsg);}, "Clicking! Clicking! ....");
    }
}
