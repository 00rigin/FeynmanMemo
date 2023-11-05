package com.pineapple.hawaiianPizza.memo.dto

import com.pineapple.hawaiianPizza.memo.Memo

class MemoDto(memo: Memo) {

    var id: Long
    var parentId : Long?
    var title: String
    var description: String

    init {
        this.id = memo.getId()
        this.parentId = memo.getParentId()
        this.title = memo.title
        this.description = memo.description
    }

}