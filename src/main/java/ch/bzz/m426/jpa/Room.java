package ch.bzz.m426.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Room")
@NamedQueries({

})
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomId")
    private int roomId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;


    @SuppressWarnings("JpaModelReferenceInspection")
    @OneToMany(mappedBy = "Room", cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Reservation> rooms = new ArrayList<>();

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
