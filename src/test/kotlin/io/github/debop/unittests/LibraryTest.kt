/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package io.github.debop.unittests

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class LibraryTest {

    @Test
    fun `some library test`() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }
}
