package com.pineapple.hawaiianPizza.memo;

import com.pineapple.hawaiianPizza.memo.dto.MemoRequest
import com.pineapple.hawaiianPizza.memo.dto.MemoResponse
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
@RestController
@RequestMapping("/memo")
class MemoController(private val memoService: MemoService) {
    @PostMapping
    fun postTestMemo(@RequestBody rq: MemoRequest.Create): MemoResponse.Result{
        return MemoResponse.Result(memoService.postTestMemo(rq))
    }
}
