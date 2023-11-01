package com.pineapple.hawaiianPizza.memo

import com.pineapple.hawaiianPizza.memo.dto.MemoDto
import com.pineapple.hawaiianPizza.memo.dto.MemoRequest
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemoService(private val memoRepository: MemoRepository) {

    @Transactional
    fun postMemo(rq: MemoRequest.Create): MemoDto{
        val parentMemo = memoRepository.findByIdOrNull(rq.parentSn)
        val newMemo = memoRepository.save(Memo(rq.title, rq.description, parentMemo))

        return MemoDto(newMemo)
    }


    fun getMemo(memoSn: Long): MemoDto{
        val targetMemo = memoRepository.findByIdOrNull(memoSn) ?: throw IllegalStateException("Memo not found")
        return MemoDto(targetMemo)
    }
}
