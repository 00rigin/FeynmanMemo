package com.pineapple.hawaiianPizza.memo

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemoService(private val memoRepository: MemoRepository) {

    @Transactional
    fun postTestMemo(): String{
        val newMemo = Memo("testTitle", "description")
        memoRepository.save(newMemo)

        return newMemo.title
    }
}