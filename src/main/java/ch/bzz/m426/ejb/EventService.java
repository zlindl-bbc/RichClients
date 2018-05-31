package ch.bzz.m426.ejb;

import ch.bzz.m426.jpa.Event;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class EventService {

    @PersistenceContext(unitName = "RichClients")
    private EntityManager em;

    public List<Event> getAllEvent() {
        return em.createNamedQuery("Event.findAll", Event.class).getResultList();
    }
}
