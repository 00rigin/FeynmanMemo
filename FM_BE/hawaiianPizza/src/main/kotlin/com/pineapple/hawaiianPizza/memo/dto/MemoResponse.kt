package com.pineapple.hawaiianPizza.memo.dto

class MemoResponse {

    class Result{
        var id: Long

        var title: String

        var description: String

        constructor(dto: MemoDto){
            this.id = dto.id
            this.title = dto.title
            this.description = dto.description
        }
    }


}