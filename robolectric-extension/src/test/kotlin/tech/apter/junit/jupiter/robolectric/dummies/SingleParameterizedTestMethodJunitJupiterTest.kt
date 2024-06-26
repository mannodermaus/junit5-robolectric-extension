package tech.apter.junit.jupiter.robolectric.dummies

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import tech.apter.junit.jupiter.robolectric.RobolectricExtension
import java.util.stream.Stream
import kotlin.test.assertContains

@Disabled
@ExtendWith(RobolectricExtension::class)
class SingleParameterizedTestMethodJunitJupiterTest {
    @ParameterizedTest
    @MethodSource("testParameters")
    fun parameterizedTestMethod(number: Int) = assertContains(setOf(1, 2), number)

    companion object {
        @JvmStatic
        fun testParameters(): Stream<Arguments> = Stream.of(Arguments.of(1), Arguments.of(2))
    }
}
