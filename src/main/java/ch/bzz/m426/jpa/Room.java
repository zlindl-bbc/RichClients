package ch.bzz.m426.jpa;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Room")

@NamedQueries({

})
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RoomId")
    private Long roomId;
}
