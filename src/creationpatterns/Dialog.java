package creationpatterns;

public abstract  class Dialog {
    /*
    This uses the Factory method creation design pattern
    Delegate the creation of buttons to the subclasses
    This enables code flexibility and scalability

    This is the base class from which subclasses will extend to create their own objects
     */

    abstract Button createButton();

    public void renderWindow(){
        Button button = createButton();
        button.draw();
    }
}
