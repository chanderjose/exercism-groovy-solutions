class Darts {

    static int score(x, y) {
        // Using Pythagorean theorem
        def distance = Math.sqrt ( Math.pow (x, 2) + Math.pow(y, 2))

        int scored
        if(distance <= 1) {
            scored = 10
        } else if (distance > 1 && distance <= 5) {
            scored = 5
        } else if (distance >5 && distance <= 10) {
            scored = 1
        } else {
            scored = 0
        }

        scored
    }
}
