class Darts {

    static int score(x, y) {
        // Using Pythagorean theorem
        def distance = Math.hypot(x, y)

        int scored = 0
        if(distance <= 1) {
            scored = 10
        } else if (distance > 1 && distance <= 5) {
            scored = 5
        } else if (distance > 5 && distance <= 10) {
            scored = 1
        }

        scored
    }
}
