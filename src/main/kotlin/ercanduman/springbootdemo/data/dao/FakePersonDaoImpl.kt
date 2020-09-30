package ercanduman.springbootdemo.data.dao

import ercanduman.springbootdemo.Constants
import ercanduman.springbootdemo.data.entity.Person
import org.springframework.stereotype.Repository

@Repository(Constants.QUALIFIER_NAME)
class FakePersonDaoImpl : PersonDao {
    private val personListDatabase = mutableListOf<Person>()

    init {
        for (i in 1..5) {
            personListDatabase.add(Person(i, "User name $i", "user$i@mail.com"))
        }
    }

    override fun insert(person: Person) = personListDatabase.add(person)
    override fun update(person: Person) = personListDatabase.add(person.id, person)
    override fun delete(id: Int): Person = personListDatabase.removeAt(id)
    override fun personList(): List<Person> = personListDatabase
    override fun getPerson(id: Int): Person = personListDatabase[id - 1]
}