package ercanduman.springbootdemo.data.dao

import ercanduman.springbootdemo.data.entity.Person

interface PersonDao {
    fun insert(person: Person): Boolean
    fun update(person: Person)
    fun delete(id: Int): Person
    fun people(): List<Person>
}