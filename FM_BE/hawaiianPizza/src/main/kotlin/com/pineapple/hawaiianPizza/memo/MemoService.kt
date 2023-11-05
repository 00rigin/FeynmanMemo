package com.pineapple.hawaiianPizza.memo

import com.pineapple.hawaiianPizza.memo.dto.MemoDto
import com.pineapple.hawaiianPizza.memo.dto.MemoRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemoService(private val memoRepository: MemoRepository) {

    @Transactional
    fun postTestMemo(rq: MemoRequest.Create): MemoDto{
        val parentMemo = memoRepository.findById(rq.parentSn).orElse(null)
        val newMemo = memoRepository.save(Memo(rq.title, rq.description, parentMemo))

        return MemoDto(newMemo)
    }
}