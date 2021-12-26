package hue.edu.xiong.volunteer_travel.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user_attractions")
public class UserAttractions implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "attractions_id")
    private Attractions attractions;

    @Column(name = "userAttractionsDescribe")
    private String describe;

    @Column(name = "createDate")
    private Date createDate;

    @Column(name = "begin_date")
    private String begindate;

    @Column(name = "end_date")
    private String enddate;

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public Attractions getAttractions() { return attractions; }

    public void setAttractions(Attractions attractions) { this.attractions = attractions; }

    public String getDescribe() { return describe; }

    public void setDescribe(String describe) { this.describe = describe; }

    public Date getCreateDate() { return createDate; }

    public void setCreateDate(Date createDate) { this.createDate = createDate;}
}
