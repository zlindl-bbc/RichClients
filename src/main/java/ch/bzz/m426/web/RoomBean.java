package ch.bzz.m426.web;

import ch.bzz.m426.ejb.RoomService;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "roomBean")
@RequestScoped
public class RoomBean {

    @EJB
    private RoomService roomService;
}
