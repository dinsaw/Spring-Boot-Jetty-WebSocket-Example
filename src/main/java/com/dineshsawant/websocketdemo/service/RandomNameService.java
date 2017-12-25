package com.dineshsawant.websocketdemo.service;

import com.github.javafaker.Faker;
import org.eclipse.jetty.websocket.api.Session;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by dnsh on 25/12/17.
 */
@Service("randomNameSvc")
public class RandomNameService {
    private Set<Session> listenerSessions = new CopyOnWriteArraySet<>();

    public void removeSession(Session session){
        listenerSessions.remove(session);
    }

    public void addSession(Session session){
        listenerSessions.add(session);
    }

    @PostConstruct
    private void init(){
        Runnable runnable = () -> {
            while (true){
                try {
                    Thread.sleep(2000);
                    String message = new Faker().name().fullName();
                    listenerSessions.stream()
                            .filter(s-> s.isOpen())
                            .forEach(s -> sendRandomName(s,message));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    private void sendRandomName(Session s, String message) {
        try {
            s.getRemote().sendString(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
