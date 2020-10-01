package ercanduman.springbootdemo

/**
 * Constants object created to eliminate hard-coded typing within code.
 */
object Constants {
    const val QUALIFIER_FAKE_DATA = "fakeData"
    const val QUALIFIER_POSTGRESQL_DATA = "postgreData"

    /**
     * fakeData: used for fake requests and testing purposes.
     *
     * Based on database implementation, postgreData or oracleData, mongodbData can be used as well.
     */
    const val QUALIFIER_NAME = QUALIFIER_FAKE_DATA

    /**
     * URLs
     */
    const val URL_PERSON_LIST = "/api/v1/person"
    const val URL_PERSON_BY_ID = "/{id}"

    /**
     * Codes for execution results
     */
    const val RESULT_CODE_SUCCESS = 0
    const val RESULT_CODE_FAILURE = -1
}