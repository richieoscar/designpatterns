package creationpatterns;

public class HtmlDialog extends Dialog {
    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
