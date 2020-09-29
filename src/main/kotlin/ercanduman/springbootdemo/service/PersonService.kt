package ercanduman.springbootdemo.service

import ercanduman.springbootdemo.Constants
import ercanduman.springbootdemo.data.dao.PersonDao
import ercanduman.springbootdemo.data.entity.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class PersonService(
        @Autowired
        @Qualifier(Constants.QUALIFIER_NAME)
        private val dao: PersonDao
) {
    fun insert(person: Person) = dao.insert(person)
    fun update(person: Person) = dao.update(person)
    fun delete(id: Int) = dao.delete(id)
    fun people(): List<Person> = dao.people()
}