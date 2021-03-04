//public infix fun Int.(v: Int): Int =  v * v

data class Complex(val real: Double, val imaginary: Double) {
    operator fun plus(add: Complex) =
        Complex(this.real + add.real, this.imaginary + add.imaginary)

    operator fun times(c: Complex) =
        Complex(this.real * c.real - this.imaginary * c.imaginary,
            this.real * c.imaginary + this.imaginary * c.real)

    override fun toString() = "$real + $imaginary i"
}


val c1 = Complex(1.0, 2.0)
val c2 = Complex(7.0, 3.0)


fun main(args: Array<String>) {
    println("Hello World!")
    println("Complex 1: $c1, Complex 2: $c2")
    println("Sum of complex: ${c1 + c2}")
    println("Product of complex: ${c1 * c2}")
}