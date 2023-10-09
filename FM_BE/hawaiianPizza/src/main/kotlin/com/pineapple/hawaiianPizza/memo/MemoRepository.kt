package com.pineapple.hawaiianPizza.memo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MemoRepository: JpaRepository<Memo, Long> {

}