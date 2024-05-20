package com.spring.event.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.spring.event.TheBigBangTheoryEvent;
import com.spring.event.TheComedyCircusEvent;

@Component("ZeeCafePublisher")
public class ZeeCafePublisher {
 
//	@Autowired
//	private GarvitListner garvitListner;
	
	@Autowired
	ApplicationEventPublisher applicationEventPublisher;
	
	public void StreamBigBangTheory(String episodeNo) {
		System.out.println("Zee Cafe : Starting BBT" + episodeNo);
		
		applicationEventPublisher.publishEvent(new TheBigBangTheoryEvent(episodeNo));
//		garvitListner.watachBigBang(episodeNo);
	}
	
	public void streamComedyCircus(String epNo) {
		System.out.println("Zee Cafe : Starting Comedy Circus" + epNo);
		applicationEventPublisher.publishEvent(new TheComedyCircusEvent(epNo));
	}
}
 