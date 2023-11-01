package com.pineapple.hawaiianPizza.memo

import com.pineapple.hawaiianPizza.model.BaseEntity
import lombok.Getter
import javax.persistence.*

@Entity
@Getter
class Memo(
    @Column(nullable = false)
    var title: String,
    @Column(nullable = false)
    var description: String) : BaseEntity(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long = 0L

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private var parent: Memo? = null

    fun getId(): Long {
        return id
    }

    fun getParentId(): Long? {
        return parent?.id
    }

    constructor (title: String, description: String, parent: Memo?) : this(title, description) {
        this.parent = parent
    }
}