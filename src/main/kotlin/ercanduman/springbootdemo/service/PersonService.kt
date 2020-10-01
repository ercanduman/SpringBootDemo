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
) : PersonDao {
    override fun insert(person: Person) = dao.insert(person)
    override fun update(person: Person) = dao.update(person)
    override fun delete(id: Int) = dao.delete(id)
    override fun personList() = dao.personList()
    override fun getPerson(id: Int) = dao.getPerson(id)
}