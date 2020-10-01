package ercanduman.springbootdemo.data.dao

import ercanduman.springbootdemo.Constants
import ercanduman.springbootdemo.data.entity.Person
import org.springframework.stereotype.Repository

@Repository(Constants.QUALIFIER_POSTGRESQL_DATA)
class PostgreSqlPersonDaoImpl : PersonDao {
    override fun personList(): List<Person> {
        return listOf(Person(id = 33, name = "Data from postgres"))
    }

    override fun getPerson(id: Int): Any {
        TODO("Not yet implemented")
    }

    override fun insert(person: Person): Int {
        TODO("Not yet implemented")
    }

    override fun delete(id: Int): Int {
        TODO("Not yet implemented")
    }

    override fun update(person: Person): Int {
        TODO("Not yet implemented")
    }
}