package studentRegistration.utils;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtil {

    Faker faker = new Faker();
    String[] gender = {"Male", "Female", "Other"};
    String[] subject = {"Hindi", "English", "Maths", "Physics", "Chemistry", "Biology",
            "Computer Science", "Commerce", "Accounting", "Economics", "Arts",
            "Social Studies", "History", "Civics"};
    String[] hobby = {"Sports", "Reading", "Music"};

    static String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    private static final HashMap<String, String[]> statesAndCities = new HashMap<>();

    static {
        statesAndCities.put(states[0], new String[]{"Delhi", "Gurgaon", "Noida"});
        statesAndCities.put(states[1], new String[]{"Agra", "Lucknow", "Merrut"});
        statesAndCities.put(states[2], new String[]{"Karnal", "Panipat"});
        statesAndCities.put(states[3], new String[]{"Jaipur", "Jaiselmer"});
    }

    private static String stateUtil;


    private static <T> T getRandomValueFromArray(T[] array) {
        return array[ThreadLocalRandom.current().nextInt(0, array.length - 1)];
    }

    private static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public String getRandomFirstName() {
        return faker.name().firstName();
    }

    public String getRandomLastName() {
        return faker.name().lastName();
    }

    public String getRandomEmail() {
        return faker.internet().emailAddress();
    }

    public Address getRandomAddress() {
        return faker.address();
    }

    public String getRandomPhoneNumber(int phoneNumberLength) {
        String phoneNumber = faker.number().digits(phoneNumberLength);
        return phoneNumber;
    }

    public  String getRandomDay() {
        int day = getRandomInt(1, 28);
        if (day < 10) {
            return "0" + day;
        } else {
            return Integer.toString(day);
        }
    }

    public  String getRandomMonth() {
        return getRandomValueFromArray(months);
    }

    public  String getRandomYear() {
        return Integer.toString(getRandomInt(1900, 2010));
    }


    public String getRandomGender() {
        return getRandomValueFromArray(gender);
    }

    public String getRandomSubject() {
        return getRandomValueFromArray(subject);
    }

    public String getRandomHobby() {
        return getRandomValueFromArray(hobby);
    }

    public String getRandomState() {
        stateUtil = getRandomValueFromArray(states);
        return stateUtil;
    }

    public String getRandomCity() {
        String[] cities = statesAndCities.get(stateUtil);
        return getRandomValueFromArray(cities);
    }


}
