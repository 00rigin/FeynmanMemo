package com.pineapple.hawaiianPizza.memo

import com.pineapple.hawaiianPizza.model.BaseEntity
import jakarta.persistence.*
import lombok.Getter

@Entity
@Getter
class Memo(title: String,
           description: String) : BaseEntity(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L

    @Column(nullable = false)
    var title: String = title

    @Column(nullable = false)
    var description: String = description

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private var parent: Memo? = null

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
    @Column(name = "children_id_list")
    private var children: List<Memo>? = null
    constructor (title: String, description: String, parent: Memo?) : this(title, description) {
        this.parent = parent
    }
}