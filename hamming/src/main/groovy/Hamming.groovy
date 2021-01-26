class Hamming {

    static def distance(strand1, strand2) {
        if(strand1?.length() != strand2?.length()) {
            throw new ArithmeticException('Lengths are not equals')
        }

        int count = 0
        strand1.eachWithIndex { strand1Char, index ->
            if(strand1Char != strand2.charAt(index)) {
                count++
            }
        }

        count
    }

}