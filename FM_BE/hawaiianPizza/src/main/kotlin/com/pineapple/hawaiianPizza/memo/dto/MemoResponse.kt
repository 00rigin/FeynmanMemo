package com.pineapple.hawaiianPizza.memo.dto

class MemoResponse {

    class Result(dto: MemoDto) {
        var id: Long

        var parentId: Long?

        var title: String

        var description: String

        init {
            this.id = dto.id
            this.parentId = dto.parentId
            this.title = dto.title
            this.description = dto.description
        }
    }


}