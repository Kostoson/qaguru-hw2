package studentregistration.utils;

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

    public String getRandomAddress() {
        return faker.address().fullAddress();
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
        return faker.options().option(months);
    }

    public  String getRandomYear() {
        return Integer.toString(getRandomInt(1900, 2010));
    }


    public String getRandomGender() {
        return faker.options().option(gender);
    }

    public String getRandomSubject() {
        return faker.options().option(subject);
    }

    public String getRandomHobby() {
        return faker.options().option(hobby);
    }

    public String getRandomState() {
        stateUtil = faker.options().option(states);
        return stateUtil;
    }

    public String getRandomCity() {
        String[] cities = statesAndCities.get(stateUtil);
        return faker.options().option(cities);
    }


}
