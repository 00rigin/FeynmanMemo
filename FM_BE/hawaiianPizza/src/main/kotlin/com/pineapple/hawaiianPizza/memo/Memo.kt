package com.pineapple.hawaiianPizza.memo

import com.pineapple.hawaiianPizza.model.BaseEntity
import jakarta.persistence.*

@Entity
class Memo(title: String,
           description: String,
           parent: Memo) : BaseEntity(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @Column(nullable = false)
    private var title: String = title

    @Column(nullable = false)
    private var description: String = description

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private var parent: Memo? = parent

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
    @Column(name = "children_id_list")
    private var children: List<Memo>? = null
}