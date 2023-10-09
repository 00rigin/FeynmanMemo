package com.pineapple.hawaiianPizza.memo.dto

class MemoRequest {

    class Create(title: String, description: String, parentSn: Long){
        val title = title
        val description = description
        val parentSn = parentSn
    }
}