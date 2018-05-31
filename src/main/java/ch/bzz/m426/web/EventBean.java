package ch.bzz.m426.web;

import ch.bzz.m426.ejb.EventService;
import ch.bzz.m426.jpa.Event;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

@ManagedBean(name = "eventBean")
@RequestScoped
public class EventBean {

    @EJB
    private EventService eventService;

    private List<Event> eventList;

    @PostConstruct
    public void init() {
        setEventList(eventService.getAllEvent());
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
