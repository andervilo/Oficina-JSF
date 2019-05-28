package br.com.projetooficina.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_detail")
public class UserDetail {
    @Id
    @Column(name="user_id")
    private int id;
    @Column(name="user_name")
    private String userName;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }   
    @Override
    public String toString() {
       return "UserDetail [id=" + id + ", userName=" + userName + "]";
    }
}
