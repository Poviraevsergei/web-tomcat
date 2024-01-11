package listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

//@WebListener
public class ListenerRequestTms implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request listener in!");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request listener out!");
    }
}
