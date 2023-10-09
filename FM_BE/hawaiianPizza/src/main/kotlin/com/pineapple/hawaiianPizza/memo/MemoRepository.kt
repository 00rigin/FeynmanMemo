package com.pineapple.hawaiianPizza.memo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemoRepository: JpaRepository<Memo, Long> {
    fun findByTitle(title: String): Memo?
}