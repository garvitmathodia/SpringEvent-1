package com.spring.event.listner;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.event.TheBigBangTheoryEvent;
import com.spring.event.TheComedyCircusEvent;

@Component
public class GarvitListner  {

    public void watchBigBang(String epNo) {
        System.out.println("Garvit: playing BBT: " + epNo);
    }
    public void watchComdeyCircus(String epNo) {
    	System.out.println("Garvit: playing CC: " + epNo);
    }

    @EventListener
    public void ListenToEvent
    (TheBigBangTheoryEvent event) {
        watchBigBang(event.getEpisodeNo());
    }
    
    @EventListener
    public void ListenToEventCC
    (TheComedyCircusEvent event) {
        watchComdeyCircus(event.getEpisodeNumber());
    }
}
