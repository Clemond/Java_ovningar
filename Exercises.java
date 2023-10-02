import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.text.Style;

public class Exercises{

    public static void main(String [] args){
        sträng6();
        // sträng4();
        // sträng3();
        // sträng2();
        // sträng1();

        // list5();
        // list4();
        // list3();
        // list2();
        // list1();

        // loop5();
        // loop4();
        // loop3();
        // loop2();
        // loop1();

        // if8();
        // if7();
        // if6();
        // if5();
        // if4();
        // if3();
        // if2();
        // if1();
    }
    public static void sträng6(){
        // Gör ett program där användaren får mata in en mening t ex ”Detta är min text
        // som jag matar in”. Programmet skall räkna ut hur många ord meningen består av
        // och meddela användaren om detta.

        System.out.println("Skriv in en mening: ");
        Scanner myScanner = new Scanner(System.in);
        String mySentence = myScanner.nextLine();

        int totalWords = mySentence.split("\\s").length;
        System.out.println("Antalet ord i den meningen var: " + totalWords);
    }
    public static void sträng4(){
        // a) Du har strängen string namn="kurt andersson";
        // Skriv kod så att förnamnet i variabeln namn börjar med stora bokstäver.
        // b) Skriv kod så att förnamn + efternamn i variablen namn börjar med stora bokstäver.
        // Resultatet skall bli så här "Kurt Andersson"
        
        String namn = "kurt andersson";
        System.out.println("Innan förändring: " + namn);
        String nyttNamn = namn.replace('k', 'K');
        nyttNamn = namn.replace('a', 'A');

        System.out.println(nyttNamn);

    }

    public static void sträng3(){
        // Du har en strängvariabel som innehåller följande text, ”Hello, world”
        // a. Skriv ut vilken position bokstaven w har i strängen (H har position 0). 
        // Ta fram positionen genom kod.

        String myString = "Hello, world";

        System.out.println(myString.indexOf("w"));


    }
    public static void sträng2(){
        // Skapa ett program där du får skriva in två namn, jämför sedan bägge namnen med 
        // metoden equals för att se om de bägge namnen överensstämmer.

        System.out.println("Skriv in ett namn: ");
        Scanner myScanner = new Scanner(System.in);
        String myName1 = myScanner.nextLine();

        System.out.println("Skriv in ett namn till: ");
        myScanner = new Scanner(System.in);
        String myName2 = myScanner.nextLine();

        if(myName1.equalsIgnoreCase(myName2)){
            System.out.println("Namnen matchade!");
        }
        else{
            System.out.println("Ingen match hittades!");
        }
    }

    public static void sträng1(){
        // Be användaren mata in 3 strängar. Addera ihop strängarna och skriv ut alla tre
        // strängarna på skärmen
        
        ArrayList<String> myList = new ArrayList<>();

        for(int i = 0; i < 3; i++){
        System.out.println("Skriv in ett objekt: ");
        Scanner myScanner = new Scanner(System.in);
        String myObject = myScanner.nextLine();
        myList.add(myObject);
        }
        
        String summa = myList.get(0) + " " + myList.get(1) + " " + myList.get(2);
        System.out.println(summa);
        
    }

    public static void list5(){
        // Skapa en array med heltal, int. Gör en loop och räkna ihop summan på alla tal i arrayen

        int summa = 0;
        int[] myList = {3,2,5,1,10};

        for(int i = 0; i < myList.length; i++){
            summa = summa + myList[i];
        }
        System.out.println("Summan blev: " + summa);
    }

    public static void list4(){
        // Skapa en array med namn evenNumbers, be användaren mata in ett nummer och ett annat nummer som
        // är högre. Få fram alla nummer mellan dessa två nummer som användaren matade in.
        // Lägg in alla nummer som är jämna dvs delbara med två i arrayen och printa sedan 
        // ut den med en for each-loop.  

        ArrayList<Integer> evenNumbers= new ArrayList<>();

        System.out.println("Skriv in ett nummer:");
        Scanner myScanner = new Scanner(System.in);
        int lowNumber = myScanner.nextInt();

        System.out.println("Skriv in ett till nummer som är större:");
        myScanner = new Scanner(System.in);
        int highNumber = myScanner.nextInt();

        for(int i = highNumber; i >= lowNumber; i--){
            if(i % 2 == 0){
                evenNumbers.add(i);
            }
        }
        System.out.println("Jämna tal som fanns med var:");
        for (int i = 0; i < evenNumbers.size(); i++){
            System.out.println((evenNumbers.get(i)));
        }

    }

