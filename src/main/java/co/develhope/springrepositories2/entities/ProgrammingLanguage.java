package co.develhope.springrepositories2.entities;

import javax.persistence.*;
import java.time.Year;

@Entity
@Table(name = "programminglanguages")
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(nullable = false)
    private String name;
    @Column
    private Year firstAppearance;
    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage () {}

    public ProgrammingLanguage (String id, String name, Year firstAppearance, String inventor ){
        this.id = id;
        this.inventor = inventor;
        this.name = name;
        this.firstAppearance = firstAppearance;
    }
}