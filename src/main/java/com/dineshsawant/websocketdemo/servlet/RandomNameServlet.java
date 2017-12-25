package com.dineshsawant.websocketdemo.servlet;

import com.dineshsawant.websocketdemo.socket.RandomNameSocket;
import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

/**
 * Created by dnsh on 25/12/17.
 */
public class RandomNameServlet extends WebSocketServlet {
    @Override
    public void configure(WebSocketServletFactory webSocketServletFactory) {
        webSocketServletFactory.register(RandomNameSocket.class);
    }
}
