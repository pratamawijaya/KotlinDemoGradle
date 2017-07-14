
import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * Created by pratama on 7/14/17.
 */
class CobaTest : StringSpec() {

    init {
        val listData = listOf("Arya", "Sansa Stark", "Bran Stark", "Rickon Stark", "Robb Stark")

        "House of Stark Family Should be 5" {
            listData.size shouldBe 5
        }

    }
}