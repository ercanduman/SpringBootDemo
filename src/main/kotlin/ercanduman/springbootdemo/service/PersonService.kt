package ercanduman.springbootdemo.service

import ercanduman.springbootdemo.Constants
import ercanduman.springbootdemo.data.dao.PersonDao
import ercanduman.springbootdemo.data.entity.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class PersonService(
        @Autowired // Thanks to @Autowired annotation, Spring will instantiate and inject this object via dependency injection. 
        @Qualifier(Constants.QUALIFIER_NAME) // Get data based on qualifier name
        private val dao: PersonDao
) {
    fun insert(person: Person) = dao.insert(person)
    fun update(person: Person) = dao.update(person)
    fun delete(id: Int) = dao.delete(id)
    fun personList(): List<Person> = dao.personList()
    fun getPerson(id: Int): Person = dao.getPerson(id)
}