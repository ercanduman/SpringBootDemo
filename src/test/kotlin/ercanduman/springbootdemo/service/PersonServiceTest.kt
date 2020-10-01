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
    internal fun `test get person list from in memory db`() {
        // Initially 5 records added to in memory database 
        val result = service.personList()
        assertEquals(result.size, 5)
    }

    @Test
    internal fun `test get person by id from in memory db`() {
        // Initially 5 records added to in memory database and get one of them for id between 1 to 5 (inclusive) 
        val result = service.getPerson(3)
        assertEquals((result as Person).id, 3)
    }

    @Test
    internal fun `test insertion when for random id field`() {
        val result = service.insert(Person(33, "Test"))
        assertEquals(Constants.RESULT_CODE_SUCCESS, result)
    }

    @Test
    internal fun `test deletion for id  from 1 to 5 (inclusive)`() {
        val result = service.delete(5)
        assertEquals(Constants.RESULT_CODE_SUCCESS, result)
    }

    @Test
    internal fun `test delete for a non available id`() {
        val result = service.delete(44)
        assertEquals(Constants.RESULT_CODE_FAILURE, result)
    }

    @Test
    internal fun `test get person for id 2 and update its name`() {
        val updatePerson = service.getPerson(2)
        if (updatePerson is Person) updatePerson.name += " - Updated"
        val result = service.update(updatePerson as Person)
        assertEquals(Constants.RESULT_CODE_SUCCESS, result)
    }

    @Test
    internal fun `test update unavailable person`() {
        val updatePerson = service.getPerson(11111)
        val result = if (updatePerson is Person) {
            updatePerson.name = " - Updated"
            service.update(updatePerson)
        } else updatePerson as Int
        assertEquals(Constants.RESULT_CODE_FAILURE, result)
    }
}