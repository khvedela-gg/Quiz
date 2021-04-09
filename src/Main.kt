fun main () {
    val f1 = Fraction(n = 7f, d = 5f)

    val f2 = Fraction(n = 9f, d = 4f)



    println(f1.addition(f2))
    println(f1.subtraction(f2))

}
class Fraction (n:Float, d:Float) {
    private var numerator: Float = n
    private var denominator: Float = d
    override fun toString(): String {
        return "$numerator/$denominator"
    }
    fun addition(fraction: Fraction): Fraction {
        val k: Float = denominator * fraction.denominator
        val v: Float = k / fraction.denominator * fraction.denominator
        val z: Float = k / fraction.denominator * fraction.numerator
        return  Fraction(v + z, k )
    }
    fun subtraction(fraction: Fraction): Fraction {
        val k: Float = denominator * fraction.denominator
        val v: Float = k / fraction.denominator * fraction.denominator
        val z: Float = k / fraction.denominator * fraction.numerator
        return  Fraction(v + z, k )
    }
    fun  Shortening() {
        var a: Float = numerator
        var b: Float = denominator
        while (a != 0F && b != 0F) {
            if (a > b) {
                a = a % b
            } else {
                b = b % a
            }
        }
        val m: Float = a + b
        val nn: Float = numerator / m
        val dd: Float = denominator / m
        this.denominator = dd
        this.numerator = nn
        println("$nn/$dd")
    }
    fun main (){
        val coordinate1=point(X=5f, Y=5F)
        val coordinate2=point(X=9f, Y=4F)
        println(message = coordinate1)
        println(message = coordinate2)
        coordinate1.movingX(k: 3F)
        coordinate2.movingY(m: 5F)

    }
    class point(private var X: Float, private var Y: Float) {
        fun movingX(k: Float) {
            val v: Float = Y -k
            println($X;$v)
        }
        fun movingY(m: Float) {
            val v: Float = X - m
            println($v;$Y)
        }
    }
}

