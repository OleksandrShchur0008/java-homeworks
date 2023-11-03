package de.ait.SoftwareSocialNetwork;

public class TestSocialNetwork {

    private static SocialNetwork socialNetwork = new SocialNetwork();

    public static void main(String[] args) {

        User userShoni = new User(1, "Shoni");
        User userNikita = new User(2, "Nikita");
        userShoni.addFriend(userNikita);
        userNikita.addFriend(userShoni);
        //User userDima = new User(3, "Dima");
        //User userSasha = new User(4, "Sasha");
        //User userSlavik = new User(5, "Slavik");
        //User userRoma = new User(6, "Roma");
        //userShoni.addFriend(userDima);
        //userShoni.addFriend(userSasha);
        //userShoni.addFriend(userSlavik);
        //userShoni.addFriend(userRoma);

        //SocialNetwork socialNetwork1 = new SocialNetwork();

        //socialNetwork1.registerUser(userShoni.getId(), userShoni.getName());
    }
}
