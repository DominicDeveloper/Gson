import com.google.gson.Gson
import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main(args: Array<String>) {
    val gson = Gson() // jsondan object olinishi

    print("Mashina nomini kiriting: "); val name:String = scanner.next()
    print("Mashina rangini kiriting: "); val color:String = scanner.next()
    print("Mashina tezligini kiriting: "); val speed:String = scanner.next()
    print("Mashina balonlar sonini kiriting: "); val shina:String = scanner.next()

    val mashina = Mashina(name,color,speed,shina) // mashina nomli klassga ozgaruvchilarni tenglab olinishi

    println(mashina.nomi) // ekranga oddiy korinishida ya`ni klass korinishda chiqarish
    println(mashina.rangi)
    println(mashina.tezligi)
    println(mashina.balonlari)
    println("==============================================================================")

    println(gson.toJson(mashina)) // bir martaga klass ma`lumotlarini json korinishida ekranga chiqarish

    val jsonKlass = gson.toJson(mashina) // mashina klassini json tipiga olib bitta ozgaruvchiga tenglab qoyish


    print("Json ma`lumotni klass ko`rinishiga olasizmi?  Xa/Yoq"); val tanlov = scanner.next()
    if (tanlov == "Xa" || tanlov == "Ha" || tanlov == "xa" || tanlov == "ha" || tanlov == "XA"){
        val jsonNiklassgaotkazish = gson.fromJson<Mashina>(jsonKlass,Mashina::class.java) // yuqorida tenglangan json malumotni qayta klass tipiga olinishi
        println(jsonNiklassgaotkazish.nomi)
        println(jsonNiklassgaotkazish.rangi)
        println(jsonNiklassgaotkazish.tezligi)
        println(jsonNiklassgaotkazish.balonlari)
    }else{
        return
    }

}
class Mashina{
    var nomi:String = ""
    var rangi:String = ""
    var tezligi:String = ""
    var balonlari:String = ""

    constructor()
    constructor(nomi: String, rangi: String, tezligi: String, balonlari: String) {
        this.nomi = nomi
        this.rangi = rangi
        this.tezligi = tezligi
        this.balonlari = balonlari
    }

}


