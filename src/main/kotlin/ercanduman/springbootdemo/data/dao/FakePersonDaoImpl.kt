package ercanduman.springbootdemo.data.dao

import ercanduman.springbootdemo.Constants
import ercanduman.springbootdemo.data.entity.Person
import org.springframework.stereotype.Repository

@Repository(Constants.QUALIFIER_NAME)
class FakePersonDaoImpl : PersonDao {
    private val personListDatabase = mutableListOf<Person>(
            Person(1, "User name 1", "user1@mail.com"),
            Person(2, "User name 2", "user2@mail.com"),
            Person(3, "User name 3", "user3@mail.com"),
            Person(4, "User name 4", "user4@mail.com")
    )

    override fun insert(person: Person) = personListDatabase.add(person)
    override fun update(person: Person) = personListDatabase.add(person.id, person)
    override fun delete(id: Int): Person = personListDatabase.removeAt(id)
    override fun people(): List<Person> = personListDatabase
}