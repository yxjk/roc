package com.yxjk.diip.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "DI_MENU")
public class Menu {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NAME_EN")
    private String nameEn;

    @Column(name = "ROUTER")
    private String router;

    @Column(name = "ICON")
    private String icon;

    @Column(name = "SEQ")
    private String seq;

    @Column(name="parent_id")
    private String parentId;

    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="parent_id")
    private List<Menu> children;
}
