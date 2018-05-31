package ch.bzz.m426.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class RoomService {

    @PersistenceContext(unitName = "RichClients")
    private EntityManager em;
}
