package ie.tudublin;

public class PitchSpeller {
    
    float[] frequencies = {293.66f, 329.63f, 369.99f, 392.00f, 440.00f, 493.88f, 554.37f, 587.33f
        , 659.25f, 739.99f, 783.99f, 880.00f, 987.77f, 1108.73f, 1174.66f};
String[] spellings = {"D,", "E,", "F,", "G,", "A,", "B,", "C", "D", "E", "F", "G", "A", "B","c", "d", "e", "f", "g", "a", "b", "c'", "d'", "e'", "f'", "g'", "a'", "b'", "c''", "d''"};



        public String spell(float frequency){

            int MIndex = -1;
            float MDiff = Float.MAX_VALUE;

            for(int i = 0; i < frequencies.length; i++){

                float diff = Math.abs(frequency - frequencies[i]);
                if (diff < MDiff) {
                    
                    MDiff = diff;
                    MIndex = i;

                }

            }

            return spellings[MIndex];

        } // end spell()

        public static void main(String[] args){

            PitchSpeller ps = new PitchSpeller();
            System.out.println(ps.spell(330));
            System.out.println(ps.spell(420));
            System.out.println(ps.spell(1980));

        } // end main()

}
