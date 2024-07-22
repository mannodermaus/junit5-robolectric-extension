package tech.apter.junit.jupiter.robolectric.integration.tests.agp.kotlin.dsl

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
//import org.junit.jupiter.api.extension.ExtendWith
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
//import org.junit.jupiter.api.Test
//import org.junit.jupiter.api.extension.ExtendWith
import tech.apter.MainActivity
//import tech.apter.junit.jupiter.robolectric.RobolectricExtension

@RunWith(RobolectricTestRunner::class)
//@ExtendWith(RobolectricExtension::class)
class ActivityScenarioTest {
    @Test
    fun `test 1`() {
        println("1")
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        println(" - check")
        onView(withText("Changed")).check(doesNotExist())
        println(" - click")
        onView(withText("Click me")).perform(click())
        println(" - verify")
        onView(withText("Changed")).check(matches(isDisplayed()))

        scenario.close()
    }

    @Test
    fun `test 2`() {
        println("2")
        val scenario = ActivityScenario.launch(MainActivity::class.java)

        println(" - check")
        onView(withText("Changed")).check(doesNotExist())
        println(" - click")
        onView(withText("Click me")).perform(click())
        println(" - verify")
        onView(withText("Changed")).check(matches(isDisplayed()))

        scenario.close()
    }
}
