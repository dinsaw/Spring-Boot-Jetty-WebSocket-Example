package com.dineshsawant.websocketdemo.socket;

import com.dineshsawant.websocketdemo.util.DemoBeanUtil;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

/**
 * Created by dnsh on 25/12/17.
 */
@WebSocket
public class RandomNameSocket {
    @OnWebSocketConnect
    public void onConnect(Session session) {
        DemoBeanUtil.getRandomNameService().addSession(session);
    }

    @OnWebSocketClose
    public void onClose(Session session, int _closeCode, String _closeReason) {
        DemoBeanUtil.getRandomNameService().removeSession(session);
    }
}
