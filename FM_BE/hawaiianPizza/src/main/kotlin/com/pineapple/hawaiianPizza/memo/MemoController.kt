package com.pineapple.hawaiianPizza.memo;

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/memo")
@Tag(name = "예제 API", description = "Swagger 테스트용 API")
class MemoController(private val memoService: MemoService) {
    @PostMapping("/post")
    @Operation(summary = "테스트")
    fun postTestMemo(): String{
        return memoService.postTestMemo()
    }
}
