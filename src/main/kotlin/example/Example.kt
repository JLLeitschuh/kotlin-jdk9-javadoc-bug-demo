package example

import java.util.function.Supplier

fun testSupplier(message: () -> String) {
    Supplier(message)
}
