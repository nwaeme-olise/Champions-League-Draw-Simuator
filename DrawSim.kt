class Club(val name:String, val country: String) {

}


fun main() {

    val CHE = Club("Chelsea", "ENG")
    val MUN = Club("Manchester United", "ENG")
    val MCI = Club("Manchester City", "ENG")
    val LIV = Club("Liverpool", "ENG")
    val ARS = Club("Arsenal", "ENG")

    val RMD = Club("Real Madrid", "ESP")
    val BAR = Club("Barcelona", "ESP")
    val ATM = Club("Atletico", "ESP")
    val SEV = Club("Sevilla", "ESP")


    val BAY = Club("Bayern Munich", "GER")
    val BVB = Club("Borrusia Dortmund", "GER")
    val RBL = Club("RasenBallsport Leipzig", "GER")
    val WOL = Club("Wolfsburg", "GER")

    val JUV = Club("Juventus", "ITA")
    val ATA = Club("Atalanta", "ITA")
    val INT = Club("Inter Milan", "ITA")
    val ACM = Club("AC Milan", "ITA")

    val PSG = Club("Paris Saint Germain", "FRA")
    val MON = Club("AS Monaco", "FRA")
    val MAR = Club("Olympique Marseille", "FRA")
    val LYO = Club ("Olympique Lyonnais", "FRA")

    val AJX = Club("Ajax Amsterdam", "NED")
    val PSV = Club("PSV Eindhoven", "NED")

    val RAN = Club("Rangers", "SCO")
    val CEL = Club("Celtic", "SCO")

    val SHE = Club("Sheriff Tiraspol", "MOL")
    val FER = Club("Ferencvaros", "HUN")
    val SAL = Club("Red Bull Salzburg", "AUT")
    val SHK = Club("Shakhtar Donetsk", "UKR")
    val DYN = Club("Dinamo Kyiv", "UKR")

    val POR = Club("Porto", "POR")
    val SCP = Club("Sporting Club de Portugal", "POR")

    val pot1 = listOf(LIV, RMD, BAY, JUV, ARS, PSG, POR, MCI)
    val pot2 = listOf(BAR, ATM, INT, CHE, BVB, SEV, MUN, LYO)
    val pot3 = listOf(SCP, AJX, RBL, SAL, ATA, RAN, MON, SHK)
    val pot4 = listOf(DYN, CEL, SHE, FER, MAR, PSV, ACM, WOL)

    val Pot1 = pot1.shuffled().toMutableList()
    val Pot2 = pot2.shuffled().toMutableList()
    val Pot3 = pot3.shuffled().toMutableList()
    val Pot4 = pot4.shuffled().toMutableList()

    val groupA = mutableListOf<Club>()
    val groupB = mutableListOf<Club>()
    val groupC = mutableListOf<Club>()
    val groupD = mutableListOf<Club>()
    val groupE = mutableListOf<Club>()
    val groupF = mutableListOf<Club>()
    val groupG = mutableListOf<Club>()
    val groupH = mutableListOf<Club>()

    val groupList = listOf(groupA, groupB, groupC, groupD, groupE, groupF, groupG, groupH)



     for (x in 0..7){
         groupList[x].add(Pot1[x])
     }
    for (x in 0..7) {
      if (Pot2[x].country == (groupList[x])[0].country){
          groupList[x].add(Pot2[((7*Math.random()).toInt())])
      }
      else{
          groupList[x].add(Pot2[x])
      }
    }

    for (x in 0..7){
        if ((Pot3[x].country == (groupList[x])[0].country) || (Pot3[x].country == (groupList[x])[1].country)) {
            groupList[x].add(Pot3[((7 * Math.random()).toInt())])
        }
            else {
                groupList[x].add(Pot3[x])
        }
    }

    for (x in 0..7){
        if ((Pot4[x].country == (groupList[x])[0].country) || (Pot4[x].country == (groupList[x])[1].country) || (Pot4[x].country == (groupList[x])[2].country)){
            groupList[x].add(Pot4[((7 * Math.random()).toInt())])
        }
        else {
            groupList[x].add(Pot4[x])
        }
    }

     println("Group A")
     for (i in groupA) {println (i.name)}

    println("")

    println("Group B")
    for (i in groupB) {println (i.name)}

    println("")

    println("Group C")
    for (i in groupC) {println (i.name)}

    println("")

    println("Group D")
    for (i in groupD) {println (i.name)}

    println("")

    println("Group E")
    for (i in groupE) {println (i.name)}

    println("")

    println("Group F")
    for (i in groupF) {println (i.name)}

    println("")

    println("Group G")
    for (i in groupG) {println (i.name)}

    println("")

    println("Group H")
    for (i in groupH) {println (i.name)}


}