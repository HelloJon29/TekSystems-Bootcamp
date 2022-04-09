package com.jonathankim.monster_factory.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Vault {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vaultId;

    @OneToOne
    private User userId;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Monster> monVaultList;

    //Getter and Setters
    public long getVaultId() {
        return vaultId;
    }

    public void setVaultId(long vaultId) {
        this.vaultId = vaultId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public List<Monster> getMonVaultList() {
        return monVaultList;
    }

    public void setMonVaultList(List<Monster> monVaultList) {
        this.monVaultList = monVaultList;
    }
}
