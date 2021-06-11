package creationpatterns;

public class HtmlButton  implements  Button{


    @Override
    public void onClick() {
        System.out.println("Clicked HTML Button");
    }

    @Override
    public void draw() {
        System.out.println("<button>HTML Button</button>");
    }
}