    public static void list3(){
        // Utöka uppgift 1 med en inledande fråga där användaren får ange hur många tal den
        // vill mata in. Gör sedan samma sak för att ta fram det största talet.

         ArrayList<Integer> myList = new ArrayList<>();

         System.out.println("Hur många tal vill du skriva in?");
         Scanner myScanner = new Scanner(System.in);
         int antalInskrivnaNummer = myScanner.nextInt();

        for(int i = 0; i < antalInskrivnaNummer; i++){
            System.out.println("Skriv in ett tal:");
             myScanner = new Scanner(System.in);
            int userNumber = myScanner.nextInt();
            myList.add(userNumber);  
        }

        int largest = myList.get(0);

        for (int i = 0; i < myList.size(); i++){
            if(myList.get(i) > largest){
                largest = myList.get(i);
            }
        }   
            System.out.println("Ditt högsta tal är: " + largest);
    }

    public static void list2(){
        // Skapa ett program där användaren får upp fyra frågor om att mata in ett tal. Spara
        // alla talen i en lista. Loopa igenom listan och ta fram det tal som är störst. Skriv
        // tillbaka resultatet på skärmen för användaren

        ArrayList<Integer> myList = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            System.out.println("Skriv in ett tal:");
            Scanner myScanner = new Scanner(System.in);
            int userNumber = myScanner.nextInt();
            myList.add(userNumber);  
        }
        int largest = myList.get(0);

