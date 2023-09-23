package ioL.RentACar.entities.concretes;
import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
    @Column(name="name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @OneToMany(mappedBy = "brand")
    private List<Model> model;


}
