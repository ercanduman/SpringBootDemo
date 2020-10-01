package ercanduman.springbootdemo.data.dao

import ercanduman.springbootdemo.Constants
import ercanduman.springbootdemo.data.entity.Person
import org.springframework.stereotype.Repository

@Repository(Constants.QUALIFIER_FAKE_DATA)
class FakePersonDaoImpl : PersonDao {
    private val personListDatabase = mutableMapOf<Int, Person>()

    init {
        for (i in 1..5) {
            personListDatabase[i] = Person(i, "User name $i", "user$i@mail.com")
        }
    }

    override fun personList(): List<Person> = personListDatabase.values.toList()
    override fun getPerson(id: Int): Person? = personListDatabase[id]
    override fun insert(person: Person): Int {
        personListDatabase += (person.id to person) // alternative to personListDatabase[person.id] = person
        val result = personListDatabase[person.id]
        return if (result != null) Constants.RESULT_CODE_SUCCESS else Constants.RESULT_CODE_FAILURE
    }

    override fun delete(id: Int): Int {
        val result = personListDatabase.remove(id)
        return if (result != null) Constants.RESULT_CODE_SUCCESS else Constants.RESULT_CODE_FAILURE
    }

    override fun update(person: Person): Int {
        val result = personListDatabase.replace(person.id, person)
        return if (result != null) Constants.RESULT_CODE_SUCCESS else Constants.RESULT_CODE_FAILURE
    }
}