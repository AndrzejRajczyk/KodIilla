package stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    final int userId;
    final String userName;
    final char sex;
    final LocalDate birthDate;
    final int userPostQuantity;
    final int yearOfBirth;
    final int monthOfBirth;
    final int dayOfBirth;


    public ForumUser(int userId, String userName, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int userPostQuantity) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.userPostQuantity = userPostQuantity;
    }

    public String getUserId() {

        return "" + userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getUserPostQuantity() {
        return userPostQuantity;
    }

    public int getAge() {


        LocalDate dateNow = LocalDate.now();

        LocalDate age = dateNow.minusDays(dayOfBirth);
        age = age.minusMonths(monthOfBirth);
        age = age.minusMonths(yearOfBirth);

        return age.getYear();

    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", userPostQuantity=" + userPostQuantity +
                '}';
    }
}