        for (int i = 0; i < myList.size(); i++){
            if(myList.get(i) > largest){
                largest = myList.get(i);
            }
        }
        System.out.println("Din högsta siffra är: " + largest); 
    }

    public static void list1(){
        // Skapa ett program där användaren får upp fyra frågor om att mata in ett tal. Spara
        // alla talen i en lista. Loopa igenom listan och presentera innehåller i konsolen.

        ArrayList<Integer> myList = new ArrayList<Integer>();

        for(int i = 0; i < 4; i++){
            System.out.println("Skriv in ett tal:");
            Scanner myScanner = new Scanner(System.in);
            int userNumber = myScanner.nextInt();
            myList.add(userNumber);  
        }

        for (int i = 0; i < myList.size(); i++){
            System.out.println("Dina sparade tal är " + (myList.get(i)));
        }
    }

    public static void loop5(){
        // Skapa ett program där användaren får mata in ett tal. Låt sedan programmet skriva ut
        // alla siffror som är mindre än det inmatade talet men större än 0. Lös detta med en loop.
        System.out.println("Skriv in tal:");
        Scanner myScanner = new Scanner(System.in);
        int userNumber = myScanner.nextInt();

        for(int i = userNumber-1; i > 0; i--){
            System.out.println(i);
        }
    }

    public static void loop4(){
        // Be användaren mata in ett tal. Spara värdet i en variabel. Upprepa detta 10 gånger. 
        // För varje gång lägg till det inmatade värdet till variabelns värde. 
        // När det är klart skriv ut- Summan av det du matat in är: summan.

        int summa = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println("Skriv in tal:");
            Scanner myScanner = new Scanner(System.in);
            int userNumber = myScanner.nextInt();
            summa = summa + userNumber;
        }
        System.out.println("Din summa blev:" + summa);
}

    public static void loop3(){
        // Skapa ett program där användaren
        // a. Får mata in två tal.
        // b. Skriv sedan till skärmen summan av de två talen.
        // c. Skriv sedan en fråga- Vill du fortsätta(J/N)?.
        // d. Svarar användaren J återupprepas punkt a-c
        // e. Svarar användaren N avbryts programmet

        while(true){
        System.out.println("Skriv in tal 1:");
        Scanner myScanner = new Scanner(System.in);
        int tal1 = myScanner.nextInt();

        System.out.println("Skriv in tal 2:");
        myScanner = new Scanner(System.in);
        int tal2 = myScanner.nextInt();

        int summa = tal1 + tal2;
        System.out.println("summan av talen är " + summa );

        System.out.println("Vill du fortsätta? J/N");
        myScanner = new Scanner(System.in);
        String jaEllerNej = myScanner.nextLine(); 

        if(jaEllerNej.equalsIgnoreCase("j")){
            System.out.println("Nu fortsätter spelet!");
            continue;
        }
        else if(jaEllerNej.equalsIgnoreCase("n"))
            System.out.println("Tack för att du spelade!");
            break;
        }
    }

    public static void loop2(){
        // Skapa ett program där användaren får mata in två tal. Låt sedan programmet skriva ut alla
        // tal som finns mellan dessa två tal på skärmen. Lös detta med en for-loop.

        System.out.println("Skriv in ett tal");
        Scanner myScanner = new Scanner(System.in);
        int tal1 = myScanner.nextInt();

        System.out.println("Skriv in ett tal till");
        myScanner = new Scanner(System.in);
        int tal2 = myScanner.nextInt();

        if(tal2 > tal1){
            for(int i = tal1; i <= tal2; i++){
                System.out.println(i);
            }
        }
        else if(tal1 > tal2){
            for(int i = tal1; i >= tal2; i--){
                System.out.println(i);
            }
        }
    }

    public static void loop1(){
        // Skapa ett program som skriver ut talen 0-10 på skärmen. Lös detta med en for-loop.

        for(int i = 0; i < 11; i++){
            System.out.println(i);
        }
    }

    public static void if8(){
        // Be användaren mata in en summa på hur mycket pengar den har. Be sedan
        // användaren att ange om den har rabatt.
        // a. Om summan är mellan 15 och 25 och användaren inte har rabatt, skriv – Du kan köpa en liten
        // hamburgare.
        // b. Om summan är mellan 15 och 25 och användaren har rabatt, skriv – Du kan köpa en liten
        // hamburgare och en pommes frites.
        // c. Om summan är större än 25 och mindre än eller lika med 50 och användaren inte har rabatt,
        // skriv – Du kan köpa en stor hamburgare.
        // d. Om summan är större än 25 och mindre än eller lika med 50 och användaren har rabatt, skriv –
        // Du kan köpa en stor hamburgare och pommes frites.
        // e. Om summan är större än 60 eller om den är 50 och användaren har rabatt, skriv – Du kan
        // köpa ett meal med dryck.

        System.out.println("Hur mycket pengar har du?");
        Scanner myScanner = new Scanner(System.in);
        int inmatadePengar = myScanner.nextInt();

        System.out.println("Har du rabatt?");
        myScanner = new Scanner(System.in);
        String inmatadRabatt = myScanner.nextLine();

        if((inmatadePengar >= 15) && (inmatadePengar <= 25) && (inmatadRabatt.equalsIgnoreCase("nej"))){
            System.out.println("Du kan köpa en liten hamburgare!");
        }
        else if((inmatadePengar >= 15) && (inmatadePengar <= 25) && (inmatadRabatt.equalsIgnoreCase("ja"))){
            System.out.println("Du kan köpa en liten hamburgare och en pommes frites");
        }
        else if((inmatadePengar > 25) && (inmatadePengar <= 50) && (inmatadRabatt.equalsIgnoreCase("nej"))){
            System.out.println("Du kan köpa en stor hamburgare");
                }
        else if((inmatadePengar > 25) && (inmatadePengar <= 50) && (inmatadRabatt.equalsIgnoreCase("ja"))){
            System.out.println("Du kan köpa en stor hamburgare och pommes frites");
        }
        else if((inmatadePengar > 60) || ((inmatadePengar > 50) && (inmatadRabatt.equalsIgnoreCase("ja")))){
            System.out.println("Du kan köpa ett meal med dryck");
        }
        else if((inmatadePengar > 60) || ((inmatadePengar > 50) && (inmatadRabatt.equalsIgnoreCase("nej")))){
            System.out.println("Du kan köpa en stor hamburgare ich pommes frites");
        }
    }

    public static void if7(){
        // Be användaren att mata in namnet på ett land där den bor. Om det är Sverige,
        // Danmark, eller Norge skall användare informeras att-Du bor i Skandinavien. Om
        // inte meddela användaren att den inte bor i Skandinavien.

        System.out.println("Vilket land bor du i?");
        Scanner myScanner = new Scanner(System.in);
        String inmatatLand = myScanner.nextLine();

        if ((inmatatLand.equalsIgnoreCase("sverige") || inmatatLand.equalsIgnoreCase("norge") || inmatatLand.equalsIgnoreCase("danmark"))) {
            System.out.println("Du bor i Skandinavien");
        }
        else{
            System.out.println("Dui bor INTE i Skandinavien");
        }
    }

    public static void if6(){
        // Be användaren mata in sitt födelseår. Om det är större eller lika med 1980 men
        // mindre än 1990, skriv ut –Du är född på 1980-talet. Om det är mindre än 2000 men
        // större än eller lika med 1990 skriv ut- Du är född på 1990-talet. 
        // Om det är mindre än 1980 eller större än eller lika med 2000, 
        // skriv- Du är inte född på 1990 eller 1980-talen.

        System.out.println("SKriv in ditt födelseår: ");
        Scanner myScanner = new Scanner(System.in);
        int inmatatÅr = myScanner.nextInt();

        if((inmatatÅr >= 1980) && (inmatatÅr < 1990)){
            System.out.println("Du är född på 1980-talet.");
        }
        else if((inmatatÅr < 2000) && (inmatatÅr >= 1990)){
            System.out.println("Du är förr på 1990-talet");
        }
        else if((inmatatÅr < 1980) || (inmatatÅr >= 2000)){
            System.out.println("Du är inte född på 1990 eller 1980-talet");
        }
    }

    public static void if5(){
        // Be användaren ange vilken kategori den tillhör-vuxen, pensionär, student. 
        // Om den är pensionär eller student kostar resan 20 kr . Om den är vuxen kostar resan 30 kr . 
        // Annars skall användaren informeras att den har angett en felaktig kategori.

        System.out.println("Vilken kategori tillhör du? Vuxen, pansionär eller student");
        Scanner myScanner = new Scanner(System.in);
             String inmatadKategori = myScanner.nextLine();
             
                if(inmatadKategori.equalsIgnoreCase("student")){
                    System.out.println("Det kostar 20kr som student");
                }
                else if(inmatadKategori.equalsIgnoreCase("vuxen")){
                    System.out.println("Det kostar 30kr som vuxen");
                }
                else if(inmatadKategori.equalsIgnoreCase("pansionär")){
                    System.out.println("Det kostar 20kr som pansionär");
                }
                else{
                    System.out.println("Felmeddelande! skriv in en av kategorierna!");
                }
         
        
    }

    public static void if4(){
        // Be användaren mata in sin ålder. Om den är mindre än 18 är användaren ej myndig. 
        //Om den är över 65 är den pensionär. Annars är den myndig men inte pensionär. Meddela användaren om vad som gäller beroende på dennes ålder.

        // ÖVERKURS: Kontrollera också att användaren har matat in ett riktigt tal. Har den matat in andra tecken än siffror meddela användaren att den har matat in en felaktig ålder.

        System.out.println("Skriv in din ålder");
        Scanner myScanner = new Scanner(System.in);
        try{
                int inmatadÅlder = myScanner.nextInt();
        
                if(inmatadÅlder < 18){
                    System.out.println("Du är ej myndig");
                }
                else if(inmatadÅlder > 65){
                    System.out.println("Du är pansionär");
                }
                else{
                    System.out.println("Du är myndig");
                }
            } 
        catch (Exception e) {
            System.out.println("FELMEDDELANDE!Skriv in en ålder!");
            }

    }

    public static void if3(){
        // Be användaren mata in temperaturen tagen från en febertermometer. Om tempen är
        // över 37.8 skriv- Du har feber. Om den är över 39.5, skriv - Du bör uppsöka läkare. 
        // Om den är mindre än 37.8 skriv - Du har inte feber.

        System.out.println("Vad är tempen?");
        Scanner myScanner = new Scanner(System.in);
        float inmatadTemp = myScanner.nextFloat();

        if(inmatadTemp > 39.5){
            System.out.println("Du bör uppsöka läkare");
        }
        else if(inmatadTemp > 37.8){
            System.out.println("Du har feber");
        }
        else{
            System.out.println("Du har inte feber!");
        }

    }

    public static void if2(){
        // Be användaren att mata in hur många paket mjölk som finns kvar. Är det mindre än
        // 10, skriv - Beställ 30 paket. Är det mellan 10 och 20 skriv- Beställ 20 paket. Annars
        // skriv-Du behöver inte beställa någon mjölk.

        System.out.println("Hur många mjölkpaket finns det kvar?");
        Scanner myScanner = new Scanner(System.in);
        int inmatatAntal = myScanner.nextInt();

        if (inmatatAntal < 10) {
            System.out.println("Beställ 30 packet!");
        }
        else if(inmatatAntal < 20){
            System.out.println("Beställ 20 paket!");
        }
        else {
            System.out.println("Du behöver inte beställa någon mjölk!");
        }
    }

    public static void if1(){
        // Be användaren att mata in ett tal.
        // Kontrollera om talet är större än 10. Meddela
        // användaren om talet är större än 10- Talet är större än 10. 
        // Om det är mindre än 10 meddela användaren
        // – Talet är mindre än 10

        System.out.println("Vänligen skriv in ett tal!: ");
        Scanner myScanner = new Scanner(System.in);
        int inmatatTal = myScanner.nextInt();
        
        if (inmatatTal > 10) {
            System.out.println("Talet är större än 10");
        }
        else if(inmatatTal < 10){
            System.out.println("Talet är mindre än 10!");
        }
    }
}