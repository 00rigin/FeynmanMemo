package com.pineapple.hawaiianPizza.memo.dto

import com.pineapple.hawaiianPizza.memo.Memo

class MemoDto {

    var id: Long
    var title: String
    var description: String

    constructor(memo: Memo){
        this.id = memo.id
        this.title = memo.title
        this.description = memo.description
    }

}