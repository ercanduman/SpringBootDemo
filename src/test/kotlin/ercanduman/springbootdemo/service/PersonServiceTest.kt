package ercanduman.springbootdemo.service

import ercanduman.springbootdemo.Constants
import ercanduman.springbootdemo.data.entity.Person
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PersonServiceTest(@Autowired val service: PersonService) {

    @Test
    fun `test insertion when for random id field`() {
        val result = service.insert(Person(33, "Test"))
        assertEquals(Constants.RESULT_CODE_SUCCESS, result)
    }
}