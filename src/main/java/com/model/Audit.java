package com.model;


import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


import java.util.Date;

@MappedSuperclass
public abstract class Audit {

   private String createdAt;
   private String modifiedAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Audit() {
        setCreatedAt(new Date()+"");
        setModifiedAt(new Date()+"");
    }
}
