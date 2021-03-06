package com.zxw.entities;

import javax.persistence.*;

/**
 * Created by Administrator on 2019-4-24.
 */
@Entity
@Table(name = "jojo_role")
public class JojoRole {
    private long id;
    private String name;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JojoRole jojoRole = (JojoRole) o;

        if (id != jojoRole.id) return false;
        if (name != null ? !name.equals(jojoRole.name) : jojoRole.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
