import java.util.Scanner;

public class Exercises{

    public static void main(String [] args){

        if7();
        // if6();
        // if5();
        // if4();
        // if3();
        // if2();
        // if1();
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