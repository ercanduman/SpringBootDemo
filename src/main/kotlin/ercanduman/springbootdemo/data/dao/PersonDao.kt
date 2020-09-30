package ercanduman.springbootdemo.data.dao

import ercanduman.springbootdemo.data.entity.Person

interface PersonDao {
    fun insert(person: Person): Person?
    fun update(person: Person): Person?
    fun delete(id: Int): Person?
    fun personList(): List<Person>
    fun getPerson(id: Int): Person?
}