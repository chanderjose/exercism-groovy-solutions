class Raindrops {

    def convert(num) {
        String sound = ''

        if(num % 3 == 0) {
            sound = 'Pling'
        }
        if(num % 5 == 0) {
            sound = sound + 'Plang'
        }
        if(num % 7 == 0) {
            sound = sound + 'Plong'
        }

        if(!sound) {
            sound = "$num"
        }

        sound
    }

}
