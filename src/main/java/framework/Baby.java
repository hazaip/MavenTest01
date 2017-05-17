package framework;


import javax.persistence.*;

@Entity
@Table(name = "babies")
public class Baby {

    @Id
    @GeneratedValue
    private String id;
    private String name;
    private EGender gender;
    @ManyToOne
    private User parent;

    public Baby() {
    }

    public Baby(String name, EGender gender, User parent) {
        this.name = name;
        this.gender = gender;
        this.parent = parent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EGender getGender() {
        return gender;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }
}
