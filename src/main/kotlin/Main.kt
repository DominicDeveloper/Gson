import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
val gson = Gson()
var list = ArrayList<Hacker>()
var saveJson = ""
fun main(args: Array<String>) {
    adding()
    println(gson.toJson(list))
    saveJson = gson.toJson(list)

    val type = object : TypeToken<ArrayList<Hacker>>(){}.type
    val listFromGson = gson.fromJson<ArrayList<Hacker>>(saveJson,type)
    for (hacker in listFromGson) {
        println(hacker.nickname)
    }
}
private fun adding(){
    list.add(Hacker("Numpy","Mac pro","Fern","Medium","four"))
    list.add(Hacker("FR1ENDS","Demonic","Metasploit","High","ten"))
    list.add(Hacker("Me","Lenevo","Linux","Unknown","null"))

}

class Hacker{
    var nickname:String = ""
    var pcModel:String = ""
    var tools:String = ""
    var level:String = ""
    var hackedSites:String = ""
    constructor()
    constructor(nickname: String, pcModel: String, tools: String, level: String, hackedSites: String) {
        this.nickname = nickname
        this.pcModel = pcModel
        this.tools = tools
        this.level = level
        this.hackedSites = hackedSites
    }

}