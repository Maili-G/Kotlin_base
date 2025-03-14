import java.awt.geom.NoninvertibleTransformException

fun coucou():String{
        return "coucou"
}

fun bonjour():String{
        println("Quel est votre nom : ")
        val nom = readln()
        return "Bonjour $nom"
}

fun calcul(a:Int, b:Int):String {
        val somme = a + b
        println("somme = $somme ")
        if (a > b) {
                val difference = a - b
                println ("difference = $difference")
        }
        else {
                val difference = b - a
                println ("difference = $difference")
        }
        val produit = a * b
        println (" produit = $produit ")

        if (a == 0 || b == 0) {
                return ("La division par 0 n'est pas traitée")
        }
        else {
                val quotient = a / b
                return ("quotient = $quotient")
        }
}

fun tarifReduit():String{
        println("Quel est votre âge  : ")
        val age = readln().toInt()
        if (age < 26 ){
                return ("Tarif réduit")
        }
        else{
                return ("Tarif normal")
        }
}

fun produit(a:Int, b:Int):String{
        if((a>=0 && b>=0) || (a<0 && b<0)){
                return "Produit positif"
        }
        else{
                return "Produit négatif"
        }
}

fun bissextile(annee:Int):String{
        if((annee%4==0 && annee%100!=0) || annee%400==0){
                return "Année bissextile"
        }
        else{
                return "Année non bissextile"
        }
}

fun compteur(n:Int):Int {
        var compt: Int = 0
        while (compt <= n) {
                println("$compt")
                compt++
        }
        return 1
}

fun pair_ou_impair(nb:Int):Int{
        var i:Int = nb
        if (nb%2==0){
                println("nombre pair >")
                while (i<=nb+18){ // va afficher les 9 prochains nombres en plus de nb
                        println(i)
                        i+=2
                }
        }
        else{
                println("nombre impair >")
                while (i<=nb+18){ // va afficher les 9 prochains nombres en plus de nb
                        println(i)
                        i+=2
                }
        }
        return 1
}

fun mutiple (multiple:Int,nb:Int):Unit{
        var i:Int=0
        for (i in 0..nb step 1){
                if (i%multiple==0){
                        println(i)
                }
        }
}

fun devinette(): Unit{
        val aleatoire=(0..100).random()
        var essais:Int=1
        while (essais<=7){
                println("Saisisez un nombre : ")
                var rep= readln().toInt()
                if (rep==aleatoire){
                        println("Nombre trouvé en $essais essais")
                        break
                }
                else if (rep<aleatoire){
                        println("Trop petit")
                }
                else {
                        println("Trop grand")
                }
                essais++
        }
        if (essais>7) {
                println("Nombre d'essais maximum atteint, le réponse était $aleatoire")
        }
}

fun tableau (){
        var tableau=arrayOf<Int>()
        for(i in 1..10){
                tableau += (1..100).random()
        }
        println(tableau.contentToString())
        tableau.sorted()
        println(tableau)
}