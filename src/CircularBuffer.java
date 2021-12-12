//Vi ønsker at circularBuffer skal ta et array og det arrayet skal gjøres om slik at
// vi begynner å fylle opp, mot slutten av det arrayet så skal vi starte på nytt igjen og bare
// fortsette på å loope på en måte

// Bruksområdet for disse sirkulære bufferne: det er typisk hvis du leser en data og skal avspille samtidig.
// For eksempel en DVD spiller eller på laptopen din: du skal spille av noe fra nett da laster du hele tiden ned så
// fyller du opp bufferet og det du spiller av så tommer du bufferet.


public class CircularBuffer  {

    char [] buffer;
    int size;
    int head; // Peker til startetn av køen
    int tail; // Peker til slutten av køen
    int count; // antall elementer i køen nå
     CircularBuffer(int size){
         this.buffer = new char[size];
         this.size = size;
         this.head = 0;
         this.tail = 0;
         this.count = 0;
     }

     // For et sånn buffer så fungerer det som en kø: en sirkulør kø og for disse køene
     // For disse køene har vi to ting (to oprasjoner):
     //  * Stille oss bakerst til køen når vi kommer inn
     //  * Den som er først i køen som blir behandlet
     // jeg skal da lage to funkjsoner som operer med dette her: legge bakerst og tar ut førest. Når har jeg dette
    //  på plass så er jeg egentlig ferdig med hele dette klassen.

    // La oss starte med den funkjsonen å legge bakerst
    void pushBack(char value) {
         if(count() > size ) {
             throw new IndexOutOfBoundsException();
         }
         buffer[tail] = value;
         tail = (tail+1) % size;
         count++;
    }

    //funksjonen som tar ut først i køen
    char popFront() {
         if(count() <= 0){
             throw new IndexOutOfBoundsException();
         }
         char retVal = buffer[head];
         head = (head+1) % size;
         count = count - 1;
         return retVal;
    }

    int count(){
         return count;
    }

    //For test purposes
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(6);
        char [] values = "ABCDEFGHIJKLMNOPQRSTUVXWYZ".toCharArray();

        //Legg til elementer fra values[] til buffer
        for(int i = 0; i< values.length; ) {
            for (int j = 0; j < 3; j++) {
                buffer.pushBack(values[i + j]);
            }


            //Ta ut alle elementer fra bufferet
            while (buffer.count() > 0) {
                System.out.print(buffer.popFront());
                System.out.println();
            }
            i = i + 3;
        }
    }
}
