package ercanduman.springbootdemo

/**
 * Constants object created to eliminate hard-coded typing within code.
 */
object Constants {
    /**
     * fakeData: used for fake requests and testing purposes.
     *
     * Based on database implementation, postresqlData or oracleData, mongodbData can be used as well.
     */
    const val QUALIFIER_NAME = "fakeData"

    /**
     * URLs
     */
    const val URL_PERSON_LIST = "/api/v1/person"
    const val URL_PERSON_BY_ID = "/{id}"
}