package kg.example.testtest

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kg.example.testtest.databinding.ActivityMainBinding
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith( JUnit4 :: class )
class MainActivityTest {
        @Rule
        @JvmField
        var snapio = ActivityScenarioRule(MainActivity::class. java)

        @Test
        fun simpleDivide() {
            onView(withId(R.id.firtEd)).perform(typeText( "6"))
            onView(withId(R.id.secondEd)).perform(typeText( "3"))
            onView(withId(R.id.btn)).perform(click())
            onView(withId(R.id.result)).check(matches(withText( "2")))
        }

    }

