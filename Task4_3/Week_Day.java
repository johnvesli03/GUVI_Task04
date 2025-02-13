package Task4_3;

import Task4_2.InvalidAge_For_VoterException;

public class Week_Day {
        private static final String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        public static String getDay (int index) throws Invalid_Day_IndexException {

            if (index < 0 || index > 6) {
                throw new Invalid_Day_IndexException("Invalid index! Please enter a value between 0 and 6.");
            }
            return weekdays[index];
        }
    }
