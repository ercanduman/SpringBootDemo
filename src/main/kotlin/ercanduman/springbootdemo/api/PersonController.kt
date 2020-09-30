package ercanduman.springbootdemo.api

import ercanduman.springbootdemo.Constants
import ercanduman.springbootdemo.data.entity.Person
import ercanduman.springbootdemo.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(Constants.URL_PERSON_LIST)
class PersonController(@Autowired private val service: PersonService) {
    @PostMapping
    fun insert(@RequestBody person: Person) = service.insert(person)

    @PutMapping
    fun update(person: Person) = service.update(person)

    @DeleteMapping
    fun delete(id: Int) = service.delete(id)

    @GetMapping
    fun personList(): List<Person> = service.personList()

    @GetMapping(Constants.URL_PERSON_BY_ID)
    fun getPerson(@PathVariable("id") id: Int): Person = service.getPerson(id)
}