Source Code
HelloWorld.java
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class HelloWorld extends com.vaadin.Application {
    public void init() { 
        Window main = new Window("Hello window"); 
        main.addComponent(new Label("Hello World!"));
        setMainWindow(main);
    }
}
