package ercanduman.springbootdemo.data.dao

import ercanduman.springbootdemo.Constants
import ercanduman.springbootdemo.data.entity.Person
import org.springframework.stereotype.Repository

@Repository(Constants.QUALIFIER_NAME)
class FakePersonDaoImpl : PersonDao {
    private val personListDatabase = mutableMapOf<Int, Person>()

    init {
        for (i in 1..5) {
            personListDatabase[i] = Person(i, "User name $i", "user$i@mail.com")
        }
    }

    override fun insert(person: Person) = personListDatabase.put(person.id, person)
    override fun delete(id: Int) = personListDatabase.remove(id)
    override fun personList(): List<Person> = personListDatabase.values.toList()
    override fun getPerson(id: Int): Person? = personListDatabase[id]
    override fun update(person: Person) {
        personListDatabase.replace(person.id, person)
    }
}