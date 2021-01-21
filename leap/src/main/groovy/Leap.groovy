class Leap {
    Integer year

    Leap(Integer year) {
        this.year = year
    }

    def isLeapYear() {
        /*
        every year that is evenly divisible by 4
            except every year that is evenly divisible by 100
                unless the year is also evenly divisible by 400
        */
        year % 4 == 0 &&
        (year % 100 != 0 || year % 400 == 0)
    }

}
