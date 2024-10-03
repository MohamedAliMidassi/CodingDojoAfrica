package alfredBot;

import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello Sir/Madam, I am %s. How can I be of service?", name);
    }

    public String guestGreeting(String name, Integer age) {
        return String.format("Hello Sir/Madam, I am %s. How can I be of service? I am %d years old!", name, age);
    }

    public String guestGreetingAlexis(String name, Integer age) {
        String one = "Hi! ";
        String two = String.format("I am the %s of Wayne Manor. ", name);
        String three = String.format("And I have been functional for %d months!", age);
        String all = one.concat(two + three);
        return all;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "Todays date is: " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        int a = conversation.indexOf("Alexis");
        int b = conversation.indexOf("Alfred");

        if (a == -1 && b == -1) {
            return "Right. And with that I shall retire.";
        } else if (b != -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Rigth away Sir! She certainly isn't as sophisticated enough for that.";
        }

    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
}
