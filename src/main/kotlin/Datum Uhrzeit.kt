import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main(){



    val time = LocalTime.now()
        .format(DateTimeFormatter.ofPattern("hh.mm.ss"))
    println(time)
}